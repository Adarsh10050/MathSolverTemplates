# MathSolverTemplates

## Description
MathSolverTemplates is a Spring Boot web application that provides interactive solutions for mathematical problems using pre-designed front-end templates.  
- **Template 1:** Trigonometry / Pythagorean Triplets (linear steps and arithmetic breakdown)  
- **Template 2:** Compound Interest / Interest-based questions (repeated multiplication / powers)

The application uses **Thymeleaf templates** for dynamic rendering of calculations while keeping the fixed layout intact.

## Features
- Solve problems step by step using visual templates  
- Pre-set arrows, boxes, and logical flow maintained  
- Interactive display of fractions, number boxes, variable boxes, and highlighted results  
- Two templates for different types of math problems

## How to Run
1. Open the project in **Eclipse** or **IntelliJ IDEA**.  
2. Ensure **Maven dependencies** are installed.  
3. Run `BackendAssignmentApplication.java` as a **Spring Boot application**.  
4. Open your browser and access the following URLs:  
   - [http://localhost:8080/template1](http://localhost:8080/template1) – Trigonometry solutions (Template 1)  
   - [http://localhost:8080/template2](http://localhost:8080/template2) – Interest-based solutions (Template 2)
     
## Screenshots
<img width="1773" height="870" alt="Screenshot 2025-09-20 234930" src="https://github.com/user-attachments/assets/b9f003ab-0513-49a6-9916-2e5dc5d9eb24" />


## Technologies Used
- Java 21  
- Spring Boot 3.5.6  
- Thymeleaf  
- HTML / CSS / JS  
- Maven  

## Project Structure
src/
├─ main/
│ ├─ java/com/example/backend_assignment/
│ │ ├─ BackendAssignmentApplication.java
│ │ ├─ controller/QuestionController.java
│ │ └─ service/SolverService.java
│ └─ resources/
│ ├─ static/ (css, images)
│ └─ templates/ (template1.html, template2.html)


## Notes
- Do **not** modify the structure of templates or CSS. Only replace numbers and calculation steps.  
- Maintain the logic flow with pre-set arrows, boxes, and highlights.  
- Ensure screenshots are included for submission verification.
