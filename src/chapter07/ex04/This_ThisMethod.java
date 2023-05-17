package chapter07.ex04;

class A {
	
	// 필드 : Heap 공간에 값이 저장이 됨, 객체를 생성(new) 후 Heap
	int m;
	int n;
	
	// 메소드 
	void init(int a, int b) { // 지역 변수(a,b,c) : 메소드 내부에서 선언된 변수
		int c;
		c = 3;
		this.m = a; // this. - 생략가능 컴파일시 자동으로 등록됨
		this.n = b;
		System.out.println("필드의 값 출력 : " + m + " , " + n);
	}
	
	void work() {
		this.init(2, 3); // this. - 생략가능 컴파일시 자동으로 등록됨
	}
	
}

public class This_ThisMethod {
	public static void main(String[] args) {
		/*
			this. 키워드 : 필드이름앞, 메소드이름앞,
				- 자기 자신의 객체를 의미, 기본적으로 모두 생략, 실행시 컴파일러가 자동으로 넣어준다.
				- 명시가 필요한 경우 : 생성자에서 인풋되는 이름, 인풋받는 이름, 필드명 3가지가 모두 동일할 때 
									필드명에 this 키워드를 넣어야한다.
									
			this() 메소드 : 
				- 생성자 내부에서만 사용 된다.
				- 반드시 생성자 내부에서 첫 번째 라인에 와야 한다.
				- 생성자 호출시 다른 생성자를 먼저 실행 하도록 한다.
		 */
		
		A a = new A();
		a.work();
		
	}
}
