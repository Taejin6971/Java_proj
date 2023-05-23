package chapter10.ex06;

class Aaa {

	// 기본 생성자
	Aaa() {
		System.out.println("Aaa 생성자");
	}
}

class Bbb extends Aaa {

	Bbb() {
		// super(); 생략 되어있음
		System.out.println("Bbb 생성자");
	}
}

class Ccc {

	Ccc(int a) {
		System.out.println(a);
		System.out.println("Ccc 생성자 호출");
	}
}

class Ddd extends Ccc {
	
	Ddd(){
		super(3);
		System.out.println("Ddd 생성자 호출");
	}
}

public class Super_Method {
	public static void main(String[] args) {

//		super() : 생성자 내부에서 사용, 생성자 첫 라인에 배치, 부모(Super) 클래스의 생성자 호출

		// 자식 객체 생성시 부모의 기본 생성자를 먼저 호출 한다.
		Bbb b1 = new Bbb(); // Aaa생성자/Bbb생성자

		System.out.println("==================");
		
		// 자식 객체 생성시 부모 객체를 먼저 호출
		Ddd c1= new Ddd(); // 3/Ccc생성자/Ddd생성자
	}
}
