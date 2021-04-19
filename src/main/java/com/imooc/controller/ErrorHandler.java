package com.imooc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {
	
	@ExceptionHandler(value = Exception.class)
	public String errorHandler(HttpServletRequest request, 
			HttpServletResponse response, Exception e) throws Exception {
		System.out.println(e.getMessage());
		return "thymeleaf/index/index";
	}
}
