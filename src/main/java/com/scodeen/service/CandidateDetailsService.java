package com.scodeen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scodeen.entity.CandidateDetails;
import com.scodeen.repository.CandidateDetailsRepo;

@Component
public class CandidateDetailsService {
	
	@Autowired
	CandidateDetailsRepo candidateDetailsRepo;
	
	public void registerCandidate(CandidateDetails candidateDetails) {
		candidateDetailsRepo.save(candidateDetails);
	}
}
