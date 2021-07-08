package ch4_Inheritance;

/*
 * 오버라이딩 (vs. 오버로딩)
 * 	.	상속관계에서 발생
 * 	.	부모에 있는 메소드를 자식이 재정의 해서 사용하는 것
 *  . 	업캐스팅하여 부모의 오버라이딩 한 메소드를 호출하면, 자식의 오버라이딩 한 메소드를 자동호출한다. 
 */

class Shape {
	Shape(){}
	void draw() {
		System.out.println("도형을 그립니다.");
	}
	void a() {
		System.out.println("저녁입니다. ");
	}
}

class Line extends Shape {
	// 물려 받았는데 왜 다시 수정하는가? 재정의
	@Override	// annotation
	void draw() {
		System.out.println("선을 그립니다.");	
	}
	void print() {
		System.out.println("목요일");
	}
}


class Rect {
	
}


class Circle {
	
}


public class E2_Overriding {
	public static void main(String[] args) {	
		Shape shap = new Shape();
		Line line = new Line();
		
		Shape sh = new Line();	// 업캐스팅
//		sh.print();	// 자식 접근 불가

		sh.a();		//
		sh.draw();
		
		// 출력 값 
		/* 저녁입니다.		// 오버라이딩 안해서 접근 가능
		 * 선을 그립니다.	// 오버라이딩 해서 자식 것으로 출력
		 */

	}
	
}
