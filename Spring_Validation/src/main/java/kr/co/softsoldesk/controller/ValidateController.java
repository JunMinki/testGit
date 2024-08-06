package kr.co.softsoldesk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.dataBean3;

@Controller
public class ValidateController {

	@GetMapping("/validate")
	public String validate() {
		
		
		
		return "validate/input";
	}
	//#3-1
	@PostMapping("/input_pro")
	public String input_pro(@ModelAttribute @Valid dataBean3 dataBean3, BindingResult result) {
	//@Valid: 유효성 검사 수행
	//BindingResult: 유효성 검사의 결과를 담을 객체, 위배된 결과를 Errors에 담음
		System.out.println("data1 : " + dataBean3.getData1());
		System.out.println("data2 : " + dataBean3.getData2());
		
		//System.out.println("Binding Result : " + result);
		
		if(result.hasErrors()) {
			
			for(ObjectError obj : result.getAllErrors()) {
				System.out.println("메시지 : " + obj.getDefaultMessage());
				System.out.println("code : " + obj.getCode());
				System.out.println("name : " + obj.getObjectName());
				System.out.println("----------------------------------");
				
				String [] codes = obj.getCodes();
				
				for(String code :codes) {
					System.out.println(code);
				}
				
				if(codes[0].equals("Size.dataBean3.data1")) {
					System.out.println("data1은 2~10글자만 담을 수 있습니다.");
				}else if(codes[0].equals("MaxdataBean3.data2")){
					System.out.println("data2는 100 이하의 값만 담을 수 있습니다.");
				}
				System.out.println("----------------------------------");
				
			}
			return "validate/input";
		}
		
		return "validate/input_success";
	}
	
	
}
