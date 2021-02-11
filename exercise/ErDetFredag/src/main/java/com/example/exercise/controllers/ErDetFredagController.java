package com.example.exercise.controllers;

import com.example.exercise.services.ErDetFredag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErDetFredagController {
    
    ErDetFredag fredag = new ErDetFredag();
    @ResponseBody
    @GetMapping("fredag")
    public String erDetFredagController(){
        return fredag.fredagPlease();
    }
}
