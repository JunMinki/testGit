package kr.co.softsoldesk5.beans;

public class TestBean {
	
	private int data1;
	private double data2;
	private String data3;
	
	public TestBean() {
		System.out.println("TestBean의 기본 생성자");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = null;
	}
	
	public TestBean(int data1) {
		System.out.println("TestBean의 생성자 : int 변수 1개");
		this.data1 = data1;
		this.data2 = 0.0;
		this.data3 = null;
	}
	
	public TestBean(double data2) {
		System.out.println("TestBean의 생성자 : double 변수 1개");
		this.data1 = 0;
		this.data2 = data2;
		this.data3 = null;
	}
	
	public TestBean(String data3) {
		System.out.println("TestBean의 생성자 : String 변수 1개");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = data3;
	}
	//---여기까지는 간단함
	public TestBean(int data1, double data2, String data3) {
		System.out.println("TestBean의 생성자 : All 변수 3개");
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}
	
	public void printData() {
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
	}

}
