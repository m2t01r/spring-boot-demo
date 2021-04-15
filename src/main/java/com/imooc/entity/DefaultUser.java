package com.imooc.entity;

import java.util.Date;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:resource.properties")
@ConfigurationProperties(prefix="default.property")
public class DefaultUser {
	
	private String username;
	private String userage;
	private String usersex;
	private Date userbirthday;
	
	public Date getUserbirthday() {
		return userbirthday;
	}
	public void setUserbirthday(Date userbirthday) {
		this.userbirthday = userbirthday;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserage() {
		return userage;
	}
	public void setUserage(String userage) {
		this.userage = userage;
	}
	public String getUsersex() {
		return usersex;
	}
	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}
	
}
