package com.example.calendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {

    @RequestMapping("/usr/calendar/main")
    @ResponseBody
    public String showMain(){

        return "This is Calendar Main";
    }
}
