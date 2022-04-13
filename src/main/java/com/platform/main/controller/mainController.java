package com.platform.main.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.platform.login.domain.HrUserPVO;
import com.platform.main.service.TestTableService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class mainController {
	
	@Autowired
	TestTableService testTableService;
	
	@RequestMapping("/main/mainPage.do")
	public ModelAndView getMainPage(HttpServletRequest request, @ModelAttribute("p") HrUserPVO p) {
		ModelAndView mv = new ModelAndView();
		String alert;
		
		mv.setViewName("/main/mainPage");
		
		Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
		Boolean loginYn = (Boolean)flashMap.get("loginYn");
		log.debug("loginYn: " + loginYn);
		
		if(loginYn == null)
			alert = "로그인해주세요.";
		else if(loginYn)
				alert = "로그인 성공";
		else
			alert = "로그인 실패";
		
		mv.addObject("alert", alert);
		return mv;
	}
}
