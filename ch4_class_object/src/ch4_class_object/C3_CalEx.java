package ch4_class_object;

class PlusMinus{
	
	int plus;
	int minus;
	
	String plus(int x, int y) {
		plus = x+y;
		
//		return Integer.toString(plus);
		return "두 수의 합은" + plus; // 문자 + 숫자 = 문자 / 문자 * 숫자 = 문자
	}
	
	int Minus(int x, int y) {
		minus = x-y;
		
//		return Integer.toString(plus);
		return minus; // 문자 + 숫자 = 문자 / 문자 * 숫자 = 문자
	}
	
}
public class C3_CalEx {

	public static void main(String[] args) {

	}

}
