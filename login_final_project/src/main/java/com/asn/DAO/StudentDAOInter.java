package com.asn.DAO;

import java.util.Optional;

import com.asn.model.StudentEntity;
import com.asn.model.StudentLogininfoEntity;
import com.asn.model.Studentdto;

public interface StudentDAOInter {
	public StudentEntity addData(StudentEntity entity);

	public StudentEntity getData(StudentLogininfoEntity entity);

}
