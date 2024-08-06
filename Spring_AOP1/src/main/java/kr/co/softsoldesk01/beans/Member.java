package kr.co.softsoldesk01.beans;

import org.springframework.stereotype.Component;

@Component
public class Member {
	
	public void borrowBook() {
		System.out.println("회원이 책을 빌려감");
	}
	public void record() {
		System.out.println("기록남김");
	}

}
