package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/th")
public class ThymeleafController {
	
	@RequestMapping("/getIndex")
	public String getIndexTemp(ModelMap modelMap) {
		// Birthday birthday = new Birthday();
		// birthday.setDate(new Date());
		// modelMap.put("birthday", birthday.getDate());
		modelMap.put("data", "<h1>product desc:111</h1>");
		return "thymeleaf/index/index";
	}
}
