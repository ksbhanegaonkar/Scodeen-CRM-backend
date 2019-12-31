package com.scodeen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scodeen.entity.PaymentDetails;

public interface PaymentDetailRepo extends JpaRepository<PaymentDetails,Integer>{
	
	PaymentDetails getPaymentDetailsByPaymentId(int paymentId);

}
