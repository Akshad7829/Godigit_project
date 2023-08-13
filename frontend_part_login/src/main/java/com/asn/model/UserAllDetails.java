package com.asn.model;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAllDetails {
	private Integer user_id;
	private String email;
	private String fname;
	private String password;
	private String role;
	private String addres;
	private Integer phone_no;

}
