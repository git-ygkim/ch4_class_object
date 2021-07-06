package ch4_class_object;
/*
 * private : 선언된 해당 클래스 안에서만 접근 가능
 * default : 같은 패키지 안에서 접근 가능
 * protected : 같은 패키지 안에서 접근 가능 + 다른 패키지이지만 상송관계일 때 접근 가능
 * public : 다른 패키지에서도 접근 가능
 */

public class Access {
				int nDefault;
	private 	int nPrivate;
	protected 	int nProtected;
	public 		int nPublic;
	
	void print() {
		nPrivate = 10;
	}
}
class Access2 {
	Access ac = new Access();
	{
	ac.nDefault = 10;;
//	ac.nPrivate = 20;	// 다른 클래스 이므로 접근 불가능
	ac.nProtected = 30;
	ac.nPublic = 40;
	
	}
	
}