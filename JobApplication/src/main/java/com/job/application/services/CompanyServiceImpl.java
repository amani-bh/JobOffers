package com.job.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.application.iservices.IServiceCompany;
import com.job.application.repositories.CompanyRepository;

@Service
public class CompanyServiceImpl implements IServiceCompany{

	@Autowired
    private  CompanyRepository companyRepository;
}
