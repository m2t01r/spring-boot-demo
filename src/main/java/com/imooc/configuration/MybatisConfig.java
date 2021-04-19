package com.imooc.configuration;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * mybatis + dataSource
 * 配置信息
 * @author yuguangyuan
 *
 */
@Configuration
@MapperScan("com.imooc.dao")
public class MybatisConfig {
	
	@Autowired
	private DataSource dataSource;
	
	// mybatis配置文件路径
	private static String mybatisConfigPath;
	
	// mapper的文件路径
	private static String mappersPath;
	
	// 实体类的路径
	private static String entitysPath;
	
	@Value("${mybatis_config_file}")
	public void setMybatisConfigPath(String mybatisConfigPath) {
		MybatisConfig.mybatisConfigPath = mybatisConfigPath;
	}
	
	@Value("${mapper_path}")
	public void setMappersPath(String mappersPath) {
		MybatisConfig.mappersPath = mappersPath;
	}
	
	@Value("${entity_path}")
	public void setEntitysPath(String entitysPath) {
		MybatisConfig.entitysPath = entitysPath;
	}
	
	/**
	 * 返回mybatis配置路径
	 * @return
	 * @throws IOException
	 */
	@Bean(name = "sqlSessionFactoryBean")
	public SqlSessionFactoryBean getMybatisSqlSessionFactory() throws IOException {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		// 配置数据源
		sqlSessionFactoryBean.setDataSource(dataSource);
		// 配置mybatis配置文件路径
		sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigPath));
		// 配置mapper的路径
		PathMatchingResourcePatternResolver pathMatchingResoucePatternResolver = 
				new PathMatchingResourcePatternResolver();
		String packageSearchPath = ResourcePatternResolver.CLASSPATH_URL_PREFIX + mappersPath;
		sqlSessionFactoryBean.setMapperLocations(pathMatchingResoucePatternResolver
				.getResources(packageSearchPath));
		// 配置实体类所在的路径
		sqlSessionFactoryBean.setTypeAliasesPackage(entitysPath);
		return sqlSessionFactoryBean;
	}
	
}
