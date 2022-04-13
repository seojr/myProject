package com.platform.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.platform.main.service.TestTableService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class mainController {
	
	@Autowired
	TestTableService testTableService;
	
	@RequestMapping("main/mainPage.do")
	public ModelAndView getMainPage(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/main/mainPage");
		mv.addObject("req", req.getServletContext());
//		TestTableDVO dvo = new TestTableDVO();
//		dvo = testTableService.getTestTable(dvo);
//		System.out.println(dvo);
//		
//		mv.addObject("dvo", dvo);
		return mv;
	}
}
