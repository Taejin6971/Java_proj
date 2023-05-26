package chapter14.ex06;

// 음수의 값을 넣으면 예외 강제발생 : 일반 예외
class MinusException extends Exception {

	// 기본 생성자
	MinusException() {
	}

	// 예외의 메세지를 처리하는 생성자
	MinusException(String message) { // e.getmessage()
		super(message);
	}
}

// 100점 이상 값을 넣으면 예외 강제 발생 : 일반 예외
class OverException extends Exception {

	// 기본 생성자
	OverException() {
	}

	// 예외의 메세지를 처리하는 생성자
	OverException(String message) { // e.getmessage()
		super(message);
	}
}

// 사용자 정의 예외를 사용하는 클래스
class Aa {

	void checkScore(int score) throws MinusException, OverException {
		if (score < 0) {
			// MinusException 호출
			throw new MinusException("예외 발생됨 : 음수 값은 입력 불가합니다.");
		} else if (score > 100) {
			// OverException 호출
			throw new OverException("예외 발생됨 : 100점 이상은 입력 불가합니다.");
		} else {
			System.out.println("정상적으로 값이 입력 되었습니다. : " + score);
		}
	}
}

public class Use_User_Exception {
	public static void main(String[] args) {

		// 객체 생성
		Aa a1 = new Aa();

		// 메소드 호출 : throws 미뤘기 떄문에 호출 하는 족에서 예외 처리
		try {
			a1.checkScore(101);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}

	}
}
