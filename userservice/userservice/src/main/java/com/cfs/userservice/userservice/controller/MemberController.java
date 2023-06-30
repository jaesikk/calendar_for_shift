package com.cfs.userservice.userservice.controller;


import com.cfs.userservice.userservice.Dto.MemberPostDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member-service")
public class MemberController {

    @GetMapping("/test")
    public String test(){

        return "test Ok";
    }

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody MemberPostDto memberPostDto){


        return new ResponseEntity(memberPostDto, HttpStatus.OK);
    }

}
