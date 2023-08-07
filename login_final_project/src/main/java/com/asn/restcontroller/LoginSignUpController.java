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
	
	@GetMapping("signup/{email}/{password}/{fname}")
//	@PostMapping("signup")

	public Studentdto addData(@PathVariable String email , @PathVariable String password , @PathVariable String fname) {
//	public Studentdto addData(@RequestBody Studentdto dto) {

		Studentdto e = new Studentdto();
		Studentdto e1 = new Studentdto();
		e1.setEmail(email);
		e1.setFname(fname);
		e1.setPassword(password);
		System.out.println(e1);
		Studentdto data = service.addData(e1);
		System.out.println(e1);
		
//		System.out.println(dto.getEmail());
//		if(data ==null) {
			System.out.println(data);
			return data;
//		}
//		return e1;

//		service.addData(dto);
		
		
	}
	
	@GetMapping("login/{email}/{password}")
	public Studentdto getData(@PathVariable String email , @PathVariable String password ) {
		Studentdto e = new Studentdto();

		StudentLoginInfo e1 = new StudentLoginInfo();
		e1.setEmail(email);
		e1.setPassword(password);
		System.out.println(e1);
		Studentdto data = service.getData(e1);
//		System.out.println(data);
		
		System.out.println(data);
		System.out.println(data +"in controller");
		
		
		return data;
	}
	

}
