package com.smlsnnshn.controller;

import com.smlsnnshn.dto.BatchDTO;
import com.smlsnnshn.service.BatchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/batch")
public class BatchController {

    private BatchService batchService;

    public BatchController(BatchService batchService){
        this.batchService=batchService;
    }

    @GetMapping("/createBatch")
    public String createBatch(Model model){

        model.addAttribute("batch", new BatchDTO());
        model.addAttribute("batches",batchService.listAllBatches());
        return "/batch/createBatch";

    }

    @PostMapping("/createBatch")
    public String insertBatch(BatchDTO batchDTO){

        batchService.save(batchDTO);
        return "redirect:/batch/createBatch";

    }

}
