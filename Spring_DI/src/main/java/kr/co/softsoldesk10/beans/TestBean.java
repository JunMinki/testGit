package kr.co.softsoldesk10.beans;

public class TestBean {
	
	public TestBean() {
		System.out.println("TestBean의 생성자입니다.");
	}
	public void init() {
		System.out.println("TestBean의 init 메서드");
	}
	public void destory() {
		System.out.println("TestBean의 destroy 메서드");
	}
	
}
