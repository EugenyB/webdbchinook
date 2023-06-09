package com.example.webdbchinook.controllers;

import com.example.webdbchinook.beans.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService es;

    @GetMapping("/employees")
    public String employees(Model model) {
        model.addAttribute("employees", es.getSimpleEmployees());
        return "employees";
    }
}
