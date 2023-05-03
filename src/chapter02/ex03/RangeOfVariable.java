package chapter02.ex03;

public class RangeOfVariable {
	public static void main(String[] args) {
		//변수의 사용 범위 : 블락에서 선언되면 그 블락까지가 사용 범위
		
		int val1=3;		//전역 변수
		
		{	//if, for, while, do while	<== 블락내부에서 선언된 변수는 지역 변수 :블락 내에서만 사용가능
			
			int val2=5;		//지역 변수
			
			System.out.println(val1);
			System.out.println(val2);
		
		}

		System.out.println(val1);
//		System.out.println(val2);	//오류 발생 : 
	
	
	
	}
}
