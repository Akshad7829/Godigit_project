package com.asn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "studentlogininfo")
public class StudentEntity {
	@Id
	private String email;
	private String password;
	
	private String fname;
	private String lname;

}
