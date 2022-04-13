package com.platform.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.platform.login.domain.HrUserDVO;

@Mapper
public interface HrUser {
	public HrUserDVO read(String usrId);
}
