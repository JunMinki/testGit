package kr.co.softsoldesk8.beans;

public class TestBean2 {
	
	private int data1;
	private String data2;
	private DataBean2 data3;
	private DataBean2 data4;
	
	public TestBean2(DataBean2 data3, DataBean2 data4) {
		this.data3 = data3;
		this.data4 = data4;
	}

	public TestBean2(int data1, String data2, DataBean2 data3, DataBean2 data4) {
		super();
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}

	public int getData1() {
		return data1;
	}

	public String getData2() {
		return data2;
	}

	public DataBean2 getData3() {
		return data3;
	}

	public DataBean2 getData4() {
		return data4;
	}
	
	
	
}
