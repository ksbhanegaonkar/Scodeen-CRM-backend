package com.scodeen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.scodeen.service.CandidateDetailsService;
import com.scodeen.util.JsonUtil;

@RestController
@RequestMapping("/services")
public class CandidateDetailsController {
	@Autowired
	CandidateDetailsService candidateDetailsService;
	
    @PostMapping("/registercandidate")
    public String registerCandidate(@RequestBody ObjectNode candidateData) {
    	candidateDetailsService.registerCandidate(JsonUtil.getCandidateDetailsFromRequest(candidateData));
        return "Success";    
        }
    
    @GetMapping(value = "/getcandidatedetails/{id}")
    public String getCandidateDetails(@PathVariable int id) {
    	
        return "Candidate id is :::"+id;    
        }
    
    @GetMapping(value = "/getbatchlist")
    public ArrayNode getBatchList() {
    	return JsonUtil.getBatchJsonListFromBatchList(candidateDetailsService.getBatchList());
    }
    
    @PostMapping("/searchcandidate")
    public String searchCandidate(@RequestBody ObjectNode c) {
    	String fName = c.get("fname").asText();
    	String lName = c.get("lname").asText();
    	ArrayNode batches = (ArrayNode) c.get("batches");
        return "Success";    
     }
}
