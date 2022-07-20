package com.myProject.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonInterceptor implements AsyncHandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception{
		long preTime = System.currentTimeMillis();
		req.setAttribute("preTime", preTime);
		log.debug("[preHandle] Request URI: " + req.getRequestURI());
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView mav) throws Exception{
		long preTime = (long) req.getAttribute("preTime");
		long execTime = System.currentTimeMillis() - preTime;
		log.debug("[postHandle] Exec Time: " + execTime + "ms");
	}
	
//	@Override
//	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler, Exception ex) throws Exception{
//		System.out.println("afterCompletion start");
//	}
}
