package pak;

import ch4_class_object.Access;

class Access4 {
	Access ac = new Access();
	{
//		ac.nProtected = 30;	// 같은 클래스도 아니고, 상속 받지 않았으므로 사용 불가능
		ac.nPublic = 40;
	}
}

public class Access3 extends Access {
	
	int b;
	void b() {
		b = 5;
//		nPrivate = 50; 	//상속 관계여도 같은 클래스가 아니므로 사용 불가능
		nProtected = 30;	
		nPublic = 40;
	}
}
