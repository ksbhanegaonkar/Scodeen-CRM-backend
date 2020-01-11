package com.scodeen.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scodeen.entity.Batch;
import com.scodeen.entity.CandidateDetails;
import com.scodeen.model.CandidateSearchModel;
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
	
	public List<CandidateSearchModel> searchCandidates(String fname,String lname,List<String> batches){
		List<CandidateSearchModel> list = new ArrayList<>();
		
		for(String batchName : batches) {
			for(CandidateDetails c : batchRepo.getBatchByBatchName(batchName).getCandidates()) {
				list.add(new CandidateSearchModel(c.getFirstName()+" "+c.getLastName(), batchName, c.getIsRegistered()));
			};
		}
		if(fname != null)
			list = list.parallelStream().filter(c -> c.getName().toUpperCase().contains(fname.toUpperCase())).collect(Collectors.toList());
		if(lname != null)
			list = list.parallelStream().filter(c -> c.getName().toUpperCase().contains(lname.toUpperCase())).collect(Collectors.toList());
		return list;
	}
}
