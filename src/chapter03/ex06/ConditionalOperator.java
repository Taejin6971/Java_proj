package chapter03.ex06;

public class ConditionalOperator {
	public static void main(String[] args) {
	/*
	삼항 연산자 : if ~ else 를 축약해서 1라인으로 사용하는 구문,
		
		(조건) ? true(실행구문) : false(실행구문) ;
	 */
		int val1=(3>5) ? 6:9;		//조건이 거짓 이므로 변수 val1은 9에 할당
		System.out.println(val1);	//9
		
		int val2=(3<5) ? 6:9;		//조건이 참 이므로 변수 val2은 6에 할당
		System.out.println(val2);	//6
		
	}
}
