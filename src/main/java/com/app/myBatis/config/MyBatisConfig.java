package com.app.myBatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	private static SqlSessionFactory sqlSessionFactory;
	
	static {// config.xml의 정보를 읽어서 세션 공장을 만듦
		String resource = "com/app/myBatis/config/config.xml";
		// 세션이 날라갈 때 모든 정보를 담고 가야함

		try {

			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
}
