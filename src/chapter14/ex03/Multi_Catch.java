package chapter14.ex03;

public class Multi_Catch {
	public static void main(String[] args) {

//		Multi_catch : 프로그램 내에서 여러 예외를 하나의 try catch를 사용해서 처리 하는 방법
//			1. 각각 처리하는 방법
//			2. try 블락에 여러 예외를 적용하고, 각각의 catch 블락을 만들어서 처리
//			3. try 블락에 여러 예외를 적용하고, Exception을 통합적으로 한꺼번에 처리하는 방법

		System.out.println("=== 1. 각각 처리하는 방법===========================");

		// 1. 각각 처리하는 방법 : try catch를 매번 사용함.
		try {
			System.out.println(3 / 0); // 예외 : ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
		}

		try {
			int num = Integer.parseInt("10!"); // 예외 : NumberFormatException
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException 발생");
		}

		System.out.println("\n=== 2. try 블랙에 여러 예외를 한꺼번에 처리 =========================");

		// 2. try 블락에 여러 예외를 적용하고, 각각의 catch 블락을 만들어서 처리
		try {
			System.out.println(3 / 0); // ArithmeticException
			int num = Integer.parseInt("10!"); // NumberFormatException
		} catch (ArithmeticException e) {
			System.out.println("정수를 0으로 나눌수 없습니다.");
		} catch (NumberFormatException e) {
			System.out.println("입력한 값은 정수로 변환 할 수 없습니다.");
		}

		System.out.println("\n=== 3. catch (여러 예외를 한꺼번에 처리) ========================");

		// 3. catch (여러 예외를 한꺼번에 넣어 처리)
		try {
			System.out.println(3 / 0); // ArithmeticException
			int num = Integer.parseInt("10!"); // NumberFormatException
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("두 개의 예외를 하나의 블락에서 처리");
		}

		System.out.println("\n프로그램 종료");

	}
}
