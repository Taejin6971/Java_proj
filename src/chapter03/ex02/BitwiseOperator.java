package chapter03.ex02;

public class BitwiseOperator {
	public static void main(String[] args) {
		/*
			다양한 진법 표현과 비트 연산자
		 */
		
		// 1. 다양한 진법 표현 : 10진수, 16진수, 8진수, 2진수
		int data = 13;

		System.out.println(Integer.toBinaryString(data)); // 2진수로 출력
		System.out.println(Integer.toOctalString(data)); // 8진수로 출력
		System.out.println(Integer.toHexString(data)); // 16진수로 출력

		System.out.println("==========================================");

		// 2. 2, 8, 16 ==> 10진수로 표현
		System.out.println(Integer.parseInt("1101", 2)); // 13
		System.out.println(Integer.parseInt("15", 8)); // 13
		System.out.println(Integer.parseInt("d", 16)); // 13

		System.out.println("===========================================");

		// 문자열로된 숫자를 정수로 변환 해서 연산을 함.... client 폼 ==> 서버로 숫자를 전송
		System.out.println("3" + "5"); // 35 문자열 연결
		System.out.println(3 + "5"); // 35

		System.out.println(Integer.parseInt("3") + Integer.parseInt("5")); // 8

		// 문자열로된 실수를 실수형으로 변환
		String a = "13.3";
		String b = "13.4";

		System.out.println(a + b); // 13.313.4
		System.out.println(Double.parseDouble(a) + Double.parseDouble(b)); // 26.700000000000003

		// 3. 비트 연산 : & (AND), | (OR), ^ (XOR), ~ (NOT)
		// - & (AND) 0&0 ==> 0, 0&1 ==> 0, 1&0 ==> 0, 1&1 ==> 1
		System.out.println(3 & 10); // 2

		// - | (OR) 0|0 ==> 0, 0|1 ==> 1, 1|0 ==> 1, 1|1 ==> 1
		System.out.println(3 | 10); // 11

		// - ^ (XOR) : 두 값이 같을때는 : 0, 두값이 다를때는 : 1
		// 0^0 ==> 0, 0^1 ==> 1, 1^0 ==> 1, 1^1 ==> 0
		System.out.println(3 ^ 10); // 9

		// - ~ (NOT) : 반대를 출력
		System.out.println(~3); // -4
		System.out.println(~10); // -11

	}
}
