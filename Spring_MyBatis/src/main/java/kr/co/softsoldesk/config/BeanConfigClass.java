package kr.co.softsoldesk.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.mapper.MapperInterface;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public BasicDataSource datasource() {
		BasicDataSource source = new BasicDataSource();
		
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("system");
		source.setPassword("1130");
		
		return source;
	}
	
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception{
		//SqlSessionFactory: jdbc를 처리하는 객체
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		//SqlSessionFactoryBean: sqlSessionFactory를 만들기 위해 사용
		factoryBean.setDataSource(source);
		SqlSessionFactory factory = factoryBean.getObject();
		return factory;
		
	}
	
	@Bean
	public MapperFactoryBean<MapperInterface> test_mapper(SqlSessionFactory factory) {
		
		MapperFactoryBean<MapperInterface> factoryBean = new MapperFactoryBean<MapperInterface>(MapperInterface.class);
		factoryBean.setSqlSessionFactory(factory);
		
		return factoryBean;
		
	}
	
	
}
