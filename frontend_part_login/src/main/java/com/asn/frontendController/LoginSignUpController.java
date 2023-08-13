package com.asn.frontendController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import org.springframework.web.servlet.ModelAndView;

import com.asn.model.DeleteBook;
import com.asn.model.StudentLoginData;
import com.asn.model.UserAllDetail;
import com.asn.model.UserAllDetails;
import com.asn.model.issuedbookDto;
import com.asn.model.issuedbookDto1;
import com.asn.model.BookRepositry;
import com.asn.model.BookDetail;
import com.asn.model.BookRepositry;
import com.asn.service.bookServiceimple;

@Controller
public class LoginSignUpController {

	@Autowired
	private bookServiceimple service;

//	mapping for index page

	@RequestMapping("home")
	@GetMapping
	public String get() {
		return "index";
	}

	String emaill = "";

	// mapping for adding books

	@RequestMapping("addbooks")
	@GetMapping
	public String addbookpage() {
		return "addbookpage";
	}

//	mapping for user login page

	@RequestMapping("userlogin")
	@GetMapping
	public String ulogin() {
		return "userLogin";
	}

	@RequestMapping("logout")
	@GetMapping
	public String Logout() {
		return "userLogin";
	}

//	mapping for user signup page

	@RequestMapping("signup")
	@GetMapping
	public String usignup() {
		return "signUp";
	}

	// mapping for manager page

	@RequestMapping("user")
	@GetMapping
	public String managerpg() {
		return "managerpage";
	}

	// mapping for the profile page to get data from the API

	@RequestMapping("profile")
	@PostMapping
	public ModelAndView profilepage(@RequestParam String email) {
		ModelAndView mv = new ModelAndView();
		String url = "http://localhost:8000/main/profile/" + email;
		RestTemplate template = new RestTemplate();
		UserAllDetails details = template.getForObject(url, UserAllDetails.class);
		mv.addObject("userprofile", details);
		mv.setViewName("profilepage");
		return mv;

	}

//	mapping for booklistpage

	@RequestMapping("booklist")
	@GetMapping
	public ModelAndView booklists() {
		List<BookDetail> list = service.getallbooks();

		System.out.println(list);
		ModelAndView mv = new ModelAndView();
		mv.addObject("booklist", (List<BookDetail>) list);
		mv.setViewName("booklistpage");

		return mv;

	}

	// mapping for the get allbooks for admin
	
	@RequestMapping("allbooks")
	@GetMapping
	public ModelAndView allbooks() {
		List<BookDetail> list = service.getallbooks();

		System.out.println(list);
		ModelAndView mv = new ModelAndView();
		mv.addObject("booklist", (List<BookDetail>) list);
		mv.setViewName("allbooks");
		return mv;

	}

	// mapping for manager page to get the list of the books to delete books

	@RequestMapping("userbyid")
	@GetMapping
	public ModelAndView userbyid(@RequestParam String email) {
		List<UserAllDetails> list = service.userbyid(email);

		System.out.println(list);
		ModelAndView mv = new ModelAndView();
		mv.addObject("booklist", (List<UserAllDetails>) list);
		mv.setViewName("booklistpage");

		return mv;

	}

//	mapping for booklistpage

//	@RequestMapping("profile")
//	@GetMapping
//	public ModelAndView profile() {
//		List<BookDetail> list = service.getprofiledata();
//		
//		ModelAndView mv = new ModelAndView();
////		System.out.println(list);
//		mv.addObject("booklist", (List<BookDetail>)list);
//		mv.setViewName("booklistpage");
//////		System.out.println(list);
////		return mv;
////		return "booklistpage";
//		return mv;
//
//	}

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
		List<BookDetail> list = service.getallbooks();

