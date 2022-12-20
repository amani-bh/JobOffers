package com.job.application.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "CandidateApp")
public class CandidateApp {

	@Id
    private String idCandidateApp;

    private Date applicationDate;
    
    
    private Candidate candidate;
    
    
    private JobOffer job;
    
   
    private String cv;
}
