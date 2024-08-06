package kr.co.softsoldesk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.mapper.MapperInterface;

@Controller
public class TestController {
	
	@Autowired
	MapperInterface mapper1;
	
	@GetMapping("/input_data")
	private String input_data() {
		
		return "input_data";
	}
	@PostMapping("/input_pro")
	private String input_pro(DataBean dataBean) {
		
		mapper1.insert_data(dataBean);
		
		return "input_pro";
	}
	@GetMapping("/read_data")
	private String read_data(Model model) {
		
		List<DataBean> list = mapper1.select_data();
		model.addAttribute("list", list);
		
		return "read_data";
	}

}
