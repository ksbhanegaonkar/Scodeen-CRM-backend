package com.scodeen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scodeen.entity.CandidateDetails;

public interface CandidateDetailsRepo extends JpaRepository<CandidateDetails, Integer>{
	CandidateDetails getCandidateDetailsByCandidateId(int candidateId);
}
