package ch4_abstract_interface;

// 예전에는 interface 사용 시 추상적인 것만 사용 가능하였으나, 
// 요즘에는 default, private, static 접근 지정자를 사용한 일반 메소드도 사용 가능
// 인터페이스 자체는 public임 그래서 'public abstract'는 생략 될 수 있음.
interface Call {
	
	// 인터페이스 에서는 상수만 사용 가능, 변수 사용 불가능
	public static final int COST = 1000;
	
	// 변수처럼 보이나, 실제로 컴파일 시 'public static final'이 붙음.
	int value = 1000;
	// int value; 변수 자체는 선언 불가
	
	public abstract void print();
	// 인터페이스 자체는 public임 그래서 'public abstract'는 생략 될 수 있음.
	void ring();	// 컴파일 될 때 자동으로 public abstract가 붙음
	
	public default void call() {
		System.out.println("전화를 잘 겁니다.");
	}
	
}
interface SNS {
	void textAMessage();
	
}
interface MP3 {
	void listenToMusic();
	
}
interface Navigation {
	void findRoute();
	
}


// interface 는 다중 상속 가능
interface AnaloguePhone extends Call, SNS, MP3, Navigation {
	void makePhone();
	
}

// interface를 상속 받을 경우에는 implements 사용하여 다중 구현 가능 
class AIPhone implements AnaloguePhone {

	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ring() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void textAMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listenToMusic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findRoute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makePhone() {
		// TODO Auto-generated method stub
		
	}
	
	void ai () {
		System.out.println("나는 인공지능 입니다. ");
	}

}

public class AIPhoneEx {
	public static void main(String[] args) {
		
		AIPhone ai = new AIPhone();
		ai.ring();
		ai.listenToMusic();
		ai.findRoute();
		

	}
	
}
