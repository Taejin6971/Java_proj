package chapter14.ex05;

class Aaa {

	void abc() throws ClassNotFoundException {
		bcd();
	}

	void bcd() throws ClassNotFoundException {
		cde();
	}

	void cde() throws ClassNotFoundException {
		// DB 연결시 사용 : 일반 예외 - 반드시 예외 처리 (1. try catch, 2. throws)
		Class cls = Class.forName("java.lang.Object" + "1");
		System.out.println("존재하는 클래스 입니다.");
	}
}

public class Throws_Exception03 {
	public static void main(String[] args) {

		Aaa a = new Aaa();
		try {
			a.abc();
		} catch (ClassNotFoundException e) {
			System.out.println("=== 예외가 발생됨 ===");
			e.printStackTrace(); // 오류에 대한 자세한 정보를 출력해 달라. (디버깅)
		}
		System.out.println("프로그램 종료");

	}
}
