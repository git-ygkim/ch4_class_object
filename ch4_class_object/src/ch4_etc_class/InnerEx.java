package ch4_etc_class;


class Out {

	// 멤버변수
	// 생성자
	// 메소드
	
	String name = "개똥이";
	
	void outPrint() {
		System.out.println("외부 메소드");
	}
	
	// 클래스 내의 클래스가 존재할 수 있다. 
	// 내부 클래스는 어떻게 객체를 생성 할 수 있는가? 
	// 바깥 객체 먼저 생성 후 내부 객체도 생성
	class inner {
		
		int age = 10;
		void InnerPrint() {
			
		}
		
	}
}

public class InnerEx {
	public static void main(String [] artgs) {
		
		Out out = new Out();
		System.out.println(out.name);
		out.outPrint();
		
		System.out.println("***********");
		// inner 클래스 객체 생성
		Out.inner oi = out.new inner();
		System.out.println(oi.age);
		oi.InnerPrint();
		
	System.out.println();
		
		
	}
}
