package com.scodeen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.scodeen.service.CandidateDetailsService;
import com.scodeen.util.JsonUtil;

@RestController
public class CandidateDetailsController {
	@Autowired
	CandidateDetailsService candidateDetailsService;
	
    @PostMapping("/registercandidate")
    public String registerCandidate(@RequestBody ObjectNode candidateData) {
    	candidateDetailsService.registerCandidate(JsonUtil.getCandidateDetailsFromRequest(candidateData));
        return "Success";    
        }
}
