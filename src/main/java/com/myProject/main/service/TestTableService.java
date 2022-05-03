package com.myProject.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.main.domain.TestTableDVO;
import com.myProject.main.mapper.TestTable;

@Service
public class TestTableService {
	
	@Autowired
	TestTable testTable;
	
	public TestTableDVO getTestTable(TestTableDVO dvo){
		return testTable.getTestTable(dvo);
	}
}