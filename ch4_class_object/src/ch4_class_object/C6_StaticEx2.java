package ch4_class_object;

// static 정적 (멤버의 상반되는 단어로 사용)
// 객체끼리 서로 공유. 클래스당 하나가 생김
// static을 붙인 메소드는 일반 멤버변수를 사용할 수 없음
// static이 붙으면 제일 먼저 온다고 생각하자(메모리에 가장 먼저 올라감). = 아무도 부를 수 없음
// 같이 들어옴 = 객체를 생성
class Car2 {
	String color;
	static int speed;
	
	void print() {
		System.out.println("색상: " + color);
		System.out.println("속도: " + speed);
		System.out.println("++++++++++++++++++");
	}
}


public class C6_StaticEx2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2();
		
		c1.color = "빨강";
		c1.speed = 100;
		
		c2.color = "노랑";
		c2.speed = 120;
		
		c1.print();
		c2.print();
		
	}
}
