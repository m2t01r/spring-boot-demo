package com.imooc.configuration;

import java.beans.PropertyVetoException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 配置数据库连接池,获取dataSource
 * @author yuguangyuan
 *
 */
@Configuration
public class DataSourceConfig {
	
	@Value("${jdbc.Driver}")
	private String Driver;
	
	@Value("${jdbc.URL}")
	private String URL;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;

	public String getDriver() {
		return Driver;
	}

	public void setDriver(String driver) {
		Driver = driver;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 实例化数据库连接池
	 * c3p0实现
	 * @return
	 * @throws PropertyVetoException
	 */
	@Bean(name = "dataSource")
	public ComboPooledDataSource createDataSource() 
			throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		// 基本属性配置
		dataSource.setDriverClass(Driver);
		dataSource.setJdbcUrl(URL);
		dataSource.setUser(username);
		dataSource.setPassword(password);
		// 额外属性配置
		dataSource.setMaxPoolSize(30);
		dataSource.setMinPoolSize(10);
		dataSource.setAutoCommitOnClose(false);
		dataSource.setCheckoutTimeout(10000);
		dataSource.setAcquireRetryAttempts(2);
		return dataSource;
	}
	
}
