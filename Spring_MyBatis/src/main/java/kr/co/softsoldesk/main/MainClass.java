package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.mapper.MapperInterface;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		MapperInterface mapper = ctx.getBean("test_mapper", MapperInterface.class);
		
//		// 삽입
		/*
		 * 
		 * */
//		JdbcBean bean = new JdbcBean();
//		bean.setInt_data(3);
//		bean.setStr_data("스프링");
//		mapper.insert_data(bean);
		
		/*
		 * //수정 JdbcBean bean = new JdbcBean(); bean.setInt_data(2);
		 * bean.setStr_data("파이썬"); mapper.update_data(bean);
		 */

		// 삭제
		//mapper.delete_data(3);
		
//		List<JdbcBean> list = mapper.select_data();
//
//		for (JdbcBean bean : list) {
//			System.out.println(bean.getInt_data() + " : " + bean.getStr_data());
//
//		}

	}

}
