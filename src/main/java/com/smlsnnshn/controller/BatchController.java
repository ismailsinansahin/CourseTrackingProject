package com.smlsnnshn.controller;

import com.smlsnnshn.dto.BatchDTO;
import com.smlsnnshn.service.BatchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/updateBatch/{batchName}")
    public String updateBatch(@PathVariable("batchName") String batchName, Model model){

        model.addAttribute("batch",batchService.findByBatchName(batchName));
        model.addAttribute("batches",batchService.listAllBatches());
        return "/batch/updateBatch";

    }

    @PostMapping("/updateBatch/{batchName}")
    public String updateBatch(@PathVariable("batchName") String batchName, BatchDTO batchDTO, Model model){

        batchService.update(batchDTO);
        return "redirect:/batch/creteBatch";

    }

}
