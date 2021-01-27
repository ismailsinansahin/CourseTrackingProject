package com.smlsnnshn.controller;

import com.smlsnnshn.dto.MentorDTO;
import com.smlsnnshn.enums.Country;
import com.smlsnnshn.enums.Gender;
import com.smlsnnshn.enums.MentorWorkingStatus;
import com.smlsnnshn.service.MentorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/mentor")
public class MentorController {

    MentorService mentorService;

    public MentorController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @GetMapping("/createMentor")
    public String createMentor(Model model){

        model.addAttribute("mentor",new MentorDTO());
        model.addAttribute("mentors",mentorService.listAllMentors());

        List<Country> countries = Arrays.asList(Country.values());
        model.addAttribute("countries",countries);

        List<Gender> genders = Arrays.asList(Gender.values());
        model.addAttribute("genders",genders);

        List<MentorWorkingStatus> mentorWorkingStatuses = Arrays.asList(MentorWorkingStatus.values());
        model.addAttribute("mentorWorkingStatuses",mentorWorkingStatuses);

        return "/mentor/createMentor";

    }

    @PostMapping("/createMentor")
    public String insertMentor(MentorDTO mentorDTO){

        mentorService.save(mentorDTO);
        return "redirect:/mentor/createMentor";

    }

    @GetMapping("/updateMentor/{email}")
    public String updateMentor(@PathVariable("email") String email, Model model){

        model.addAttribute("mentor",mentorService.findByEmail(email));
        model.addAttribute("mentors",mentorService.listAllMentors());

        List<Country> countries = Arrays.asList(Country.values());
        model.addAttribute("countries",countries);

        List<Gender> genders = Arrays.asList(Gender.values());
        model.addAttribute("genders",genders);

        List<MentorWorkingStatus> mentorWorkingStatuses = Arrays.asList(MentorWorkingStatus.values());
        model.addAttribute("mentorWorkingStatuses",mentorWorkingStatuses);

        return "/mentor/updateMentor";

    }

    @PostMapping("/updateMentor/{email}")
    public String updateMentor(@PathVariable("email") String email, MentorDTO mentorDTO, Model model){

        mentorService.update(mentorDTO);
        return "redirect:/mentor/createMentor";

    }

    @GetMapping("/deleteMentor/{email}")
    public String deleteMentor(@PathVariable("email") String email){

        mentorService.delete(email);
        return "redirect:/mentor/createMentor";

    }

}
