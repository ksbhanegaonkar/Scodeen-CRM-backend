package com.scodeen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scodeen.entity.CandidateDetails;
import com.scodeen.repository.CandidateDetailsRepo;
import com.scodeen.util.EmailUtil;
import com.scodeen.util.SMSUtil;

@Component
public class CandidateDetailsService {
	
	@Autowired
	CandidateDetailsRepo candidateDetailsRepo;
	
	public void registerCandidate(CandidateDetails candidateDetails) {
		//candidateDetailsRepo.save(candidateDetails);
		SMSUtil.sendSMS("You are registered for batch", candidateDetails.getContactNumber());
		EmailUtil.sendMail(candidateDetails.getEmail(), "Registered for batch", "Dear candidate, you are registered for batch");
	}
}
