package com.example.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
    @RequestMapping(value = {"/","","/contact"})
    public String showForm(){
        return "contact";
    }
    @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String processForm(@RequestParam("email") String email,
                              @RequestParam("name") String name,
                              @RequestParam("password") String password,
                              Model model){
            model.addAttribute("name",name);
            model.addAttribute("email",email);
            model.addAttribute("password",password);
        return "success";
    }
}
