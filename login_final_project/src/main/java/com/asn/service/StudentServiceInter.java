package com.asn.service;

import java.util.Optional;

import com.asn.model.StudentEntity;
import com.asn.model.StudentLoginInfo;
import com.asn.model.StudentLogininfoEntity;
import com.asn.model.Studentdto;
import com.asn.model.Studentdtologin;

public interface StudentServiceInter {
	
	public Studentdto addData(Studentdto dto);

	public Studentdtologin getData(StudentLoginInfo info);

	public Studentdtologin getuserdata(String email);
}
