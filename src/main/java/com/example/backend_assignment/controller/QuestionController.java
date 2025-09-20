package com.example.backend_assignment.controller;

import com.example.backend_assignment.service.SolverService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {

    private final SolverService solverService;

    public QuestionController(SolverService solverService) {
        this.solverService = solverService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("solution", solverService.getTemplate1Solution());
        return "template1"; // Default landing page
    }

    // Template 1 Problems
    @GetMapping("/template1")
    public String template1(Model model) {
        model.addAttribute("solution", solverService.getTemplate1Solution());
        return "template1";
    }

    @GetMapping("/template1Q2")
    public String template1Q2(Model model) {
        model.addAttribute("solution", solverService.getTemplate1SolutionQ2());
        return "template1";
    }

    // Template 2 Problems
    @GetMapping("/template2")
    public String template2(Model model) {
        model.addAttribute("solution", solverService.getTemplate2Solution());
        return "template2";
    }

    @GetMapping("/template2Q2")
    public String template2Q2(Model model) {
        model.addAttribute("solution", solverService.getTemplate2SolutionQ2());
        return "template2";
    }
}
