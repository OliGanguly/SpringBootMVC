package com.example.springmvc.Controller;



import com.example.springmvc.entities.User;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {



    //common things

    @RequestMapping(value = {"/","","/contact"})
    public String showForm(Model model){
        /*if u want to use this in success page as well
        * line repetative things
        * */

        return "contact";
    }
//    @ModelAttribute
//    public void coominData(Model model){
//
//        model.addAttribute("header","Registration Form");
//    }


    /*
     * get data from view to controller
     * two ways
     * 1.@RequestParam (get data one by one)
     * 2.@ModelAttribute(get data in form of a object)
     * */

/*
*     @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String processForm(@RequestParam("email") String email,
                              @RequestParam("name") String name,
                              @RequestParam("password") String password,
                              Model model){
            model.addAttribute("name",name);
            model.addAttribute("email",email);
            model.addAttribute("password",password);
        return "success";
    }
* */
//@RequestMapping(path = "/processform",method = RequestMethod.POST)
//public String processForm(@RequestParam( name = "email" , required = true) String email,
//                          @RequestParam("name") String name,
//                          @RequestParam("password") String password,
//                          Model model){
//    model.addAttribute("name",name);
//    model.addAttribute("email",email);
//    model.addAttribute("password",password);
//    return "success";
//}



   /*
   *  using @Request param - by creating model class
    @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String processForm(@RequestParam("email") String email,
                              @RequestParam("name") String name,
                              @RequestParam("password") String password,
                              Model model){
        User u=new User();
        u.setName(name);
        u.setEmail(email);
        u.setPassword(password);

        model.addAttribute("user",u);
        return "success";
    }
   * */


    /*
    * ModelAttribute is going to map  User class object to the data coming from view
    * so User class fields name should be mapped with the name of the data coming from view
    * ModelAttribute map view data to user and pass it to model class
    * no need to do model.addAttribute()
    * */
    @RequestMapping(path="/processform",method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model){
        //if u want to use this in success page as well
        //model.addAttribute("header","Registration Form");
        return "success";
    }
    @RequestMapping("/user/{userId}")
    public String example(@PathVariable int userId){
        System.out.println("userId :"+ userId);
        return "success";
    }



}
/* @RequryParam
* Map query parameter , which backend append at the end of the url
* @RequestParam (required=true) boolean festival
* http://localhost:8080/holidays?feveral=true&festival=false
*
* plus @ReqParam map form data coming from view to controller
* @RequestParam ("email") String email
*
* */

/*
 * @PathVariable- extract value from URl
 * http://localhost:8080/holidays/all
 * http://localhost:8080/holidays/feveral
 *
 * @GetMapping("/holidays/{display}")
 * public String displayHolidays(@Pathvariable String display){
 * }
 * */

/*
* Query parameter = our database - backend append parameter at the end of the url = conditions
* http://localhost:8080/products?order=popular&filter=new
*
* path variable = mentioning variable in url path
* this value keep on changing based on my requirment I can change it
* http://localhost:8080/products/popular
* http://localhost:8080/products/popular/new
* */

//    @RequestMapping("/book/{id}")
//    public String handler(@PathVariable ("id")int id){
//
//    }





