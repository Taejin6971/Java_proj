package chapter04.ex04;

public class While_Statement {
	public static void main(String[] args) {
	/*
		while 문 : 반복문, 조건이 true일 동안 반복, 조건이 false가 되면 while문을 빠져나옴
			- for 문으로 적용, for문은 while문으로 적용
			
		for ( 초기값 ; 조건 ; 증감식 ) {
			//조건이 true일 동안 실행블락;
		}
		
		초기값;
		while ( 조건 ) {
			//조건이 true일 동안 실행블락;
			//증감식;
		}
	 */
		
		System.out.println("====== 1. for 문으로 출력 ======");
		for (int i=0 ; i<10 ; i++) {
			System.out.println(i);
		}
				
		System.out.println("====== 2. while 문으로 출력 ======");
		int a=0;						//초기값
		while (a<10) {					//조건
			System.out.println(a);
			a++;						//증감식
		}
		
	}
}
