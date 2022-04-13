package com.platform.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.login.domain.HrUserDVO;
import com.platform.login.mapper.HrUser;

@Service
public class HrUserService {
	
	@Autowired
	HrUser hrUser;
	
	public HrUserDVO read(String usrId) {
		return hrUser.read(usrId);
	}
	
}
