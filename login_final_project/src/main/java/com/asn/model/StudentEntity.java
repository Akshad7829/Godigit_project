package com.asn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "godigit")
public class StudentEntity {
	
	 
	  @SequenceGenerator(name = "mySeqGen", sequenceName = "seqdigit13", initialValue = 1000)
	 @Id
 @GeneratedValue(generator = "mySeqGen")
	 private Integer user_id;
	  
	  	private String email;
		private String fname;
		private String password;
		private String role;
		private String addres;
		private Integer phone_no;

}
