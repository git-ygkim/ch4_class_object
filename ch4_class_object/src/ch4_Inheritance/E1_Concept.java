package ch4_Inheritance;

class A {
	int a = 3;
	int b = 10;

	A(){}
	A(int a) {
		System.out.println("난 부모 클래스야");
	}
	void A() {
		System.out.println("부모 메소드");
	}

	
}

// 상속 관계에서 생성자는 상속되지 않음
// 결국 부모도 객체를 생성함을 기억하기
class B extends A {	// 상속 extends 
	B(){}
	B(int a) {
		super(3);	// 생성자에서 사용해야함. 반드시 첫 줄에서 사용하여야 한다.
					// 첫줄에 작성, 생성자 속에서 작성, 명시적으로 부모 생성자를 호출
					// super(), this(), super.멤버, this.멤버
		System.out.println("난 자식의 기본 생성자야");
	}
	void B() {
		System.out.println("난 자식 메소드야");
	}
}


public class E1_Concept {
	
	public static void main(String[] args) {
		
		B b = new B(32);
		// | 
		// -----------> a :
		// 				b :
		//				a():
		//			   -------
		//				b()
		
		b.a = 100;
		b.b = 200;
		b.A();
		b.B();
		
		// 업캐스팅 : 자식이 부모로 형 변환
		// 내가 부모로 형변환을 하는 순간 자식에 있는 것은 사용 못함. 부모가 되어 버림
		A a = new B(20);	
		a.a = 100;
		a.b = 200;
		a.A();
//		a.B(); - 이 경우 자식의 멤버에 접근할 수 없다. 부모 것만 접근 가능
		
		// 다운캐스팅 : 업캐스팅된 부모를 자식으로 다시 형변환
		B b1 = (B)a;
		b1.a = 200;
		b1.b = 300;
		b1.A();
		b1.B();
	}

}
