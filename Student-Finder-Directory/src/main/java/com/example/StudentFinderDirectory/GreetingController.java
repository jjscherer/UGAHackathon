package com.example.StudentFinderDirectory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/sub")
    public String greetingForm(Model model) {
      model.addAttribute("greeting", new Greeting());
      return "greeting";
    }
  
    @PostMapping("/sub")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
      model.addAttribute("greeting", greeting);
      return "result";
    }
  
  }
