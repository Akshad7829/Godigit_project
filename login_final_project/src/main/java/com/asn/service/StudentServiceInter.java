package com.asn.service;

import java.util.Optional;

import com.asn.model.StudentEntity;
import com.asn.model.StudentLoginInfo;
import com.asn.model.StudentLogininfoEntity;
import com.asn.model.Studentdto;

public interface StudentServiceInter {
	
	public Studentdto addData(Studentdto dto);

	public Studentdto getData(StudentLoginInfo info);
}
