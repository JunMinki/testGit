package kr.co.softsoldesk01.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.co.softsoldesk01.beans.JdbcBean;

@Component
public class jdbcDAO {
	
	@Autowired
	private JdbcTemplate db;
	
	@Autowired
	private MapperClass mapper;
	
	public void insert_data(JdbcBean bean) {
		
		String sql = "insert into jdbc_table (int_data, str_data) values(?, ?)";
		db.update(sql, bean.getInt_data(), bean.getStr_data());
		
	}
	public void update_data(JdbcBean bean) {
		
		String sql = "update jdbc_table set str_data = ? where int_data = ?";
		db.update(sql, bean.getStr_data(), bean.getInt_data());
		
	}
	public void delete_data(int int_data) {
		String sql = "delete from jdbc_table where int_data = ?";
		db.update(sql, int_data);
	}
	public List<JdbcBean> select_data() {
		
		String sql = "select int_data, str_data from jdbc_table";
		List<JdbcBean> list = db.query(sql, mapper);
		return list;	
	}
	public JdbcBean select_one(int int_data) {
		String sql = "select int_data, str_data from jdbc_table where int_data = ?";
		JdbcBean bean = db.queryForObject(sql, mapper, int_data);
		return bean;
	}
}
