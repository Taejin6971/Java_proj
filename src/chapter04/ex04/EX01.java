package chapter04.ex04;

public class EX01 {
	public static void main(String[] args) {
	/*
		1000 부터 1까지 5씩 감소하면서 출력 : for, while 문으로 출력
	 */
		System.out.println("===== for 문으로 출력 =====");
		
		for (int i=1000 ; i>0 ; i-=5) {
			System.out.print(i+"\t");
		}
		System.out.println("\n");
		
		System.out.println("===== while 문으로 출력 =====");
		
		int i=1000;						//초기값 : while 밖에서 선언
		while (i>0) {					//조건
			System.out.print(i+"\t");	//조건이 true일 동안 실행
			i-=5;						//증감식
		}
		
	}
}
