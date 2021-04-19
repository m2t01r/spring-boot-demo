package com.imooc.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
	
	@JsonIgnore // 字段不返回
	private String name;
	private Integer age;
	
	// @JsonInclude(Include.NON_NULL) // 对字段进行过滤
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss", locale="zh", timezone="GMT+8")
	private Date birthday;
	
	private String desct;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String getDesct() {
		return desct;
	}
	public void setDesc(String desct) {
		this.desct = desct;
	}
	
}
