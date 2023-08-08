package com.asn.restcontroller;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asn.model.StudentEntity;
import com.asn.model.StudentLoginInfo;
import com.asn.model.StudentLogininfoEntity;
import com.asn.model.Studentdto;
import com.asn.service.StudentServiceInter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("main")
public class LoginSignUpController {
		
	@Autowired
	private StudentServiceInter service;
	
	@GetMapping("signup/{email}/{fname}/{password}/{role}/{addres}/{phone_no}")

	public Studentdto addData(@PathVariable  String email ,@PathVariable String fname,@PathVariable String password,@PathVariable String role,@PathVariable String addres,@PathVariable Integer phone_no ) {
		Studentdto e = new Studentdto();
		Studentdto e1 = new Studentdto();
		e1.setFname(fname);
		e1.setEmail(email);
		e1.setPassword(password);
		e1.setRole(role);
		e1.setPhone_no(phone_no);
		e1.setAddres(addres);
		
		Studentdto data = service.addData(e1);
		
		if(data.getFname() ==null) {
			System.out.println(data);
			return data;
		}
		return e1;

//		service.addData(dto);
		
		
	}
	
	@GetMapping("login/{user_id}/{password}")
	public Studentdto getData(@PathVariable Integer user_id , @PathVariable String password ) {
		Studentdto e = new Studentdto();

		StudentLoginInfo e1 = new StudentLoginInfo();
		e1.setUser_id(user_id);
		e1.setPassword(password);
		System.out.println(e1);
		Studentdto data = service.getData(e1);
		
		System.out.println(data);
		

		
		
		return data;
	}
	

}
