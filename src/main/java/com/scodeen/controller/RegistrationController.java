package com.scodeen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class RegistrationController {
	
    @PostMapping("/registercandidate")
    public String registerCandidate(@RequestBody String action) {

        return "Success";    
        }
}
