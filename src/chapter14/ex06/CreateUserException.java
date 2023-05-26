package chapter14.ex06;

// 1. 일반 예외 (사용자 정의 예외)
class MyException extends Exception {

	// 1. 기본 생성자
	MyException() {
//		super();
	}

	// 2. 오류 메세지를 인풋받아 처리하는 생성자
	MyException(String message) {
		super(message); // 부모(Exception)의 생성자에 넣어줌
	}
}

// 2. 실행 예외 (사용자 정의 예외)
class MyRTException extends RuntimeException {

	// 1. 기본 생성자
	MyRTException() {
		super();
	}

	// 2. 오류 메세지를 인풋받아 처리하는 생성자
	MyRTException(String message) { // 오류 메세지를 인풋 받아서 부모 클래스의 생성자에게 던짐.
		super(message);
	}
}

// 3. 사용자 정의 예외를 사용하는 클래스
class A {

	// 1. 사용자 정의 예외의 객체 생성 (필드)
	MyException m1 = new MyException(); // 일반 예외 처리 (기본 생성자)
	MyRTException m2 = new MyRTException(); // 실행 예외 처리 (기본 생성자)

	MyException mre1 = new MyException("예외 메세지 : MyException"); // 오류 메세지를 생성자에 넣어 처리하는 객체생성
	MyRTException mre2 = new MyRTException("예외 메세지 : MyRTException");

	// 2. 예외 던지기 (throw : 예외를 강제로 발생시킴)
	// 2.1 정수를 인풋받아서 70 이하이면 예외를 강제로 발생시키기(예외를 직접 처리)
	void abc_1(int num) {
		try {
			if (num > 70) {
				// 정상처리
				System.out.println("당신이 넣은 값은 : " + num + " 이고, 정상작동");
			} else {
				// 예외를 강제로 발생
				throw mre2; // RuntimeException
			}
		} catch (MyRTException e) {
			System.out.println(e.getMessage()); // 실행 예외가 발생 되었을때 예외 메세지를 출력해라
		}
	}

	// abc_1() 호출하는 메소드
	void bcd_1(int a) {
		abc_1(a);
	}

	// 2.2 정수를 인풋받아서 70 이하이면 예외를 강제로 발생시키기(예외를 미루기)
	void abc_2(int num) throws MyException { // abc_2()를 호출 하는 쪽에서 예외를 처리해야함
		if (num > 70) {
			// 정상처리
			System.out.println("당신이 넣은 값은 : " + num + " 이고, 정상작동");
		} else {
			// 예외를 강제로 발생 (throws : 예외 미루기, throw : 예외를 강제로 발생)
			throw mre1; // 일반 예외
		}
	}

	void bcd_2(int a) {
		try {
			abc_2(a);
		} catch (MyException e) {
			System.out.println(e.getMessage()); // MyException의 생성자에 넣은 오류 메세지를 출력해라
		}
	}
}

public class CreateUserException {
	public static void main(String[] args) {

//		사용자 정의 예외 : Java에서 제공되지 않는 예외를 자신이 직접 만들어서 사용하는 예외
//			- 일반예외 (checked Exception) : 컴파일 단계에서 오류가 발생, 예외 처리가 반드시 필요
//				- Exception 클래스를 상속해서 사용자 정의 예외 생성 (1. 기본생성자, 2. 오류 메세지를 처리할 생성자)
//			- 실행예외 (Unchecked Exception, RunTime Exception) : 실행시 예외 발생, 
//				- RunTimeException 클래스를 상속해서 사용자 정의 예외 생성 (1. 기본생성자, 2. 오류 메세지를 처리할 생성자)

		A a1 = new A();
		a1.bcd_1(70);
		a1.bcd_2(80);

	}
}
