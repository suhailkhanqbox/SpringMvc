package main.java.controller;

import main.java.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DisplayController{

    @RequestMapping("/Ques1")
    public ModelAndView displayDetail(){
        User user1=new User();
        user1.setId(10);
        user1.setName("suti");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("display.jsp");
        modelAndView.addObject("user",user1);
        return modelAndView;
    }

}