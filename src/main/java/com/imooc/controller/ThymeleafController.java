package com.imooc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.entity.User;

@Controller
@RequestMapping("/th")
public class ThymeleafController {
	
	@RequestMapping("/getIndex")
	public String getIndexTemp(ModelMap modelMap) {
		// Birthday birthday = new Birthday();
		// birthday.setDate(new Date());
		// modelMap.put("birthday", birthday.getDate());
		User user = new User();
		modelMap.put("user", user);
		return "thymeleaf/index/index";
	}
	
	@RequestMapping("/form")
	public String receiveForm(User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		System.out.println("get it");
		return "thymeleaf/index/index";
	}
	
	@RequestMapping("/getList")
	public String retUserList(ModelMap modelMap) {
		User u1 = new User();
		u1.setName("zhangsan");
		u1.setAge(12);
		// u1.setBirthdate(new Date());
		User u2 = new User();
		u2.setName("heshan");
		u2.setAge(18);
		// u2.setBirthdate(new Date());
		List<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		modelMap.put("userList", list);
		return "thymeleaf/index/index";
	}
	
	@RequestMapping("/error")
	public String testErrorPage() {
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println(c);
		return "thymeleaf/index/index";
	}
}
