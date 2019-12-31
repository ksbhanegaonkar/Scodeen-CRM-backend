package com.scodeen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scodeen.entity.CRMUser;

public interface CRMUserRepo extends JpaRepository<CRMUser,Integer>{
	public CRMUser getUserByUserId(int userId);
	public CRMUser getUserByUserName(String userName);
}
