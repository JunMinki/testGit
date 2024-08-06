package kr.co.softsoldesk.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softsoldesk.beans.dataBean1;
import kr.co.softsoldesk.beans.dataBean2;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(@ModelAttribute dataBean1 bean) {
		// @MedelAttribute : 알아서 자동으로 주입해줌 *굉장히 많이 씀
		System.out.println("data1 : " + bean.getData1());
		System.out.println("data2 : " + bean.getData2());

		for (int num : bean.getData3()) {
			System.out.println("data3 : " + num);
		}
		return "result";
	}

	@GetMapping("/test2")
	public String test2(dataBean1 bean1, dataBean2 bean2) {//@ModelAttribute는 생략 가
		System.out.println("data1 : " + bean1.getData1());
		System.out.println("data2 : " + bean1.getData2());
		
		for (int num : bean1.getData3()) {
			System.out.println("data3 : " + num);
		}
		System.out.println("--------------------------------------------------");
		
		System.out.println("data1 : " + bean2.getData1());
		System.out.println("data2 : " + bean2.getData2());
		
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(@RequestParam Map<String, String> map) {
		
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4(@RequestParam List<String> data3 ) {
		
		for(String str : data3) {
			System.out.println("str : " + str);
		}
		
		return "result";
	}
}
