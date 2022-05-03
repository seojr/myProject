package com.myProject.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.login.domain.HrUserDVO;
import com.myProject.login.domain.HrUserPVO;
import com.myProject.login.domain.HrUserRVO;
import com.myProject.login.mapper.HrUser;

@Service
public class HrUserService {
	
	@Autowired
	HrUser hrUser;
	
	public HrUserRVO read(String usrId) {
		return hrUser.read(usrId);
	}
	
	public Boolean readByIdAndPwd(HrUserPVO pvo) {
		return hrUser.readByIdAndPwd(pvo);
	}
	
	public int insert(HrUserPVO pvo) {
		return hrUser.insert(pvo);
	}
}
