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
import com.asn.model.UserAllDetail;

@Controller
//@RequestMapping("main")
public class LoginSignUpController {

	
//	mapping for index page
	
	@RequestMapping("home")
	@GetMapping
	public String get() {
		return "index";
	}

//	mapping for user login page
	
	@RequestMapping("userlogin")
	@GetMapping
	public String ulogin() {
		return "userLogin";
	}
	
//	mapping for user signup page
	

	@RequestMapping("signup")
	@GetMapping
	public String usignup() {
		return "signUp";
	}


//	post method for user/manager signup

	@RequestMapping("send")
	@GetMapping
	public ModelAndView Registration(@RequestParam String email, @RequestParam String fname,
			@RequestParam String password, @RequestParam String role, @RequestParam String addres,
			@RequestParam Integer phone_no) {
		UserAllDetail useralldetail = new UserAllDetail(email, fname, password, role, addres, phone_no);
		UserAllDetail useralldetail2 = new UserAllDetail(email, fname, password, role, addres, phone_no);

		String url = "http://localhost:8000/main/signup/" + email + "/" + fname + "/" + password + "/" + role + "/"
				+ addres + "/" + phone_no;
		RestTemplate resttemplate = new RestTemplate();
		UserAllDetail useralldetail1 = resttemplate.getForObject(url, UserAllDetail.class);
		System.out.println(useralldetail1 + "  here");
		ModelAndView mv = new ModelAndView();
		if (useralldetail1.getEmail() == null) {
			if (useralldetail2.getRole().equals("user")) {
				mv.addObject("uname", useralldetail2.getFname());

				mv.setViewName("userpage");
			} else if (useralldetail2.getRole().equals("librarian")) {
				mv.addObject("uname", useralldetail2.getFname());

				mv.setViewName("managerpage");
			}
		} else if (useralldetail1.getEmail() != null) {

			mv.addObject("uname", "email exist already");

			mv.setViewName("signUp");
		}
		return mv;
	}
}


//get method for user/manager login


//	@RequestMapping("get")
//	@PostMapping
//	public ModelAndView getdata(@RequestParam String email , @RequestParam String password) {
//		StudentLoginData data = new StudentLoginData(email , password);
//		StudentLoginData data1 = new StudentLoginData(email , password);
//		System.out.println(data);
//		String url = "http://localhost:8000/main/login/"+email+"/"+password;
//		RestTemplate template = new RestTemplate();
//		System.out.println("yes");
//
//		StudentData e = template.getForObject(url, StudentData.class);
//		System.out.println(e);
//		ModelAndView mv = new ModelAndView();
//
//		
//		if(e.getEmail() == null) {
//			System.out.println(email);
//			mv.addObject("email","You don't have account with "+email);	
//
//			mv.setViewName("login");
//		}
////		if(e.getEmail().equals(null)){
////			System.out.println(email+"in 3nd statement");
////			
////			mv.addObject("email",email);	
////
////			mv.setViewName("errorpage");
////		}
////		
//		else if(e.getEmail().equals(email) && e.getPassword().equals(password)){
//			System.out.println(e.getEmail()+"in 1nd statement");
//		mv.addObject("uname",e.getFname());	
//		mv.setViewName("signupsuccess");
//		}
//		else if(e.getEmail().equals(email) && !e.getPassword().equals(password)) {
//			System.out.println(email +"in 2nd statement");
//			System.out.println("in password not correct");
//			mv.addObject("password","please check the password ");	
//
////			mv.addObject("uname",e.getFname());	
//			mv.setViewName("login");
//		}
//		 
//		
//
//	return mv;
//		
//	}
//
//}
