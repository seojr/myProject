package com.myProject.login.domain;

import lombok.Data;

@Data
public class HrUserDVO {
	
	private String usrNo;
	
	private String usrId;
	
	private String usrNm;
	
	private String pwd;
	
	private String birthYmd;
	
	private String address;
	
	private String education;
	
	private String email;
	
	private String hpNo;
	
	private String salt;
}
