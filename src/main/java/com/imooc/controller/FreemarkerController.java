package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ftl")
public class FreemarkerController {
	
	/**
	 * 返回模版界面
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/index")
	public String getIndexTemp(ModelMap modelMap) {
		modelMap.put("date", "hello");
		return "freemarker/index/index";
	}
}
