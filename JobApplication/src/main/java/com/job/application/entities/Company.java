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
@Document(collection = "Company")
public class Company {

	@Id
	  private String idCompany;

	  
	  private String companyName;

	  
	  private String email;

	  private String password;
	  
	  private boolean is_deleted;
	  
	  private String firstName;
	  
	  private String lastName;
	  
	  private String phone;
	  
	  private String country;	  
	  
	  private String address;
	  
	  private String description;
	  
	  private Date creationDate;



}
