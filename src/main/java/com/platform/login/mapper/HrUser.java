package com.platform.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.platform.login.domain.HrUserDVO;
import com.platform.login.domain.HrUserPVO;

@Mapper
public interface HrUser {
	public HrUserDVO read(String usrId);
	
	public Boolean readByIdAndPwd(HrUserPVO pvo);
}
