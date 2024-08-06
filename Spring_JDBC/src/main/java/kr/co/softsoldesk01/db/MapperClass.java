package kr.co.softsoldesk01.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.co.softsoldesk01.beans.JdbcBean;

@Component
public class MapperClass implements RowMapper<JdbcBean> {
	//RowMapper : db에서 가져온 값을 jdbc를 연결해주는 인터페이스 = resultset

	@Override
	public JdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		JdbcBean bean = new JdbcBean();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}
	
	
	
}
