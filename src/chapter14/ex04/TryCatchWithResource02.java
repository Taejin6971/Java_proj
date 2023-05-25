package chapter14.ex04;

import java.io.InputStreamReader;

public class TryCatchWithResource02 {
	public static void main(String[] args) {

//		Try Catch With Resource : try (객체 선언) {} catch (Exception e) {}
//			- finally에서 close()를 사용하지 않아도 자동으로 객체 close()

//			- 일반적인 try 구문
//				- try {실행블락 (예외)} catch(예외 e) {예외를 처리할 블락} finally {객체제거}

//			- 객체가 자동으로 close됨
//				- try (리소스 선언 부분) {실행블락} catch(예외 e) {예외를 처리할 블락}

//		자동으로 객체를 제거 하려면 
//			1. AutoCloseable() 인터페이스를 구현한 클래스만이 자동으로 close() 할 수 있다.
//			2. try (객체 선언) {} catch (예외 e) {}

		System.out.println("콘솔에서 한 글자만 입력 하세요 >>>");

		try (InputStreamReader ir1 = new InputStreamReader(System.in)) {
			char input = (char) ir1.read();
			System.out.println("입력한 글자는 : " + input);
		} catch (Exception e) {
			System.out.println("예외가 발생 되었습니다.");
		} // finally 블락에서 객체를 제거하지 않아도 자동으로 객체가 제거된다.

	}
}
