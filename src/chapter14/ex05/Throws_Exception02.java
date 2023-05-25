package chapter14.ex05;

// throws 는 계속 전가를 할 수 있다. .. 마지막 최종 적으로 main() 까지 전가 시킬수 있다.
class Aa {
	void abc() throws InterruptedException {
		bcd();
	}

	void bcd() throws InterruptedException {
		cde();
	}

	void cde() throws InterruptedException {
		Thread.sleep(1000); // 1초 동안 대기해라.
	}
}

public class Throws_Exception02 {
	public static void main(String[] args) {

		// Aa 객체 생성 후 메소드 호출
		Aa a = new Aa();

		// main ()로 가지 전까지 try catch로 예외 처리 (main() 까지 전가시 오류발생할수 있음)
		try {
			a.abc();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
