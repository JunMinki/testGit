package kr.co.softsoldesk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean6;

@Controller
public class Jsr250Controller {

	@GetMapping("/jsr250")
	public String jsr250(@ModelAttribute DataBean6 dataBean6) {
	
		return "jsr250/input";
	}
	@PostMapping("input_proJsr250")
	public String input_proJsr250(@Valid DataBean6 dataBean6, BindingResult result) {
		if(result.hasErrors()) {
			return "jsr250/input";
		}
		return "jsr250/input_success";
	}
}
