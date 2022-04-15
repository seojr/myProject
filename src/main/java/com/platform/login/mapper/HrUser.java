package com.platform.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.platform.login.domain.HrUserDVO;
import com.platform.login.domain.HrUserPVO;
import com.platform.login.domain.HrUserRVO;

@Mapper
public interface HrUser {
	public HrUserRVO read(String usrId);
	
	public Boolean readByIdAndPwd(HrUserPVO pvo);
	
	public int insert(HrUserPVO pvo);
}
