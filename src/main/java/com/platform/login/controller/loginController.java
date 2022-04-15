package com.platform.login.controller;

import java.security.MessageDigest;
import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.platform.login.domain.HrUserPVO;
import com.platform.login.domain.HrUserRVO;
import com.platform.login.service.HrUserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class loginController {

	@Autowired
	HrUserService hrUserService;
	
	// 로그인 페이지로 이동
	@RequestMapping("/login/loginPage.do")
	public ModelAndView getLoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/login/loginPage");
		return mv;
	}
	
	// 회원가입 페이지로 이동
	@RequestMapping("/login/joinPage.do")
	public ModelAndView getJoinPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/login/joinPage");
		return mv;
	}
	
	// 로그인
	@RequestMapping("/login/login.do")
	public String doLogin(@ModelAttribute("p") HrUserPVO p, RedirectAttributes redirectAttributes) {
		log.debug(p.getUsrId());
		log.debug("pwd: " +  p.getBytePwd());
		HrUserRVO rvo = hrUserService.read(p.getUsrId());
		try {
			p.setPwd(hashing(p.getBytePwd(), rvo.getSalt()));
			log.debug("salt: " + rvo.getSalt());
			log.debug("pwd: " + p.getPwd());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Boolean loginYn = hrUserService.readByIdAndPwd(p);

		redirectAttributes.addFlashAttribute("loginYn", loginYn);
		redirectAttributes.addFlashAttribute("joinYn", false);
		return "redirect:/main/mainPage.do";
	}
	
	// 회원가입
	@RequestMapping("/login/join.do")
	public String doJoin(@ModelAttribute("p") HrUserPVO p, RedirectAttributes redirectAttributes) {
		int check = 0;
		String birth = p.getBirthYmd();
		try {
			p.setBirthYmd(birth.replace("-", ""));
			p.setSalt(getSalt());
			p.setPwd(hashing(p.getBytePwd(), p.getSalt()));
			log.debug("bytePwd: " + p.getBytePwd());
			check = hrUserService.insert(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		log.debug("insert check: " + check);
		if (check > 0) {
			redirectAttributes.addFlashAttribute("joinYn", true);
			redirectAttributes.addFlashAttribute("loginYn", false);
		}
		return "redirect:/main/mainPage.do";
	}
	
	//
	// *패스워드 해싱 ( pwd + salt(난수) -> SHA256 해싱)*
	//
	
	// 패스워드 해싱  
	private String hashing(byte[] password, String salt) throws Exception {
		
		MessageDigest md = MessageDigest.getInstance("SHA-256");	// SHA-256 해시함수를 사용 
 
		// key-stretching
		for(int i = 0; i < 10000; i++) {
			String temp = byteToString(password) + salt;		// 패스워드와 Salt 를 합쳐 새로운 문자열 생성 
			md.update(temp.getBytes());			// temp 의 문자열을 해싱하여 md 에 저장해둔다 
			password = md.digest();	// md 객체의 다이제스트를 얻어 password 를 갱신한다 
		}
		
		return byteToString(password);
	}
	
	// SALT 값 생성  
	private String getSalt() throws Exception {
		SecureRandom rnd = new SecureRandom();
		byte[] temp = new byte[16];
		rnd.nextBytes(temp);
		
		return byteToString(temp);
	}
	
	// 바이트 값을 16진수로 변경해준다 
	private String byteToString(byte[] temp) {
		StringBuilder sb = new StringBuilder();
		for(byte a : temp) {
			sb.append(String.format("%02x", a));
		}
		return sb.toString();
	}
}
