package kr.co.softsoldesk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean8;
import kr.co.softsoldesk.validator.DataBean8Validator;

@Controller
public class customValidatorController {
	
	@GetMapping("/customValidator")
	private String customValidato(@ModelAttribute DataBean8 dataBean8) {
	
		return "customValidator/input";
	}
	@PostMapping("/input_process7")
	private String input_process(@Valid DataBean8 dataBean8, BindingResult result) {
		
		if(result.hasErrors()) {
			return "customValidator/input";
		}
		return "customValidator/input_success";
	}
	
	//Validator를 Controller에 등록
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		DataBean8Validator validator = new DataBean8Validator();
		binder.addValidators(validator);
	}
	
}
