package com.platform.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.platform.main.domain.TestTableDVO;
import com.platform.main.service.TestTableService;

@Controller
public class mainController {
	
	@Autowired
	TestTableService testTableService;
	
	@RequestMapping(value="/main")
	public ModelAndView getMainPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/main/main");
//		TestTableDVO dvo = new TestTableDVO();
//		dvo = testTableService.getTestTable(dvo);
//		System.out.println(dvo);
//		
//		mv.addObject("dvo", dvo);
		return mv;
	}
}
