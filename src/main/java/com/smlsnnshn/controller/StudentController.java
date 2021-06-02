package com.smlsnnshn.controller;

import com.smlsnnshn.dto.StudentDTO;
import com.smlsnnshn.enums.Country;
import com.smlsnnshn.enums.Gender;
import com.smlsnnshn.enums.StudentStatus;
import com.smlsnnshn.enums.StudentWorkingStatus;
import com.smlsnnshn.service.GroupService;
import com.smlsnnshn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    GroupService groupService;

    @GetMapping("/createStudent")
    public String createStudent(Model model){

        model.addAttribute("student",new StudentDTO());
        model.addAttribute("students", studentService.listAllStudents());
        model.addAttribute("groups",groupService.listAllGroups());

        List<Country> countries = Arrays.asList(Country.values());
        model.addAttribute("countries",countries);

        List<Gender> genders = Arrays.asList(Gender.values());
        model.addAttribute("genders",genders);

        List<StudentWorkingStatus> studentWorkingStatuses = Arrays.asList(StudentWorkingStatus.values());
        model.addAttribute("studentWorkingStatuses",studentWorkingStatuses);

        List<StudentStatus> studentStatuses = Arrays.asList(StudentStatus.values());
        model.addAttribute("studentStatuses",studentStatuses);

        return "/student/createStudent";

    }

    @PostMapping("/createStudent")
    public String insertStudent(StudentDTO studentDTO){

        studentService.save(studentDTO);
        return "redirect:/student/createStudent";

    }

    @GetMapping("/updateStudent/{email}")
    public String updateStudent(@PathVariable("email") String email, Model model){

        model.addAttribute("student",studentService.findByEmail(email));
        model.addAttribute("students",studentService.listAllStudents());
        model.addAttribute("groups",groupService.listAllGroups());

        List<Country> countries = Arrays.asList(Country.values());
        model.addAttribute("countries",countries);

        List<Gender> genders = Arrays.asList(Gender.values());
        model.addAttribute("genders",genders);

        List<StudentWorkingStatus> studentWorkingStatuses = Arrays.asList(StudentWorkingStatus.values());
        model.addAttribute("studentWorkingStatuses",studentWorkingStatuses);

        List<StudentStatus> studentStatuses = Arrays.asList(StudentStatus.values());
        model.addAttribute("studentStatuses",studentStatuses);

        return "/student/updateStudent";

    }

    @PostMapping("/updateStudent/{email}")
    public String updateStudent(@PathVariable("email") String email, StudentDTO studentDTO, Model model){
        studentService.update(studentDTO);
        return "redirect:/student/createStudent";
    }

    @GetMapping("/deleteStudent/{email}")
    public String deleteStudent(@PathVariable("email") String email){
        studentService.delete(email);
        return "redirect:/student/createStudent";
    }

    @GetMapping("/showStudent/{email}")
    public String showStudent(@PathVariable("email") String email, Model model){
        model.addAttribute("student",studentService.findByEmail(email));
        return "/student/showStudent";
    }

}
