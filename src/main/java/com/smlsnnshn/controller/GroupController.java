package com.smlsnnshn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/group")
public class GroupController {

    @GetMapping("/createGroup")
    public String createGroup(){
        return "/group/createGroup";
    }

}
