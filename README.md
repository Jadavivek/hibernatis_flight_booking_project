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

    // HOME
    @GetMapping("/home")
    public String home() {
        return "admin";
    }

    // CREATE
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

    // READ
    @GetMapping("/view")
    public String viewStudents(Model model) {
        model.addAttribute("students", service.getAll());
        return "view-students";
    }

    // DELETE
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/admin/view";
    }

    // 🔥 UPDATE (NEW)
    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        Student student = service.getById(id);
        model.addAttribute("student", student);
        return "update-student";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student student) {
        service.save(student); // save() works for update also
        return "redirect:/admin/view";
    }
}
