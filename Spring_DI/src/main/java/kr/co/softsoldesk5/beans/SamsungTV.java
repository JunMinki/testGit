package kr.co.softsoldesk5.beans;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("===>Samsung TV 객체 생성");
	}

	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===>Samsung TV(2) 객체 생성");
		this.speaker = speaker;
	}

	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("===>Samsung TV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTv---전원을 켠다");
		System.out.println("가격 : " + price);
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV---전원을 끈다");

	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

}
