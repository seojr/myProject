package com.platform.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.platform.login.domain.HrUserPVO;
import com.platform.login.service.HrUserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class loginController {
	
	@Autowired
	HrUserService hrUserService;
	
	@RequestMapping("/login/loginPage.do")
	public ModelAndView getLoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/login/loginPage");
		return mv;
	}
	
	@RequestMapping("/login/login.do")
	public String doLogin(@ModelAttribute("p") HrUserPVO p, RedirectAttributes redirectAttributes) {
		log.debug(p.getUsrId());
		log.debug(p.getPwd());
		Boolean loginYn = hrUserService.readByIdAndPwd(p);
		
		redirectAttributes.addFlashAttribute("loginYn", loginYn);
		return "redirect:/main/mainPage.do";
	}
}
