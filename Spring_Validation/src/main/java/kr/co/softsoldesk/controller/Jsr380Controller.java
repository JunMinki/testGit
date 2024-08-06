package kr.co.softsoldesk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean7;

@Controller
public class Jsr380Controller {
	
	@GetMapping("/jsr380")
	private String jsr380(@ModelAttribute DataBean7 dataBean7) {
		return "jsr380/input";
	}
	
	@PostMapping("/input_process6")
	private String input_pro(@Valid DataBean7 dataBean7, BindingResult result) {
		
		if(result.hasErrors()) {
			return "jsr380/input";
		}//유효성 검사 실패
		
		return "jsr380/input_success";
	}
	
}
