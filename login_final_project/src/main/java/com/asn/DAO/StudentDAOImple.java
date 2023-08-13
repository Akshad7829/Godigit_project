package com.asn.DAO;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;

import com.asn.model.StudentEntity;
import com.asn.model.StudentLoginInfo;
import com.asn.model.StudentLogininfoEntity;
import com.asn.model.StudentRepository;
import com.asn.model.Studentdto;





@Repository
public class StudentDAOImple extends StudentDAOAddapter{
	
	@Autowired
	private StudentRepository repo;
	
	@Override
	public StudentEntity addData (StudentEntity entity) throws DataIntegrityViolationException {
		StudentEntity e = new StudentEntity();

		try {
		repo.save(entity);
		System.out.println(e);
		return e;
		}
		catch(DataIntegrityViolationException ex) {
			System.out.println(ex);
			e.setEmail(entity.getEmail());
			System.out.println(e);
			return e;
		}
		
	}
	
	
	@Override
	public StudentEntity getuserdata(String email) {
		StudentEntity e = new StudentEntity();
		
//		Optional<StudentEntity> info = repo.findById(email);
		Optional<StudentEntity> info = repo.findByemail(email);
		StudentEntity data = info.get();
		System.out.println(info);
		return data;
	}
		
	@Override
	public StudentEntity getData(StudentLogininfoEntity entity) {
		StudentEntity e = new StudentEntity();
		try {
		Optional<StudentEntity> info = repo.findById(entity.getUser_id());
		System.out.println(entity.getPassword());
		StudentEntity data = info.get();
		System.out.println(info);
		
		if(data.getUser_id().equals(entity.getUser_id())) {
			System.out.println("in if");
//		    data = info.get();
		   
//		    System.out.println(entity.getPassword());
			 if(data.getPassword().equals(entity.getPassword())) {
//		    	System.out.println(data.getFname());
//		    	System.out.println(data);
		    	System.out.println("end of if");
			    return data;
			    

		    }
			 else {
				 return data;
			 }
		   
		}
//		else if(data.getUser_id().equals(entity.getUser_id()) ||  data.getPassword().equals(entity.getPassword())){
//			System.out.println(data);
//		
//		}
		}
		catch(NoSuchElementException excep) {
			
			System.out.println(excep.getMessage());
		}
		
		

			return e;
	}

}

