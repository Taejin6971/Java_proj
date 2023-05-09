package chapter03.ex03;

public class LogicalOperator {
	public static void main(String[] args) {
	/*
	논리 연산자 : 논리 연산한 결과를 true, false	<== if, 에서 조건으로 처리됨
	 	&& (AND)	:
	 	|| (OR)		:
	 	^  (XOR)	: 앞뒤가 같을 때 false를 리턴, 앞뒤가 다를 때 true를 리턴
	 	!  (NOT)	:
	 */
	
	// && : AND 연산	<== 논리 연산자가 연산한 결과는 true, false	
		System.out.println(true&&true);		//true
		System.out.println(true&&false);	//false
		System.out.println(false&&true);	//false
		System.out.println(false&&false);	//false
		
		System.out.println("===================================");
		
	// || : OR 연산	<== 둘중 하나라도 true 면 true
		System.out.println(true||true);		//true
		System.out.println(true||false);	//true
		System.out.println(false||true);	//true
		System.out.println(false||false);	//false
		
		System.out.println("===================================");
		
	// ^ : XOR 연산 : 앞 뒤의 값이 같을 때 false (0), 앞 뒤의 값이 다를 때 true (1)
		System.out.println(true^true);		//false
		System.out.println(true^false);		//true
		System.out.println(false^true);		//true
		System.out.println(false^false);	//false
		
		System.out.println("===================================");
		
	// ! : NOT 연산 : !true ==> false, !false ==> true
		System.out.println(!true);		//false
		System.out.println(!false);		//true
		
		System.out.println("===================================");
		
	// 쇼트서킷이 발생될 수 있다.
		// - 논리 연산에서 앞의 값으로 결과값을 유추 할수 있는 경우 뒤의 내용을 무시해서 처리하지 않는다.
		
	// && 연산에서 false가 오면 뒤에는 어떤 값이 와도 false
		System.out.println(true&&true);		//쇼트서킷이 발생되지 않는다.
		System.out.println(false&&true);	//쇼트서킷이 발생된다. 앞의 값이 false이면
//															뒤의 값은 확인하지 않아도 false
		
	// 예제 : AND 연산에서 쇼트서킷이 발생되는 예제
		int val1=3;
		System.out.println(false&&++val1>6);//false 뒤의 값은 확인 하지 않음 : &&
		System.out.println(val1);	//3		<== 쇼트서킷 발생으로 3이 출력됨
		
		System.out.println("===================================");
		
	// || : OR 연산에서 앞의 값이 true면 쇼트서킷이 발생된다	
		System.out.println(true||true);		//쇼트서킷이 발생됨
		System.out.println(false||true);	//쇼트서킷이 발생되지 않음
		
	// 쇼트서킷을 방지하기 위한 방안 : 비트연산자를 사용한다. &, |	<== 쇼트서킷을 발생시키지 않는 연산자
		
	// 예제 : AND 연산에서 쇼트서킷이 발생되는 예제
		int val2=3;
		System.out.println(false&++val2>6);	//	false 뒤의 값을 확인 : &
		System.out.println(val2);	//4		<== 쇼트서킷을 방지한다.
		
	}
}
