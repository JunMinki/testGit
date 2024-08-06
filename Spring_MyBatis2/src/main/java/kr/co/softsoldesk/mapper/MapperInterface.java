package kr.co.softsoldesk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import kr.co.softsoldesk.beans.DataBean;

public interface MapperInterface {
	
	@Insert("insert into spring_mvc_table(data1, data2, data3) values(#{data1}, #{data2}, #{data3})")
	void insert_data(DataBean dataBean);
	
	@Select("select data1, data2, data3 from spring_mvc_table")
	List<DataBean> select_data();
	//여러개를 담을 수 있는 리스트로 데이터빈의 값을 전부 받아옴

}