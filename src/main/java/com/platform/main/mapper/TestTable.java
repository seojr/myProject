package com.platform.main.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.platform.main.domain.TestTableDVO;

@Mapper
public interface TestTable {
	public TestTableDVO getTestTable(TestTableDVO vo);
}