		ModelAndView mv = new ModelAndView();
		if (useralldetail1.getEmail() == null) {
			if (useralldetail2.getRole().equals("user")) {
				mv.addObject("bookcategorylist", list);

				mv.addObject("uname", useralldetail2.getEmail());

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

//get method for user/manager login

	@PostMapping("login")

	public ModelAndView getdata(@RequestParam Integer user_id, @RequestParam String password) {
		StudentLoginData data = new StudentLoginData(user_id, password);
		StudentLoginData data1 = new StudentLoginData(user_id, password);

		String url = "http://localhost:8000/main/login/" + user_id + "/" + password;

		RestTemplate template = new RestTemplate();
		UserAllDetails details = template.getForObject(url, UserAllDetails.class);
		System.out.println(details);
		List<BookDetail> list = service.getallbooks();
		ModelAndView mv = new ModelAndView();
		if (details.getUser_id() == null) {
			mv.addObject("email", "You don't have account with " + user_id);
			mv.setViewName("userLogin");
		} else if (details.getUser_id().equals(user_id) && details.getPassword().equals(password)) {
			if (details.getRole().equals("user")) {
				emaill = details.getEmail();
				mv.addObject("uname", details.getEmail());

				mv.addObject("bookcategorylist", list);
				mv.setViewName("userpage");
			} else if (details.getRole().equals("librarian")) {
				System.out.println("here");
				mv.addObject("uname", details.getEmail());
				mv.setViewName("managerpage");
			} else {
				System.out.println("here");
				mv.addObject("uname", details.getEmail());
				mv.setViewName("adminpage");
			}
		} else if (details.getUser_id().equals(user_id) && !details.getPassword().equals(password)) {
			mv.addObject("email", "please check the password ");
			mv.setViewName("userLogin");

		}
		return mv;
	}

	// add book details for manager to add books

	@PostMapping("addbook")
	public ModelAndView addbook(@RequestParam Integer book_id, @RequestParam String bookname,
			@RequestParam byte[] bookimage, @RequestParam String bookauthor, @RequestParam Integer bookedition,
			@RequestParam String bookcategory, @RequestParam Integer bookcnt) {
		BookDetail bookdata = new BookDetail(book_id, bookname, bookimage, bookauthor, bookedition, bookcategory,
				bookcnt);
		String data = service.addbook(bookdata);
		ModelAndView mv = new ModelAndView();
		mv.addObject("C", data);
		mv.setViewName("addbookpage");
		return mv;

	}

	// method for delete book for manager
	@PostMapping("delete")
	public ModelAndView deletebook(@RequestParam Integer book_id) {
		System.out.println(book_id);
		DeleteBook deletebook = new DeleteBook(book_id);

		String ans = service.deletebooks(deletebook);
		ModelAndView mv = new ModelAndView();
		mv.addObject("email", ans);
		mv.setViewName("deletepage");
		return mv;

	}

//method the search book as per category for user

	@RequestMapping("searchbook")
	@PostMapping
	public ModelAndView serachbook(@RequestParam String bookcategory) {
		List<BookDetail> listbookcategory = service.searchbook(bookcategory);
		List<BookDetail> list = service.getallbooks();
		UserAllDetails d = new UserAllDetails();
		ModelAndView mv = new ModelAndView();

		if (listbookcategory.size() == 0) {
			System.out.println("in only list");
			mv.addObject("bookcategorylist", (List<BookDetail>) list);
			mv.setViewName("userpage");
		} else {
			System.out.println("in only list");

			mv.addObject("bookcategorylist", (List<BookDetail>) listbookcategory);
			mv.addObject("uname", emaill);

			mv.setViewName("userpage");
		}

		return mv;

	}

	// method for user to issue book

	@RequestMapping("issuebook")
	@PostMapping
	public ModelAndView issueBooks(@RequestParam Integer book_id, @RequestParam String bookname,
			@RequestParam byte[] bookimage, @RequestParam String bookauthor, @RequestParam Integer bookedition,
			@RequestParam String bookcategory, @RequestParam Integer bookcnt, @RequestParam String email) {
		System.out.println(bookcnt);
		issuedbookDto dto = new issuedbookDto(email, book_id, bookname, bookauthor, bookcategory, bookcnt);
		BookDetail bookdata = new BookDetail(book_id, bookname, bookimage, bookauthor, bookedition, bookcategory,
				bookcnt);
		System.out.println(dto);
		System.out.println(bookdata);
		ModelAndView mv = new ModelAndView();
		String answer = service.issuebook(dto, bookdata);

		mv.addObject("data", answer);
		mv.setViewName("issuesuccess");
		return mv;

	}

	// function to show the issued books by the user

	@RequestMapping("showissuebook")
	@PostMapping
	public ModelAndView showissuedbooks(@RequestParam String email) {
		ModelAndView mv = new ModelAndView();

		List<issuedbookDto1> list = service.showissuedbooks(email);

		System.out.println(list);
		mv.addObject("uname", email);

		mv.addObject("isbooklist", (List<issuedbookDto1>) list);
		mv.setViewName("issuedbookpage");
		return mv;
	}

	// method for user to return book

	@RequestMapping("return")
	@PostMapping

	public ModelAndView returnBook(@RequestParam String email, @RequestParam Integer book_id) {
		ModelAndView mv = new ModelAndView();

		String ans = service.returnbook(email, book_id);
		mv.addObject("aa", ans);

		mv.setViewName("return");
		return mv;
	}

	// method for admin to see all the active users

	@RequestMapping("allusers")
	@GetMapping
	public ModelAndView Userlists()

	{
		List<UserAllDetails> list = service.getallUser();

		System.out.println(list);
		ModelAndView mv = new ModelAndView();
		mv.addObject("userdetail", (List<UserAllDetails>) list);
		mv.setViewName("alluserdata");

		return mv;

	}

}
