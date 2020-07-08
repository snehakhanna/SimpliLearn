package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// It is used to mark Control class as web request handler
@Controller
public class Control {

    // Handles HTTP get requests
    @GetMapping("/feedback")
    public String feedback() {
        return "feedback";
    }
}