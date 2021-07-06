package ch4_class_object;

class Car{
	String color;
	int speed;
	
	// 생성자로 초기화
	Car() {}
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	
	// 메소드로 초기화 가능
	void set(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void speedUp() {
		System.out.println(speed + "속도를 올렸습니다.");
	}
	void print() {
		System.out.println("색깔: " + color);
		System.out.println("속도: " + speed);
		
	}
	
}

// 실행이 있는 쪽에 ex를 붙임
public class C4_CarEx {
	public static void main(String[] args) {
		Car c1 = new Car("빨강", 1500);
		
		String co = c1.color;
		int sp = c1.speed;
		System.out.println("c1 차량의 색상은 " + co + " 속도는 " + sp);
		
		Car c2 = new Car();
		c2.set("노랑", 2000);
		System.out.println("c2 차량의 색상은 " + c2.color + "속도는 " + c2.speed);
	}

}
