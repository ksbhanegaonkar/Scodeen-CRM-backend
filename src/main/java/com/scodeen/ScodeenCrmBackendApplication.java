package com.scodeen;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.scodeen.entity.CRMUser;
import com.scodeen.repository.CRMUserRepo;
import com.scodeen.repository.TestUserRepo;


@SpringBootApplication
public class ScodeenCrmBackendApplication implements CommandLineRunner{
	
	@Autowired
	TestUserRepo userRepo;
	@Autowired
	CRMUserRepo crmUserRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ScodeenCrmBackendApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		/*
		 * TestUser user = new TestUser();
		 * 
		 * user.setAge(11); user.setName("abfdgdfgc");
		 * 
		 * userRepo.save(user);
		 */
		
		CRMUser crmUser = new CRMUser();
		
		crmUser.setLastName("Bhanegaonkar");
		crmUser.setFirstName("KedarNew");
		crmUser.setMiddleName("Sudhir");
		crmUser.setUserName("kedarbh");
		crmUser.setPassword("Welcome@01");
		crmUser.setContactNumber("11111111111");
		crmUser.setEmail("test@ema");
		crmUser.setCityId(1);
		crmUser.setRemarks("Very good");
		crmUser.setCreatedOn(new Date(System.currentTimeMillis()));
		crmUser.setModifiedOn(new Date(System.currentTimeMillis()));
		crmUser.setCreatedBy(15);
		//crmUser.setModifiedOn(15);
		crmUserRepo.save(crmUser);
		
	}
	
	

}
