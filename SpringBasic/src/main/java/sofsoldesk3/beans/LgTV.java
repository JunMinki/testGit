package sofsoldesk3.beans;

public class LgTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("==>Lg TV 전원 on");
	}

	@Override
	public void powerOff() {
		System.out.println("==>Lg TV 전원 off");
	}

	@Override
	public void volumeUp() {
		System.out.println("==>Lg TV 볼륨 up");
	}

	@Override
	public void volumeDown() {
		System.out.println("==>Lg TV 볼륨 down");	}
	
}
