package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imooc.entity.DefaultUser;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private DefaultUser defaultUser;
	
	@RequestMapping("/getuser")
	@ResponseBody
	public Object getUser() {
		//User user = new User();
		//user.setName("gaga");
		//user.setAge(23);
		//user.setBirthdate(new Date());
		
		return defaultUser.getUsername();
	}
}
