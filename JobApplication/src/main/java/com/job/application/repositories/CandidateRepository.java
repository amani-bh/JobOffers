package com.job.application.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.job.application.entities.Candidate;

@Repository
public interface CandidateRepository extends MongoRepository<Candidate,String>{

}
