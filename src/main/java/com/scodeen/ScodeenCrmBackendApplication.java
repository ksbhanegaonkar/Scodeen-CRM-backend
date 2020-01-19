package com.scodeen;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.scodeen.entity.Batch;
import com.scodeen.entity.CandidateDetails;
import com.scodeen.entity.PaymentDetails;
import com.scodeen.repository.BatchRepo;
import com.scodeen.repository.CRMUserRepo;
import com.scodeen.repository.CandidateDetailsRepo;
import com.scodeen.repository.CourseRepo;
import com.scodeen.repository.FeatureRepo;
import com.scodeen.repository.PaymentDetailRepo;
import com.scodeen.repository.TestUserRepo;

@SpringBootApplication
public class ScodeenCrmBackendApplication implements CommandLineRunner {

	@Autowired
	TestUserRepo userRepo;
	@Autowired
	CRMUserRepo crmUserRepo;
	@Autowired
	BatchRepo batchRepo;
	@Autowired
	CourseRepo courseRepo;
	@Autowired
	FeatureRepo featureRepo;
	@Autowired
	PaymentDetailRepo paymentDetailRepo;
	@Autowired
	CandidateDetailsRepo candidateDetailsRepo;

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

//		Country country = new Country();
//		country.setCountryName("India");
//		country.setRemarks("Very good");
//		country.setCreatedOn(new Date(System.currentTimeMillis()));
//		country.setModifiedOn(new Date(System.currentTimeMillis()));
//		country.setCreatedBy(15);
//		country.setModifiedBy(15);
//		countryRepo.save(country);
//
//		State state = new State();
//		state.setCountryId(country.getId());
//		state.setStateName("Maharashtra");
//		state.setRemarks("Very good");
//		state.setCreatedOn(new Date(System.currentTimeMillis()));
//		state.setModifiedOn(new Date(System.currentTimeMillis()));
//		state.setCreatedBy(15);
//		state.setModifiedBy(15);
//		stateRepo.save(state);
//
//		City city = new City();
//		city.setStateId(state.getId());
//		city.setCityName("Pune");
//		city.setPincode("411040");
//		city.setRemarks("Very good");
//		city.setCreatedOn(new Date(System.currentTimeMillis()));
//		city.setModifiedOn(new Date(System.currentTimeMillis()));
//		city.setCreatedBy(15);
//		city.setModifiedBy(15);
//		cityRepo.save(city);
//
//		CRMUser crmUser = new CRMUser();
//
//		crmUser.setLastName("Bhanegaonkar");
//		crmUser.setFirstName("KedarNew");
//		crmUser.setMiddleName("Sudhir");
//		crmUser.setUserName("kedarbh");
//		crmUser.setPassword("Welcome@01");
//		crmUser.setContactNumber("11111111111");
//		crmUser.setEmail("test@ema");
//		crmUser.setCityId(city.getId());
//		crmUser.setRemarks("Very good");
//		crmUser.setCreatedOn(new Date(System.currentTimeMillis()));
//		crmUser.setModifiedOn(new Date(System.currentTimeMillis()));
//		crmUser.setCreatedBy(15);
//		crmUser.setModifiedBy(15);
//		crmUserRepo.save(crmUser);
		
//		CRMUser user = crmUserRepo.getUserByUserId(27);
//		System.out.println(user);
		
//		Batch batch = new Batch();
//		batch.setBatchName("Yoga");
//		batch.setCourseId(14);
//		batch.setBatchSyllabus("Test syllabus");
//		batch.setBatchDescription("Test description");
//		batch.setRemarks("Very good");
//		batch.setCreatedOn(new Date(System.currentTimeMillis()));
//		batch.setModifiedOn(new Date(System.currentTimeMillis()));
//		batch.setCreatedBy(15);
//		batch.setModifiedBy(15);
//		batchRepo.save(batch);
		
		
//		Course course = new Course();
//		course.setCourseName("Test course");
//		course.setCourseSyllabus("Test course syllabus");
//		course.setCourseDescription("Test course description");
//		course.setRemarks("Very good");
//		course.setCreatedOn(new Date(System.currentTimeMillis()));
//		course.setModifiedOn(new Date(System.currentTimeMillis()));
//		course.setCreatedBy(15);
//		course.setModifiedBy(15);
//		courseRepo.save(course);
		
//		ApplicationFeature applicationFeature = new ApplicationFeature();
//		applicationFeature.setFeatureName("Test feature");
//		applicationFeature.setModuleName("Test module");
//		applicationFeature.setRemarks("Very good");
//		applicationFeature.setCreatedOn(new Date(System.currentTimeMillis()));
//		applicationFeature.setModifiedOn(new Date(System.currentTimeMillis()));
//		applicationFeature.setCreatedBy(15);
//		applicationFeature.setModifiedBy(15);
//		featureRepo.save(applicationFeature);
//		
//		Batch batch = batchRepo.getBatchByBatchId(14);
//		Batch batch1 = batchRepo.getBatchByBatchId(15);
//		Batch batch2 = batchRepo.getBatchByBatchId(16);
//		Batch batch3 = batchRepo.getBatchByBatchId(17);
//		Batch batch4 = batchRepo.getBatchByBatchId(18);
//		Batch batch5 = batchRepo.getBatchByBatchId(19);
//		CandidateDetails d = batch.getCandidates().get(0);
//		System.out.println("Batch is ::: "+batch.getCandidates());

//		CandidateDetails candidateDetails = new CandidateDetails();
//		candidateDetails.setFirstName("Virendra");
//		candidateDetails.setLastName("Sehewagh");
//		candidateDetails.setMiddleName("Sudhir");
//		candidateDetails.setContactNumber("9922488571");
//		candidateDetails.setEmail("testmail");
//		candidateDetails.setIsRegistered(0);
//		candidateDetails.setIsWorking(0);
//		candidateDetails.setWorkingField("Test field");
//		candidateDetails.setEnquiryDate(new Date(System.currentTimeMillis()));
//		candidateDetails.setRegisterDate(new Date(System.currentTimeMillis()));
//		candidateDetails.setRemarks("Very good");
//		candidateDetails.setCreatedOn(new Date(System.currentTimeMillis()));
//		candidateDetails.setModifiedOn(new Date(System.currentTimeMillis()));
//		candidateDetails.setCreatedBy(15);
//		candidateDetails.setModifiedBy(15);
//		candidateDetails.getBatches().add(batch);
//		candidateDetails.getBatches().add(batch1);
//		candidateDetails.getBatches().add(batch2);
//		candidateDetails.getBatches().add(batch3);
//		candidateDetails.getBatches().add(batch4);
//		candidateDetails.getBatches().add(batch5);
//		candidateDetailsRepo.save(candidateDetails);
		

		
		
		//Batch batch = batchRepo.getBatchByBatchId(15);
		
//		PaymentDetails paymentDetails = new PaymentDetails();
//		paymentDetails.setBatchId(15);
//		paymentDetails.setCourseId(2);
//		paymentDetails.setPaymentDate(new Date(System.currentTimeMillis()));
//		paymentDetails.setRemarks("Very good");
//		paymentDetails.setCreatedOn(new Date(System.currentTimeMillis()));
//		paymentDetails.setModifiedOn(new Date(System.currentTimeMillis()));
//		paymentDetails.setCreatedBy(15);
//		paymentDetails.setModifiedBy(15);
//		paymentDetails.setFeesPaid(1000);
//		paymentDetails.setTotalFees(10000);
		//paymentDetailRepo.save(paymentDetails);
		
//		CandidateDetails c = candidateDetailsRepo.getCandidateDetailsByCandidateId(22);
//		c.getPaymentDetails().add(paymentDetails);
//		candidateDetailsRepo.save(c);
//		System.out.println(c.getPaymentDetails());
//		System.out.println(c.getPaymentDetails().get(0).getBatch().getBatchName());
		
//		List<Batch> batches =  batchRepo.findAll();
//		System.out.println(batches);

		

	}

}
