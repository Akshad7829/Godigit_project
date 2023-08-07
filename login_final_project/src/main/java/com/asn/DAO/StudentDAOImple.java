package com.asn.DAO;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public StudentEntity addData(StudentEntity entity) {
		StudentEntity e = new StudentEntity();
//		StudentEntity data = info.get();
		Optional<StudentEntity> info = repo.findById(entity.getEmail());
		if(info.isEmpty()) {
			repo.save(entity);
			return e;
		}
		else {
			return info.get();
		}
		
	}
	@Override
	public StudentEntity getData(StudentLogininfoEntity entity) {
		StudentEntity e = new StudentEntity();
		try {
		Optional<StudentEntity> info = repo.findById(entity.getEmail());
//		System.out.println(entity.getPassword());
		StudentEntity data = info.get();
//		System.out.println(info);
		
		if(data.getEmail().equals(entity.getEmail())) {
			System.out.println("in if");
//		    data = info.get();
		   
//		    System.out.println(entity.getPassword());
		    if(data.getPassword().equals(entity.getPassword())) {
//		    	System.out.println(data.getFname());
		    	System.out.println(data);
		    	System.out.println("end of if");
			    return data;
			    

		    }
		    else {
				return data;

		    }
		   
		}
//		else if(data.getEmail().equals(entity.getEmail()) ||  data.getPassword().equals(entity.getPassword())){
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
