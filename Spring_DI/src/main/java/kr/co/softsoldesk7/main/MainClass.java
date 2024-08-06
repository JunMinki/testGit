package kr.co.softsoldesk7.main;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk7.beans.DataBean;
import kr.co.softsoldesk7.beans.TestBean;

public class MainClass {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk7/config/beans.xml");
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		
		List<String> list1 = t1.getList1();
		for(String str : list1) {
			System.out.println("list1 : " + str);
		}
		System.out.println("=======================");

		List<Integer> list2 = t1.getList2();
		for(int value : list2) {
			System.out.println("list2 : " + value);
		}
		System.out.println("=======================");

		List<DataBean> list3 = t1.getList3();
		for(DataBean data : list3) {
			System.out.println("list3 : " + data);
		}

		System.out.println("=======================");
		
		Set<String> set1 = t1.getSet1();
		for(String str : set1) {
			System.out.println("set1 : " + str);
		}
		System.out.println("=======================");
		
		Set<Integer> set2 = t1.getSet2();
		for(int value : set2) {
			System.out.println("set2 : " + value);
		}
		System.out.println("=======================");
		
		Set<DataBean> set3 = t1.getSet3();
		for(DataBean data : set3) {
			System.out.println("set3 : " + data);
		}
		System.out.println("=======================");
		
		Map<String, Object> map = t1.getMap1();
		
		String a1 = (String)map.get("a1");
		int a2 = (Integer)map.get("a2");
		DataBean a3 = (DataBean)map.get("a3");
		DataBean a4 = (DataBean)map.get("a4");
		List<String> a5 =(List<String>)map.get("a5");
		
		System.out.println("map - a1 : " + a1);
		System.out.println("map - a2 : " + a2);
		System.out.println("map - a3 : " + a3);
		System.out.println("map - a4 : " + a4);
		
		for(String str : a5) {
			System.out.println("map - a5 : " + str);
		}
		ctx.close();
		
	}
	
}
