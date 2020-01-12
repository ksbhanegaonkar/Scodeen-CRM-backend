package com.scodeen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scodeen.entity.Batch;

public interface BatchRepo extends JpaRepository<Batch, Integer>{
	Batch getBatchByBatchId(int batchId);
	Batch getBatchByBatchName(String batchName);
	//List<Batch> findAllByBatchName(List<String> batchNames);
}
