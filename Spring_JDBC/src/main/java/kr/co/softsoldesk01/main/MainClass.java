package kr.co.softsoldesk01.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk01.beans.JdbcBean;
import kr.co.softsoldesk01.config.BeanConfigClass;
import kr.co.softsoldesk01.db.jdbcDAO;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		jdbcDAO dao = ctx.getBean(jdbcDAO.class);

		/*
		  //삽입
		  JdbcBean bean1 = new JdbcBean(); bean1.setInt_data(3);
		  bean1.setStr_data("JavaSciprt");
		  
		  dao.insert_data(bean1); System.out.println("저장완료");
		 */
		
		/*
		수정
		JdbcBean bean2 = new JdbcBean();
		bean2.setInt_data(3);
		bean2.setStr_data("Spring");
		dao.update_data(bean2);
		System.out.println("수정완료");
		*/
		/*
		삭제
		dao.delete_data(3);
		System.out.println("삭제완료");
		*/
		
		//여러 행 출력
		List<JdbcBean> list = dao.select_data();
		for(JdbcBean bean3 : list) {
			System.out.println("int_data : " + bean3.getInt_data());
			System.out.println("Str_data : " + bean3.getStr_data());
		}
		//단일 행 출력
		JdbcBean bean4 = dao.select_one(1);
		System.out.println(bean4.getInt_data());
		System.out.println(bean4.getStr_data());
		
		ctx.close();
	}

}
