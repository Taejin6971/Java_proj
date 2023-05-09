package chapter04.ex03;

public class For_Statement04 {
	public static void main(String[] args) {
	/*
		for 문에서 오류를 일으키기 쉬운 부분
	 */
		
		for (int i=0 ; i<10 ; i++) {
			System.out.println(i);
		}
		
		System.out.println("===================");
		
		//무한 루프가 발생됨
		
		for (int i=0, j=0 ; i<10 ; j++) {
			System.out.println(i + " , " + j);
			
			if (j==10) {break;}	// 무한루프를 빠져나오도록
		}
	 
		System.out.println("무한루프 발생");
		
		for (int i=10 ; i<100 ; i+=10) {	// i+=10 <== i = i+10
			System.out.println(i);
		}
		
		//전역 변수 : 
		//지역 변수 : for, if, switch, while, do while		{}	블락 내에서 선언된 변수 
		
		int i,j;
		
		for ( i=0 ; i<10 ; i++) {
			
		}
		
	}
}
