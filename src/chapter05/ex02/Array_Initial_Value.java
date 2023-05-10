package chapter05.ex02;

import java.util.Arrays;

public class Array_Initial_Value {
	public static void main(String[] args) {
		/*
		배열의 초기값 지정 :
		참조 자료형 : boolean : false, 
				 	정수(bute,short,int,long) : 0, 
				 	실수(float,double) : 0.0,
		 		  	문자(char) : 공백
		 		  	String : NULL
		 */
		
		// 1. Stack 메모리 값 (강제 초기화 되지 않는다) <== 기본자료형의 값
		int val1; // 변수 선언
		// System.out.println(val1); //오류 발생 : 변수의 기본값을 할당 하지 않아서 오류 발생

		int[] val2; // 배열 선언, Heap 영역의 주소 값이 없는 상태
		// System.out.println(val2); //오류 발생 : Heap 영역이 생성되지 않는 상태, new int[3]
		val2 = new int[3];
		System.out.println(val2); // 객체의 Heap 영역의 주소가 출력됨, 16진수로 출력됨

		// 방의 값 출력
		System.out.println(val2[0]);
		System.out.println(val2[1]);
		System.out.println(val2[2]);

		System.out.println("========================");

		int[] val3 = null; // 참조 자료형 일때만 객체 주소에 null값을 할당 할수가있음
		System.out.println(val3); // 객체 자체를 출력할때 Stack에 저장된 Heap의 주소 :16진수
		val3 = new int[4];
		System.out.println(val3); // Heap 영역의 주소를 출력

		// 2. Heap 메모리 값 (강제 초기화 된다) <== 참조자료형의 값

		boolean[] a = new boolean[3];
		System.out.println(a[0]); // false
		System.out.println(a[1]); // false
		System.out.println(a[2]); // false

		System.out.println("========================");

		int[] b = new int[3]; // 정수 : byte, shor, int, long
		System.out.println(b[0]); // 0
		System.out.println(b[1]); // 0
		System.out.println(b[2]); // 0

		System.out.println("========================");

		double[] c = new double[3]; // 실수 : float, double
		System.out.println(c[0]); // 0.0
		System.out.println(c[0]); // 0.0
		System.out.println(c[0]); // 0.0

		System.out.println("========================");

		char[] d = new char[3]; // 문자
		System.out.println("char 기본값은 공백 : " + d[0]); // 공백
		System.out.println("char 기본값은 공백 : " + d[1]); // 공백
		System.out.println("char 기본값은 공백 : " + d[2]); // 공백

		System.out.println("========================");

		String[] e = new String[3];
		System.out.println(e[0]); // null <== 0이 아닌 비어있는 공허한 상태
		System.out.println(e[1]); // null
		System.out.println(e[2]); // null

		System.out.println("========================");
		
		//Arrays.toString(배열변수); // 배열의 모든값 출력
		System.out.println(Arrays.toString(a)); // boolean
		System.out.println(Arrays.toString(b)); // int
		System.out.println(Arrays.toString(c)); // double
		System.out.println(Arrays.toString(d)); // char
		System.out.println(Arrays.toString(e)); // String

	}
}
