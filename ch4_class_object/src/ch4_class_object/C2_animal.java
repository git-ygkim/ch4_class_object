package ch4_class_object;

// 한 파일에 public 은 1개 존재하여야 함

class Talk {
	// 멤버변수(필드)
	String str;
	int age;

	// 생성자 : 객체를 생성하는 역할, 초기화시켜 주는 역할 클래스의 이름과 같은 메소드 형태
	// 기본 생성자 - 생략할 수 있음(다른 생성자들이 이쓸 경우) /
	// 그러나 생성자가 하나도 없을 경우에는 기본 생성자가 있어야함 - 안그러면 상속 시 오류가 발생함
	Talk(String str) {
		this.str = str;

	}

	Talk(String str, int age) {
		this.str = str;
		this.age = age;

	}

	// 메소드
	void print() {

	}

	void print(String str) {
		this.str = str;

	}

	void print(String str, int age) {
		this.str = str;
		this.age = age;

	}
	
	String speak() {
		
		return "화요일";
	}

}

class Laugh {

}

public class C2_animal {
	public static void main(String[] args) {

//		Talk sp0 = new Talk();
		Talk sp1 = new Talk("멍멍");
		Talk sp2 = new Talk("야옹~", 20);
		sp2.str = "수요일";
		sp2.print();
		sp2.print("꼬꼬댁");
		sp2.print("음메", 10);
		
		// String s = "화요일";
		String s = sp2.speak();

	}
}
