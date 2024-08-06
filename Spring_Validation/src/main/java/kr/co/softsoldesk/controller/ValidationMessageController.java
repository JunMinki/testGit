package kr.co.softsoldesk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean4;
import kr.co.softsoldesk.beans.DataBean5;

@Controller
public class ValidationMessageController {
	
	@GetMapping("/validationMessage")
	public String validationMessage(@ModelAttribute DataBean5 dataBean5) {
		
		return "validationMessage/input";
	}
	
	@PostMapping("/input_proccess")
	public String input_pro(@Valid DataBean4 dataBean4, BindingResult result, DataBean5 databean5) {
		
		if(result.hasErrors()) {
			return "validationMessage/input";
		}
		
		return "validationMessage/input_success";
	}
	
	@PostMapping("/input_process2")
	public String input_pro2(@Valid DataBean5 databean5, BindingResult result) {
		
		if(result.hasErrors()) {
			return "validationMessage/input";
		}
		return "validationMessage/input_success";
	}
	
}
