package ch4_Inheritance;

import java.util.Scanner;

/*
 *					Calculator
 *					    |
 *			-------------------------
 *			|		|		|		| 
 * 		   Add	   Sub	   Mul	   Div
 * 			|				|
 * 			C				F
 * 		---------			|
 * 		|		|			G
 * 		D		E
 * 
 * 		D, E, G를 모두 Calculator에 업캐스팅 하였을 경우, 
 * 		Cal내 메소드만 보았을 대 파악이 어려운 상황이 발생할 수 있음
 */

class Calculator {
	void cal(int x, int y) {
		System.out.println("사칙 연산을 시작합니다. ");
	}
}

class Add extends Calculator {
	void cal(int x, int y) {
		System.out.println(x + "+" + y + "=" + (x + y));
	}

}

class Sub extends Calculator {
	void cal(int x, int y) {
		System.out.println(x + "-" + y + "=" + (x - y));
	}

}

class Mul extends Calculator {
	void cal(int x, int y) {
		System.out.println(x + "*" + y + "=" + (x * y));
	}

}

class Div extends Calculator {
	void cal(int x, int y) {
		System.out.println(x + "/" + y + "=" + (x / y));
	}

}

public class E3_Overriding2 {
	public static void main(String[] args) {
		// 오버라이딩 이해
		Calculator add = new Add();
		Calculator sub = new Sub();

		add.cal(10, 20);
		sub.cal(100, 50);

		// 출력 값
		/*
		 * 10+20=30 100-50=50
		 */

		// 실습
		System.out.println("연산을 선택해주세요(+, -, *, /)>> ");
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String str = sc.next(); // 연산자 받아서 변수 a 에 할당
		int y = sc.nextInt();

		if (str.equals("+")) {
			Calculator add2 = new Add();
			add2.cal(x, y);
		} else if (str.equals("-")) {
			Calculator sub2 = new Sub();
			sub2.cal(x, y);

		} else if (str.equals("*")) {
			Calculator mul2 = new Mul();
			mul2.cal(x, y);

		} else if (str.equals("/")) {
			Calculator div2 = new Div();
			div2.cal(x, y);

		} else {
			
		}
	}

}
