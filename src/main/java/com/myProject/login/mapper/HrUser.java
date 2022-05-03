package com.myProject.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.myProject.login.domain.HrUserDVO;
import com.myProject.login.domain.HrUserPVO;
import com.myProject.login.domain.HrUserRVO;

@Mapper
public interface HrUser {
	public HrUserRVO read(String usrId);
	
	public Boolean readByIdAndPwd(HrUserPVO pvo);
	
	public int insert(HrUserPVO pvo);
}
