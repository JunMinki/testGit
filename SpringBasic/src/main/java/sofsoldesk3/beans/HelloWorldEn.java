package sofsoldesk3.beans;

public class HelloWorldEn implements HelloWorld {
	
	@Override
	public void sayHello() {
		say();
	}
	
	public void say() {
		System.out.println("안녕하세요");
	}
	
}
