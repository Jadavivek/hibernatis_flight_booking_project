package com.example.college.controller;

import com.example.college.model.Student;
import com.example.college.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final StudentService service;

    public AdminController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/home")
    public String adminHome() {
        return "admin";
    }

    @GetMapping("/add")
    public String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        service.save(student);
        return "redirect:/admin/view";
    }

    @GetMapping("/view")
    public String viewStudents(Model model) {
        model.addAttribute("students", service.getAll());
        return "view-students";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/admin/view";
    }
}
