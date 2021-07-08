package ch4_abstract_interface;

// 추상 <-> 구체화 

abstract class Animal {		// 추상 메소드를 사용하기 위해서는 추상 클래스 여야함
	String name;
	int age;
	
	
	abstract void walk();	// 추상 메소드 사용하기 위해 구현부가 없음 
							// abstract로 추상메소드임을 암시
	abstract void howl();
	abstract void sleep();
	
	void print() {
		System.out.println("부모 입니다.");
	}
}

abstract class Person extends Animal {
	
}

class Baby extends Person {

	@Override
	void walk() {
		
	}

	// 선언하지 않으면 추상 메소드로 남게 된다. 
	@Override
	void howl() {
		
	}

	@Override
	void sleep() {
		
	}
	
	void print() {
		System.out.println("귀요미 아기 입니다.");
	}
}

public class AnimalEx {
	public static void main(String[] args) {
		
		
		// 동물 a = new 동물();
		// Person p = new Person();
		Baby b = new Baby();
		
	}
	
}


