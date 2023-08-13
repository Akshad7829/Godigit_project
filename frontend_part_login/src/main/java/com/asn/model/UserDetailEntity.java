package com.asn.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "godigit")
public class UserDetailEntity {
	@Id
	private Integer user_id;
	private String email;
	private String fname;
	private String password;
	private String role;
	private String addres;
	private Integer phone_no;
	
	

}
