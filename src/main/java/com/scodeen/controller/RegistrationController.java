package com.scodeen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
	
    @GetMapping("/registercandidate")
    public String registerCandidate() {

        return "Success";    
        }
}
