package chapter11.ex01;

class Aa {

	// 자식 클래스에서 오버라이딩 가능 : 부모의 실행블락 코드를 자식에서 새롭게 정의해서 사용 가능
	void print() {
		System.out.println("Aa - print()");
	}

	// 자식 클래스에서 오버라이딩 불가능 : 아주 중요한 메소드 <== 자식 클래스에서 수정 못하도록 설정
	final void run() {
		System.out.println("Aa - run()");
	}
}

class Bb extends Aa {

	@Override
	void print() {
		System.out.println("Bb - print()");
	}

	// 오버 라이딩이 불가함
//	void run() {
//	}
}

public class Final_Method {
	public static void main(String[] args) {

//		Final Method : 자식 클래스에서 오버라이딩을 불가하도록 부모 클래스의 인스턴스 메소드에서 설정
		
	}
}
