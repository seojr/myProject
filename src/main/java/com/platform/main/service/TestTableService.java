package com.platform.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.main.domain.TestTableDVO;
import com.platform.main.mapper.TestTable;

@Service
public class TestTableService {
	
	@Autowired
	TestTable testTable;
	
	public TestTableDVO getTestTable(TestTableDVO dvo){
		return testTable.getTestTable(dvo);
	}
}