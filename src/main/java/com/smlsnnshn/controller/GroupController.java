package com.smlsnnshn.controller;

import com.smlsnnshn.dto.GroupDTO;
import com.smlsnnshn.service.BatchService;
import com.smlsnnshn.service.GroupService;
import com.smlsnnshn.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/group")
public class GroupController {

    @Autowired
    BatchService batchService;
    @Autowired
    MentorService mentorService;
    @Autowired
    GroupService groupService;

    @GetMapping("/createGroup")
    public String createGroup(Model model){

        model.addAttribute("group", new GroupDTO());
        model.addAttribute("batches", batchService.listAllBatches());
        model.addAttribute("mentors", mentorService.listAllMentors());
        model.addAttribute("groups", groupService.listAllGroups());
        return "/group/createGroup";

    }

    @PostMapping("/createGroup")
    public String insertGroup(GroupDTO groupDTO){

        groupService.save(groupDTO);
        return "redirect:/group/createGroup";

    }

    @GetMapping("/updateGroup/{groupName}")
    public String updateGroup(@PathVariable("groupName") String groupName, Model model){

        model.addAttribute("group",groupService.findByGroupName(groupName));
        model.addAttribute("groups",groupService.listAllGroups());
        return "/group/updateGroup";

    }

    @PostMapping("/updateGroup/{groupName}")
    public String updateGroup(@PathVariable("groupName") String groupName, GroupDTO groupDTO, Model model){

        groupService.update(groupDTO);
        return "redirect:/group/creteGroup";

    }

    @GetMapping("/showGroup")
    public String showGroup(){
        return "/group/showGroup";
    }

}
