package com.asn.frontendController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.asn.model.StudentData;
import com.asn.model.StudentLoginData;

@Controller
@RequestMapping("main")
public class LoginSignUpController {
	
	@RequestMapping("home")
	@GetMapping
	public String get() {
		return "index";
		}
	
	
	@RequestMapping("login")
	@GetMapping
	public String getLoginPage() {
		return "login";
		}
	
	@RequestMapping("send")
	@PostMapping
	public ModelAndView sendData(@RequestParam String email  , @RequestParam String password , @RequestParam String fname) {
		System.out.println(email);
		StudentData data = new StudentData(email,fname,password);
		StudentData data1 =  new StudentData(email,fname,password);
		String url = "http://localhost:8000/main/signup/"+email+"/"+password+"/"+fname;
//		String url = "http://localhost:8000/main/signup/";

		RestTemplate template = new RestTemplate();
		System.out.println(data);
//		StudentData e = template.getForObject(url, StudentData.class,email,password,fname);
		StudentData e = template.getForObject(url,StudentData.class);

//		System.out.println(e);
		ModelAndView mv = new ModelAndView();

		if(e.getEmail() == null) {
//			mv.addObject("uname",e.getFname());	
			mv.addObject("uname",data1.getFname());	

			mv.setViewName("signupsuccess");
		}
		else {
//		ModelAndView mv = new ModelAndView();
		mv.addObject("email","Already Signed up with: "+e.getEmail());	
		
		mv.setViewName("index");
		}
//		if(!e.isEmpty()) {
//			return "error";
//		}
		//		template.postForObject(url, e, data1)
	return mv;

		
	}
	
	@RequestMapping("get")
	@PostMapping
	public ModelAndView getdata(@RequestParam String email , @RequestParam String password) {
		StudentLoginData data = new StudentLoginData(email , password);
		StudentLoginData data1 = new StudentLoginData(email , password);
		System.out.println(data);
		String url = "http://localhost:8000/main/login/"+email+"/"+password;
		RestTemplate template = new RestTemplate();
		System.out.println("yes");

		StudentData e = template.getForObject(url, StudentData.class);
		System.out.println(e);
		ModelAndView mv = new ModelAndView();

		
		if(e.getEmail() == null) {
			System.out.println(email);
			mv.addObject("email","You don't have account with "+email);	

			mv.setViewName("login");
		}
//		if(e.getEmail().equals(null)){
//			System.out.println(email+"in 3nd statement");
//			
//			mv.addObject("email",email);	
//
//			mv.setViewName("errorpage");
//		}
//		
		else if(e.getEmail().equals(email) && e.getPassword().equals(password)){
			System.out.println(e.getEmail()+"in 1nd statement");
		mv.addObject("uname",e.getFname());	
		mv.setViewName("signupsuccess");
		}
		else if(e.getEmail().equals(email) && !e.getPassword().equals(password)) {
			System.out.println(email +"in 2nd statement");
			System.out.println("in password not correct");
			mv.addObject("password","please check the password ");	

//			mv.addObject("uname",e.getFname());	
			mv.setViewName("login");
		}
		 
		

	return mv;
		
	}

}
