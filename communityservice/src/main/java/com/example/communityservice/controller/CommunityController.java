package com.example.communityservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/community-service")
public class CommunityController {


  @GetMapping("/welcome")
  public String welcome(){
    return "Welcome to the Community service.";
  }


  @GetMapping("/message")
  public String message(@RequestHeader("community-request") String header){
    System.out.println(header);
    return "Hello World in Community service";
  }
}
