package com.myProject.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.login.domain.HrUserPVO;
import com.myProject.login.domain.HrUserRVO;
import com.myProject.login.mapper.HrUser;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HrUserServiceImpl implements HrUserService{
	
	@Autowired
	HrUser hrUser;
	
	@Override
	public HrUserRVO read(String usrId) {
		return hrUser.read(usrId);
	}
	
	@Override
	public int readByIdAndPwd(HrUserPVO pvo) {
		return hrUser.readByIdAndPwd(pvo);
	}
	
	@Override
	public int insert(HrUserPVO pvo) {
		return hrUser.insert(pvo);
	}
}
