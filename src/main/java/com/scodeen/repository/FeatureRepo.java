package com.scodeen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scodeen.entity.ApplicationFeature;

public interface FeatureRepo extends JpaRepository<ApplicationFeature, Integer>{
	ApplicationFeature getApplicationFeatureByFeatureId(int featureId);
}
