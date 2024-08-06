package kr.co.softsoldesk.beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserBean {
	

	private int user_idx;
	
	@Size(min=2, max=5)//2글자 이상 5글자 이하
	@Pattern(regexp = "[가-힣]*")//한글
	private String user_name;
	
	@Size(min=4, max=20)//4글자 이상 20글자 이하
	@Pattern(regexp = "[a-zA-z0-9]*")//영어 대소문자, 숫자로만 가능
	private String user_id;
	
	@Size(min=4, max=20)//4글자 이상 20글자 이하
	@Pattern(regexp = "[a-zA-z0-9]*")//영어 대소문자, 숫자로만 가능
	private String user_pw;
	
	//db테이블에 없는 속성
	@Size(min=4, max=20)//4글자 이상 20글자 이하
	@Pattern(regexp = "[a-zA-z0-9]*")//영어 대소문자, 숫자로만 가능
	private String user_pw2;
	
	private boolean userIdExist;
	
	public UserBean() {
		this.userIdExist = false;//userIdExist의 초기값은 false
		this.userLogin = false;//userLogin의 초기값은 false
	}
	
	private boolean userLogin;//로그인 상태를 확인
	
	public boolean isUserLogin() {
		return userLogin;
	}
	public void setUserLogin(boolean userLogin) {
		this.userLogin = userLogin;
	}
	public boolean isUserIdExist() {
		return userIdExist;
	}
	public void setUserIdExist(boolean userIdExist) {
		this.userIdExist = userIdExist;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_pw2() {
		return user_pw2;
	}
	public void setUser_pw2(String user_pw2) {
		this.user_pw2 = user_pw2;
	}
}
