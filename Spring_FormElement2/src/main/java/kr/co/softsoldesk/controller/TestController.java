package kr.co.softsoldesk.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.KeyValueBean;

@Controller
public class TestController {
	
	@GetMapping("test1")
	public String test1(DataBean bean, Model model) {
		
		bean.setA1("data2");
		bean.setA2("data2");
		bean.setA3("data2");
		bean.setA4("data2");
		
		//==================================================
		
		//미리 배열안에 data값들을 선언해줌
		String [] data_list1 = {"data1", "data2", "data3"};
		model.addAttribute("list1", data_list1);

		//==================================================
		
		//배열선언 후 data값들을 넣어줌
		ArrayList<String> data_list2 = new ArrayList<String>();
		data_list2.add("data1");
		data_list2.add("data2");
		data_list2.add("data3");
		model.addAttribute("list2", data_list2);

		//==================================================
		
		//key_bean으로 모두 생성자로 만든 뒤 하나씩 생성자를 배열안에 넣어줌
		//그리고 그 배열을 jsp에서 key와 value만을 배열로써 추출함
		KeyValueBean key_bean1 = new KeyValueBean();
		KeyValueBean key_bean2 = new KeyValueBean();
		KeyValueBean key_bean3 = new KeyValueBean();
		
		key_bean1.setKey("항목1");
		key_bean1.setValue("data1");
		
		key_bean2.setKey("항목2");
		key_bean2.setValue("data2");
		
		key_bean3.setKey("항목3");
		key_bean3.setValue("data3");
		
		ArrayList<KeyValueBean> data_list3 = new ArrayList<KeyValueBean>();
		data_list3.add(key_bean1);
		data_list3.add(key_bean2);
		data_list3.add(key_bean3);
		
		model.addAttribute("list3", data_list3);
		
		//==================================================
		
		String[] check_list = {"data1", "data3"};
		
		bean.setA5(check_list);
		bean.setA6(check_list);
		bean.setA7(check_list);
		
		//==================================================
		
		//라디오 버튼
		bean.setA8("data2");
		bean.setA9("data2");
		bean.setA10("data2");
		
		return "test1";
	}
	
	@PostMapping("/result")
	public String result(DataBean bean) {
		
		System.out.println(bean.getA1());
		System.out.println(bean.getA2());
		System.out.println(bean.getA3());
		System.out.println(bean.getA4());
		
		for(String str : bean.getA5()) {
			System.out.println("a5 : " + str);
		}
		
		return "result";
	}
	
}
