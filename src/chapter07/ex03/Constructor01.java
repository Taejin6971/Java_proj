package chapter07.ex03;

class Student {
	
	// 생성자 오버로딩 : 생성자 이름은 동일하고, 아규먼트로 받는 매개변수의 새수, 매개변수의 타입
	
	// 기본 생성자 : 객체의 다른 생성자가 존재시 기본 생성자를 명시적으로 만들어줌.
	public Student() {
	}
	
	// 생성자 : 매개변수로 1개 인풋 받는 생성자
		// this : 자기 자신의 객체를 뜻함
		// 매개변수로 들어오는 변수명, 매개변수로 들어오는 변수를 받는 변수명, 필드명, 3가지 이름이 동일할 경우
		// 필드명에 this. 키워드를 넣어야 한다.
	public Student(String stuName) {
		this.stuName = stuName;
	}

	// 생성자 : 매개변수 2개 받는 생성자
	public Student(String stuName, String stuAddr) {
		this.stuName = stuName;
		this.stuAddr = stuAddr;
	}

	// 생성자 : 매개변수 3개 받는 생성자
	public Student(String stuName, String stuAddr, String stuEmail) {
		this.stuName = stuName;
		this.stuAddr = stuAddr;
		this.stuEmail = stuEmail;
	}

	// 생성자 : 매개변수 3개 받는 생성자
	public Student(String stuName, String stuAddr, String stuEmail, int stuAge) {
		this.stuName = stuName;
		this.stuAddr = stuAddr;
		this.stuEmail = stuEmail;
		this.stuAge = stuAge;
	}

	// 생성자 : 아규먼트로 인풋 받는 갯수 6개
	public Student(String a, String b, String c, int d, double e) {
		stuName = a;
		stuAddr = b;
		stuEmail = c;
		stuAge = d;
		stuWeight = e;
	}

	// 필드 : 속성
	String stuName;
	String stuAddr;
	String stuEmail;
	int stuAge;
	double stuWeight;

	// 메소드 : 기능

	// 객체의 필드의 값을 출력 Object 클래스의 toString()을 재정의
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuAddr=" + stuAddr + ", stuEmail=" + stuEmail + ", stuAge=" + stuAge
				+ ", stuWeight=" + stuWeight + "]";
	}

}

public class Constructor01 {
	public static void main(String[] args) {
		/*
			생성자 (Constructor) 
				- 객체를 생성시 필드의 초기값을 설정 
				- 리턴이 없고 객체 이름과 동일한 이름을 가진 메소드 
				- 기본 생성자 : 생략되어 있음. 
				- 사용자 정의 생성자를 생서
		 */

		// 객체 생성 : 기본 생성자로 객체 생성
		Student s1 = new Student();
		System.out.println(s1); // 객체 자체를 출력시 오버라이딩된 toString() 메소드가 작동됨

		// 객체 생성
		Student s2 = new Student("홍길동"); // 매개변수 1개 생성자 호출
		Student s3 = new Student("이순신", "서울"); // 매개변수 2개 생성자 호출
		Student s4 = new Student("세종대황", "서울 종로", "aaa@aaa.com");
		Student s5 = new Student("신사임당", "강원도", "bbb@bbb.com", 30);
		Student s6 = new Student("을지분덕", "함경북도", "ccc@ccc.com", 40, 70.7);
		
		// 각 객체의 필드의 저장된 값 출력 (toString())
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);

	}
}
