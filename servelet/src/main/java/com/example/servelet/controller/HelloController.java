package com.example.servelet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.servelet.Alien;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HelloController {
    
    @GetMapping("/hello")
    public String sayHello(){
        return "index";
    }
   @GetMapping("/alien")
    public String sendAlien(){
        return "alien";
    }
    @GetMapping("/add")
    public ModelAndView calculate(HttpServletRequest req, ModelAndView mv){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
          int sum = num1 + num2;

           mv.addObject("result", sum);
           mv.setViewName("result");


        return mv;
    }

      @GetMapping("/addAlien")
      public String addAlien( Alien alien){ 
       return "alienresult";
    }
}
