package com.job.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.application.iservices.IServiceCompany;

@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping( "/Company" )
@RestController
public class CompanyController {

	@Autowired
	private IServiceCompany iCompany;
}
