package com.myProject.login.service;

import com.myProject.login.domain.HrUserPVO;
import com.myProject.login.domain.HrUserRVO;

public interface HrUserService {
	
	public HrUserRVO read(String usrId);
	
	public int readByIdAndPwd(HrUserPVO pvo);
	
	public int insert(HrUserPVO pvo);
}
