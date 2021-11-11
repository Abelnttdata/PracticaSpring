package com.example.SpringBootNtt.Controller;

import com.example.SpringBootNtt.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    @Autowired
    private StudentService service;

    @GetMapping("/homepage")
    public String homepage(Model model){
        //model.addAllAttributes("student");
        model.addAttribute("yoSoy", "batman");
        return "home";
    }

    @GetMapping("/studentslist")
    public String studentsList(Model model){
        //model.addAllAttributes("student");
        model.addAttribute("students", service.getList());
        return "students";
    }

}
