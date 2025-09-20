package com.example.backend_assignment.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SolverService {

    // Existing Template 1 Problem
    public Map<String, String> getTemplate1Solution() {
        Map<String, String> solution = new HashMap<>();
        solution.put("Step1Diff", "5");
        solution.put("Step2Equation", "AC^2 = AB^2 + BC^2");
        solution.put("Step2Result", "AC = 13");
        solution.put("SecCTop", "13");
        solution.put("SecCBottom", "12");
        solution.put("CotATop", "5");
        solution.put("CotABottom", "12");
        solution.put("Answer", "2.08");
        solution.put("AB", "12");
        solution.put("BC", "5");
        solution.put("AC", "13");
        solution.put("SecCFormulaTop", "AC");
        solution.put("SecCFormulaBottom", "BC");
        solution.put("CotAFormulaTop", "AB");
        solution.put("CotAFormulaBottom", "BC");
        return solution;
    }

    // New Template 1 Problem
    public Map<String, String> getTemplate1SolutionQ2() {
        Map<String, String> solution = new HashMap<>();
        solution.put("Step1Diff", "6");
        solution.put("Step2Equation", "AC^2 = AB^2 + BC^2");
        solution.put("Step2Result", "AC = 10");
        solution.put("SecCTop", "10");
        solution.put("SecCBottom", "8");
        solution.put("CotATop", "6");
        solution.put("CotABottom", "8");
        solution.put("Answer", "1.25");
        solution.put("AB", "8");
        solution.put("BC", "6");
        solution.put("AC", "10");
        solution.put("SecCFormulaTop", "AC");
        solution.put("SecCFormulaBottom", "BC");
        solution.put("CotAFormulaTop", "AB");
        solution.put("CotAFormulaBottom", "BC");
        return solution;
    }

    // Existing Template 2 Problem
    public Map<String, String> getTemplate2Solution() {
        Map<String, String> solution = new HashMap<>();
        solution.put("Principal", "5000");
        solution.put("Rate", "5%");
        solution.put("Time", "2");
        solution.put("Amount", "6050");
        return solution;
    }

    // New Template 2 Problem
    public Map<String, String> getTemplate2SolutionQ2() {
        Map<String, String> solution = new HashMap<>();
        solution.put("Principal", "10000");
        solution.put("Rate", "10%");
        solution.put("Time", "3");
        solution.put("Amount", "13310"); // Calculated using CI formula
        return solution;
    }
}
