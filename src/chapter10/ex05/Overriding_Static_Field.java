package chapter10.ex05;

class Aa {

	// 정적 필드
	static int m = 3;
}

class Bb extends Aa {

	static int m = 4;
}

public class Overriding_Static_Field {
	public static void main(String[] args) {

//		정적 필드 : 클래스 영역에 필드의 값이 저장이 되어 있음. 부모/자식의 필드는 별개임.
//			- 모든 객체에서 공유되는 공간 
//			- 객체 생성 후 호출 가능
//			- 객체 생성 없이 클래스 이름으로 호출 가능

		// 객체 생성 후 호출
		// 자식 객체를 생산시 부모 타입으로 지정
		Aa b1 = new Bb();
		System.out.println(b1.m); // 3

		// 다운 캐스팅
		Bb b2 = (Bb) b1;
		System.out.println(b2.m); // 4

		// 객체 생성 없이 클래스 이름으로 호출
		System.out.println(Aa.m); // 3
		System.out.println(Bb.m); // 4

	}
}
