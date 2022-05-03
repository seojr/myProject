package com.myProject.main.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.myProject.main.domain.TestTableDVO;

@Mapper
public interface TestTable {
	public TestTableDVO getTestTable(TestTableDVO vo);
}