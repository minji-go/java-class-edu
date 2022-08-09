package com.test.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Ex01Controller implements Controller {

	//handleRequest == doGet/doPost
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		
		
		//request.setAttribute("name", "홍길동");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ex01");	//vs "WEB-INF/views/ex01.jsp"
		
		mv.addObject("age", "20");
		
		return mv;
	}

}