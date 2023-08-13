package com.asn.service;

import java.util.Optional;

import com.asn.model.StudentEntity;
import com.asn.model.StudentLoginInfo;
import com.asn.model.StudentLogininfoEntity;
import com.asn.model.Studentdto;
import com.asn.model.Studentdtologin;

public abstract class StudentServiceAddapter implements StudentServiceInter{

	@Override
	public Studentdto addData(Studentdto dto) {
		return null;
		// TODO Auto-generated method stub
		
	}
	@Override
	public Studentdtologin getData(StudentLoginInfo info) {
		return null;
		// TODO Auto-generated method stub
		
	}
	@Override
	public Studentdtologin getuserdata(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
