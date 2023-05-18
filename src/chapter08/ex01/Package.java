package chapter08.ex01;

import chapter08.ex02.Student;

class A { // class A는 접근 제어자가 default 이므로 외부 패키지에서는 접근이 불가하다

	// 필드에 선언된 접근 제어자
	public int a;
	protected int b;
	int c; // default(생략) : 명시 해서 사용하지 않고, 생략시 default가 생략 되어있음
	private int d;

	// 메소드에 선언된 접근 제어자
	public void a() { // public : 외부 패키지에서 접근 가능
		System.out.println(" a 메소드 출력");
	}

	protected void b() { // protected : 상속 관계가 있을때만 외부 패키지에서 접근 가능
		System.out.println(" b 메소드 출력");
	}

	void c() { // default(생략) : 같은 패키지 내에서만 접근 가능, 외부 패키지에서는 접근 불가
		System.out.println(" c 메소드 출력");
	}

	private void d() { // private : 같은 클래스에서만 접근 가능, 다른 클래스에서는 접근 불가
		System.out.println(" d 메소드 출력");
	}

}

public class Package {
	// 클래스 내부 구성 요소 블락

	public static void main(String[] args) {

//			클래스 내부 구성 요소 : 1. 생성자, 2. 필드, 3. 메소드, 4. 이너클래스(클래스 내부의 클래스)
//			클래스 외부 구성 요소 : 1. 패키지(package), 2. 임포트(import), 3. 외부 클래스
//				- 1. 패키지 : 클래스(파일)를 조직화 할때 사용, 폴더
//					-- 같은 패키지에 동일한 이름의 클래스는 올 수 없다.

//				- 2. 임포트 :
//					-- 동일한 패키지에 존재 하지 않는 클래스는 import를 사용해서 불러들여야 한다.
//					-- 외부의 클래스는 반드시 public class 이여야 불러들일 수 있다.

//				- 3. 외부 클래스 ==> 클래스 외부에 생성된 클래스, public class는 하나만 와야 한다.
//					-- public 클래스가 아니면 외부에서 접근이 불가.

//			접근 제어자 : 정보를 보호하기 위해서 클래스 이름앞, 필드 이름 앞, 메소드 이름 앞에 붙는 제어자
//						변수 이름 앞에는 붙지 않는다 <== 메소드 내부에서 선언된, 제어문 내부에서 선언된
//				정보의 은닉, 캡슐화 <== 보안

//				클래스 이름앞 (public, default)만 사용가능
//				필드/메소드 이름앞 (public, protected, default, private)

//				- public	: 외부 패키지에서 접근이 가능하도록 허용.
//				- protected	: 상속 관계에 있을때만 외부 패키지에서 접근 가능하도록 허용
//				- default	: 같은 패키지에서만 접근 가능, 외부 패키지에서는 접근 불가
//				- private	: 같은 클래스에서만 접근 가능, 다른 클래스에서는 접근 불가

		Car ca = new Car(); // 같은 패키지에 존재하는 클래스 : import없이 바로 사용 가능

		// 외부의 클래스를 import 할때는 해당 클래스의 접근 지정자가 public, public

		// import 후 외부 패키지를 불러 들일 수 잇음 (Ctlr + Shift + O)
		Student s1 = new Student(); // 다른 패키지에 존재하는 클래스 : import를 사용해서 사용 가능

		// impot 없이 바로 접근 : 클래스의 전체 이름으로 접근 : 패키지명.클래스명
		chapter08.ex02.Student s2 = new chapter08.ex02.Student();
		
		s1.stuName = "홍길동";

	}
}
