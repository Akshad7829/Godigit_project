package com.asn.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asn.DAO.StudentDAOInter;
import com.asn.model.StudentEntity;
import com.asn.model.StudentLoginInfo;
import com.asn.model.StudentLogininfoEntity;
import com.asn.model.Studentdto;
import com.asn.model.Studentdtologin;

@Service
public class StudentServiceImple extends StudentServiceAddapter{
	
	@Autowired
	private StudentDAOInter dao;
	
	@Override
	public Studentdto addData(Studentdto dto) {
		ModelMapper mapper = new ModelMapper();
		StudentEntity entitydata= mapper.map(dto, StudentEntity.class);
		
		StudentEntity info2 = dao.addData(entitydata);    //e
		Studentdto data = mapper.map(info2, Studentdto.class);
		return data;	
		}
	@Override
	public Studentdtologin getData(StudentLoginInfo info) {
		ModelMapper mapper = new ModelMapper();
		StudentLogininfoEntity info1= mapper.map(info, StudentLogininfoEntity.class);
		StudentEntity info2 =  dao.getData(info1);
		Studentdtologin data = mapper.map(info2, Studentdtologin.class);
		System.out.println(data);
		return data;
		
		

	}
	
	@Override
	public Studentdtologin getuserdata(String email) {
		// TODO Auto-generated method stub
		ModelMapper mapper = new ModelMapper();

		StudentEntity userdata = dao.getuserdata(email);
		Studentdtologin data = mapper.map(userdata, Studentdtologin.class);
		System.out.println(data);
		return data;
		
	}
}
