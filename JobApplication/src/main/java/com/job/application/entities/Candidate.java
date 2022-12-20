package com.job.application.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Candidate")
public class Candidate {

	@Id
	  private String idCompany;

	  private String companyName;

	  private String email;

	  private String password;
	  
	  private boolean is_deleted;
	  
	  private String firstName;
	  
	  private String lastName;
}
