package com.myProject.login.domain;

import lombok.Data;

@Data
public class HrUserPVO extends HrUserDVO{
	
	private Boolean loginYn;
	
	private byte[] bytePwd;
	
}
