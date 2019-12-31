package com.scodeen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scodeen.service.CRMUserService;

@RestController
public class CRMUserController {
	
	@Autowired
	private CRMUserService crmUserService;
	

}
