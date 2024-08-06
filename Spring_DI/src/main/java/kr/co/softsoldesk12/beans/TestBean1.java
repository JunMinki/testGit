package kr.co.softsoldesk12.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean1 {

	//#1
	@Autowired
	@Qualifier("data_bean1")//타입과 이름이 일치하면 자동으로 넣어줌
	private DataBean1 data1;
	
	//#2
	@Autowired
	@Qualifier("data_bean2")
	private DataBean1 data2;
	
	public DataBean1 getData1() {
		return data1;
	}
	public DataBean1 getData2() {
		return data2;
	}
}
