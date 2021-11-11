package com.example.SpringBootNtt.Controller;

import com.example.SpringBootNtt.Entity.Student;
import com.example.SpringBootNtt.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/{nombre}")
    public String holaMundo(@PathVariable String nombre){
        return "Hola mundio " + nombre;
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @GetMapping("/byname/{myname}")
    public Student getStudentByName(@PathVariable("myname") String name){
        return service.getStudent(name);
    }



}
