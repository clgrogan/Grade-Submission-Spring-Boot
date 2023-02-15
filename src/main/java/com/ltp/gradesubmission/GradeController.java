package com.ltp.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {

  @GetMapping("/hello") //One argument, the path
  public String sayHello() {
    // The string returned is the name of a file in the
    // Resources templates directory
    return "form.html";
  }
  @GetMapping("/grades")
  public String getGrades(Model model){
    Grade grade = new Grade("Harry", "Potions", "C-");
    model.addAttribute("grade", grade);
    return "grades";
  }
  
}
