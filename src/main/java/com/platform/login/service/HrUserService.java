package com.platform.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.login.domain.HrUserDVO;
import com.platform.login.domain.HrUserPVO;
import com.platform.login.domain.HrUserRVO;
import com.platform.login.mapper.HrUser;

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
