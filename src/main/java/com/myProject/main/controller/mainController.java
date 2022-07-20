package com.myProject.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myProject.login.domain.HrUserPVO;
import com.myProject.main.service.TestTableService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class mainController {
	
	@Autowired
	TestTableService testTableService;
	
	@RequestMapping("/main/mainPage.do")
	public ModelAndView getMainPage(HttpServletRequest request, @ModelAttribute("p") HrUserPVO p) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/main/mainPage");
		return mv;
	}
}
