package com.scodeen;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.scodeen.entity.CRMUser;
import com.scodeen.entity.City;
import com.scodeen.entity.Country;
import com.scodeen.entity.State;
import com.scodeen.repository.CRMUserRepo;
import com.scodeen.repository.CityRepo;
import com.scodeen.repository.CountryRepo;
import com.scodeen.repository.StateRepo;
import com.scodeen.repository.TestUserRepo;

@SpringBootApplication
public class ScodeenCrmBackendApplication implements CommandLineRunner {

	@Autowired
	TestUserRepo userRepo;
	@Autowired
	CRMUserRepo crmUserRepo;
	@Autowired
	CityRepo cityRepo;
	@Autowired
	StateRepo stateRepo;
	@Autowired
	CountryRepo countryRepo;

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

		Country country = new Country();
		country.setCountryName("India");
		country.setRemarks("Very good");
		country.setCreatedOn(new Date(System.currentTimeMillis()));
		country.setModifiedOn(new Date(System.currentTimeMillis()));
		country.setCreatedBy(15);
		country.setModifiedBy(15);
		countryRepo.save(country);

		State state = new State();
		state.setCountryId(country.getId());
		state.setStateName("Maharashtra");
		state.setRemarks("Very good");
		state.setCreatedOn(new Date(System.currentTimeMillis()));
		state.setModifiedOn(new Date(System.currentTimeMillis()));
		state.setCreatedBy(15);
		state.setModifiedBy(15);
		stateRepo.save(state);

		City city = new City();
		city.setStateId(state.getId());
		city.setCityName("Pune");
		city.setPincode("411040");
		city.setRemarks("Very good");
		city.setCreatedOn(new Date(System.currentTimeMillis()));
		city.setModifiedOn(new Date(System.currentTimeMillis()));
		city.setCreatedBy(15);
		city.setModifiedBy(15);
		cityRepo.save(city);

		CRMUser crmUser = new CRMUser();

		crmUser.setLastName("Bhanegaonkar");
		crmUser.setFirstName("KedarNew");
		crmUser.setMiddleName("Sudhir");
		crmUser.setUserName("kedarbh");
		crmUser.setPassword("Welcome@01");
		crmUser.setContactNumber("11111111111");
		crmUser.setEmail("test@ema");
		crmUser.setCityId(city.getId());
		crmUser.setRemarks("Very good");
		crmUser.setCreatedOn(new Date(System.currentTimeMillis()));
		crmUser.setModifiedOn(new Date(System.currentTimeMillis()));
		crmUser.setCreatedBy(15);
		crmUser.setModifiedBy(15);
		crmUserRepo.save(crmUser);

	}

}
