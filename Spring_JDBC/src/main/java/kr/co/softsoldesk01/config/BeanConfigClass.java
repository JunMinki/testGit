package kr.co.softsoldesk01.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"kr.co.softsoldesk01.db"})
public class BeanConfigClass {
	
	//DataSource
	@Bean
	public BasicDataSource source() {
	//BasicDataSource: DBCP 라이브러리를 사용해 DB 연결 관리 객체
	BasicDataSource source = new BasicDataSource();
	source.setDriverClassName("oracle.jdbc.OracleDriver");
	source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	source.setUsername("system");
	source.setPassword("1130");
	
	return source;
	
	}
	
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
	
	//JdbcTemplate : JDBC 코드 작성을 단순화하고 관리함	
		JdbcTemplate db = new JdbcTemplate(source);
		
		return db;
		
	}

}
