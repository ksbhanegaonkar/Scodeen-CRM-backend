package com.scodeen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scodeen.entity.CRMUser;
import com.scodeen.repository.CRMUserRepo;

@Component
public class CRMUserService {
	@Autowired
	private CRMUserRepo crmUserRepo;
	
	public void addCRMUser(CRMUser crmUser) {
		crmUserRepo.save(crmUser);
	}
	
	public void testAdUser() {
		System.out.println("User added !!");
	}
}
