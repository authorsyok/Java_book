package ch06;

class Tv {
	String color;
	boolean power;
	int channel;
	
	// Tv의 기능(메서드)
	void power() 		{power = !power;}
	void channelUp() 	{ ++channel;    }
	void channelDown()  { --channel;    }
}

public class TvTest {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널의 " + t.channel + "입니다.");
	}

}
