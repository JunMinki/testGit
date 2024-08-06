package kr.co.softsoldesk.beans;

import javax.validation.constraints.Size;

//#7 customValidator
public class DataBean8 {
	
	@Size(min=2, max=10)
	private String data1;
	
	private String data2;//값이 null이거나 길이가 0인 경우
	
	private String data3;//값이 null이거나 길이가 0이거나 공백으로 구성되어 있는 경우
	
	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public String getData3() {
		return data3;
	}

	public void setData3(String data3) {
		this.data3 = data3;
	}
	
}
