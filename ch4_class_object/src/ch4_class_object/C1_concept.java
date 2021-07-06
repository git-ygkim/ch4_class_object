package ch4_class_object;

class Concept {
	
	// 멤버변수
	String name;
	int age;
	String phone;
	
	// 생성자()
	// . 클래스 이름과 같은 메소드
	// . 객체를 만드는 역할
	// . 클래스명 축약어 = new 생성자
	//   Scanner sc = new Scanner();
//	C1_concept() {} // 기본생성자
//	C1_concept(String name, String age, String phone) {
//		
//	}
	// 
//	Concept(String n) {
//		
//	}
	// this는 멤버변수, 그냥 name은 인자값;
	Concept(String name) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	// 메소드()
	void print() {
		
		return;	// 종료의 역할. 그러나 리턴 값을 반환할 수는 없음. 
//		- 완성형이여야 한다.
//		- 구현하고 끝
//		- 프린트하고 끝
//		- 값을 넣어주고 끝 등
	}

	// 타입 : 리턴하고자 하는 값의 타입
	String getName() {
		
		return name;
	}
	
	int getAge() {
		
		return age;
	}
}

// 하나의 파일에 여러개의 클래스 일 경우 public은 하나여야 한다. 
// 실행 하는 main 메소드가 있는 클래스에 public을 붙여야 한다. 
public class C1_concept{
	public static void main(String[] args) {
		
		// 객체 생성 - 클래스(도면)을 사용하려면
		Concept c = new Concept("윤교이");
	}
	
}