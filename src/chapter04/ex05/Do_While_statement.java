package chapter04.ex05;

public class Do_While_statement {
	public static void main(String[] args) {
		/*
		do while 문 : 조건과 상관없이 첫 1회는 무조건 실행블락을 실행시키고, 조건 확인후 반복 
		
		1. while 문 : 실행블락은 조건이 true일 때만 실행
		   초기값
		   while (조건) {
		      /실행 블락
		      /증감식
		   }
		
		2. do while 문
		   초기값
		   do {
		      /실행 블락
		      /증감식
		   } while (조건) ;
	*/
		
		// 1. while 문 :
		System.out.println("===== while 문 =====");
		int a = 0;
		while (a < 0) { // false 이므로 실행블락 실행 X
			System.out.println(a + " 1 ");
			a++;
		}

		// 2. do while 문 :
		System.out.println("===== do while 문 =====");
		a = 0; // 위에서 이미선언
		do {
			System.out.println(a + " "); // 조건과 상관없이 1번은 실행블락 실행
			a++;
		} while (a < 0);

		// 3. 반복 횟수가 10번인 경우 : while문 과 do while문 비교
		System.out.println("===== 반복 횟수가 10번인 경우 : while문 과 do while문 비교 ======");

		System.out.println("===== while =====");
		a = 0; // 변수의 값을 변경
		while (a < 10) { // 0~9 까지 10번 출력
			System.out.print(a + " ");
			a++;
		}
		System.out.println("\n");

		System.out.println("===== do while =====");
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 10);

	}
}
