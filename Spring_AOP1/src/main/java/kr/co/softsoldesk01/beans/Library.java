package kr.co.softsoldesk01.beans;

import org.springframework.stereotype.Component;

@Component
public class Library {
	
	public void borrowBook() {
		System.out.println("도서관이 회원에게 책을 빌려줌");
	}
	public void record() {
		System.out.println("기록남김");
	}

}
