package com.scodeen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scodeen.entity.Batch;
import com.scodeen.entity.CandidateDetails;
import com.scodeen.repository.BatchRepo;
import com.scodeen.repository.CandidateDetailsRepo;
import com.scodeen.util.EmailUtil;
import com.scodeen.util.SMSUtil;

@Component
public class CandidateDetailsService {
	
	@Autowired
	CandidateDetailsRepo candidateDetailsRepo;
	@Autowired
	BatchRepo batchRepo;
	
	public void registerCandidate(CandidateDetails candidateDetails) {
		candidateDetailsRepo.save(candidateDetails);
		SMSUtil.sendSMS("You are registered for batch", candidateDetails.getContactNumber());
		EmailUtil.sendMail(candidateDetails.getEmail(), "Registered for batch", "Dear candidate, you are registered for batch");
	}
	
	public List<Batch> getBatchList() {
		return batchRepo.findAll();
	}
	
	public List<CandidateDetails> searchCandidates(String fname,String lname, String mname,List<Batch> batches){
		
		return null;
	}
}
