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
@Document(collection = "JobOffer")
public class JobOffer {

	    @Id
	    private String idJob;
    
	    private String title;
	    
	    private String description;
	    	    
	    private Date creationDate;
	    
	    private String jobType;
	    
	    private Date deadlineDate;
	    
	    private Company company;
	   
	    
}
