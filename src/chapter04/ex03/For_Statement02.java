package chapter04.ex03;

public class For_Statement02 {
	public static void main(String[] args) {
	/*
	 * 반복문 : for, while, do while
	  		- 조건이 true 동간 계속 반복, 조건이 false가 되면 실행블락 {}을 빠져나옴
	  		- 조건이 무한루프에 빠지지 않도록 잘 처리해야 한다.
	  		- 조건이 비어 있으면 무한루프에 빠지게 된다.
	  		- 서버가 메모리가 꽉 차버려서 다운 될수 있다.
	  		
	//1. for 문에 조건이 없는 경우 <== 무한루프가 발생 됨
		
		for (int i =0 ;  ; i++) {
			System.out.println(i);
		}
		
	//2. for 문에서 초시값 생략, 조건 생략, 증가값도 생략된 경우 <== 무한루프가 돌아감
		
		for (;;) {
			System.out.println("무한루프");
		}
		
	//3. for 문에서 조건을 잘못 처리하면 무한루프에 빠지수 있다.	
		
		for (int i = 1000 ; i<=1000 ; i--) {
			System.out.println(i);
			
			if ( i == -500) {break;}		//i == -500 일때 for 문을 빠져 나옴
		}
		*/
		
	}
}
