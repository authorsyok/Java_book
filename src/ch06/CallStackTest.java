package ch06;

public class CallStackTest {
	public static void main(String[] args) {
		
		firstMethod();	//static 메서드는 개체 생성없이 호출가능
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()" );
	}
}
