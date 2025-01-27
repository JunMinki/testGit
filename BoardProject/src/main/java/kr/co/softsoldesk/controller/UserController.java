package kr.co.softsoldesk.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softsoldesk.beans.UserBean;
import kr.co.softsoldesk.service.UserService;
import kr.co.softsoldesk.validator.UserValidator;

@Controller
@RequestMapping("/user") // 메서드들의 GetMapping의 경로값을 줄여주기 위해서 사용
public class UserController {

	@Autowired
	private UserService userService;

	@Resource(name = "loginUserBean")
	private UserBean loginUserBean;

	@GetMapping("/login")
	private String login(@ModelAttribute("tempLoginUserBean") UserBean tempLoginUserBean,
			@RequestParam(value = "fail", defaultValue = "false") boolean fail, Model model) {

		model.addAttribute("fail", fail);

		return "user/login";

	}

	@PostMapping("/login_pro")
	private String login_pro(@Valid @ModelAttribute("tempLoginUserBean")UserBean tempLoginUserBean, BindingResult result, UserBean joinUserBean) {
		//Valid는 User객체의 필드에 대한 유효성 검사를 수행!
		//BindingResult는 검사결과값을 담는다!
		if(result.hasErrors()) {
			return "user/login";//로그인 유효성 위배
		}
		//유효성 검사가 통과되면 userService에게 던져주고
		
		userService.getLoginUserInfo(joinUserBean);
		
		if (loginUserBean.isUserLogin() == true) {
			return "user/login_success";
		} else {
			return "user/login_fail";
		}
	}

	@GetMapping("/not_login")
	public String not_login() {

		return "user/not_login";
	}

	@GetMapping("/join")
	private String join(@ModelAttribute("joinUserBean") UserBean joinUserBean) {

		return "user/join";
	}

	@PostMapping("/join_pro")
	private String join_pro(@Valid @ModelAttribute("joinUserBean") UserBean joinUserBean, BindingResult result) {

		if (result.hasErrors()) {
			return "user/join";
		}

		userService.addUser(joinUserBean);// 맵퍼에 올려둔 테이블에 저장

		return "user/join_success";
	}

	@GetMapping("/modify")
	private String modify(@ModelAttribute("modifyUserBean") UserBean modifyUserBean) {
		
		userService.getModifyUserInfo(modifyUserBean);

		return "user/modify";
	}
	
	@PostMapping("/modify_pro")
	public String modify_pro(@Valid @ModelAttribute("modifyUserBean") UserBean modifyUserBean, BindingResult result) {
		
		if(result.hasErrors()) {
			
			return "user/modify";
			
		}
		
		userService.modifyUserInfo(modifyUserBean);
		
		return "user/modify_success";
	}

	@GetMapping("/logout")
	private String logout() {

		loginUserBean.setUserLogin(false);// 로그아웃이 되었기에 로그아웃 값만 출력해주게 됨

		return "user/logout";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		UserValidator validator1 = new UserValidator();
		binder.addValidators(validator1);
	}

}
