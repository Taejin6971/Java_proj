package chapter04.ex03;

public class Ex03 {
	public static void main(String[] args) {
	/*
		1. 이중 for 문을 사용해서 1단 19 단까지 출력
		2. 이중 for 문을 사용해서 1단 19 단까지 출력중 3의 배수단만 출력
		
	 */
		
		System.out.println("===== 1. 1단 ~ 19단 까지 출력 =====");
		for (int i=1 ; i<20 ; i++) {		//단을 출력하는 for
			System.out.println(i+"단");
			for (int j=1 ; j<20 ; j++) {	//곱해지는 숫자를 출력하는 for
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
				System.out.println();
		}		
		
		System.out.println("===== 2. 3의 배수단만 출력 : i의 증가값 사용 =====");
		
		for (int i=3 ; i<20 ; i+=3) {		//단을 출력하는 for
			System.out.println(i+"단");
			for (int j=1 ; j<20 ; j++) {	//곱해지는 숫자를 출력하는 for
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
				System.out.println();
		}
		
		System.out.println("===== 2. 3의 배수단만 출력 : if문 사용 =====");
		
		for (int i=1 ; i<20 ; i++) {		//단을 출력하는 for
			if (i%3==0) {		//3의 배수
				System.out.println(i+"단");
				for (int j=1 ; j<20 ; j++) {	//곱해지는 숫자를 출력하는 for
					System.out.printf("%d * %d = %d\n",i,j,i*j);
				}
					System.out.println();
			}
		}
		
		System.out.println("===== 2. 3의 배수단만 출력 : continue 사용 =====");
		
		//제어 키워드 : break; continue;
			//제어 키워드는 일반적으로  if 문과 같이 사용됨
			//break;	<== {} 실행블락 탈축
			//continue;	<==	continue를 만나면 continue아래 내용은 실행 되지않고 증감식을 다시 작동시킴
		
		for (int i=1 ; i<20 ; i++) {		//단을 출력하는 for
			
			if (i%3 != 0) {continue;}		//3의 배수가 아닐때는 continue 가 발동된다.
			
				System.out.println(i+"단");
				for (int j=1 ; j<20 ; j++) {	//곱해지는 숫자를 출력하는 for
					System.out.printf("%d * %d = %d\n",i,j,i*j);
				}
					System.out.println();
		}
		
	}
}
