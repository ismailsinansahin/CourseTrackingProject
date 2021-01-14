package com.smlsnnshn.controller;

import com.smlsnnshn.dto.BatchDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/batch")
public class BatchController {

    @GetMapping("/showBatch")
    public String showBatch(){
        return "/batch/showBatch";
    }

    @GetMapping("/createBatch")
    public String createBatch(Model model){
        model.addAttribute("batch", new BatchDTO());
        return "/batch/createBatch";
    }

}
