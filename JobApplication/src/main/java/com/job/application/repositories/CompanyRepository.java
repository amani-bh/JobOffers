package com.job.application.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.job.application.entities.Company;

@Repository
public interface CompanyRepository extends MongoRepository<Company,String>{

}
