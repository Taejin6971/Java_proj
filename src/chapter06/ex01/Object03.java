package chapter06.ex01;

class Student { // 외부의 클래스, 같은 클래스에서 public은 하나만 올 수 있다.

	// 기본 생성자 : 생략 가능
	public Student() {}

	// 필드 선언
	String name; // null (기본값)
	int kor; // 0
	int eng; // 0
	int meth; // 0

	// 메소드 선언 : print 메소드 호출시 메모리의 내용을 출력
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + kor + "점");
		System.out.println("영어 점수 : " + eng + "점");
		System.out.println("수학 점수 : " + meth + "점");
	}
	
}

public class Object03 {
	public static void main(String[] args) {
		// s1 객체 생성 : 홍길동, 80, 90, 100
		// s2 객체 생성 : 이순신, 60, 88, 70
		// s3 객체 생성 : 세종대왕, 90, 99, 88
		// s4 객체 생성 : 신사임당, 77, 88, 99
		// 각 객체의 print() 메소드 호출

		// s1,2,3,4 객체 생성 : 클래스 <==> 객체화 (인스턴스)
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

		// s1,2,3,4 필드의 값 할당
		// 홍길동, 80, 90, 100
		s1.name = "홍길동";
		s1.kor = 80;
		s1.eng = 90;
		s1.meth = 100;

		// 이순신, 60, 88, 70
		s2.name = "이순신";
		s2.kor = 60;
		s2.eng = 88;
		s2.meth = 70;

		// 세종대왕, 90, 99, 88
		s3.name = "세종대왕";
		s3.kor = 90;
		s3.eng = 99;
		s3.meth = 87;

		// 신사임당, 77, 88, 99
		s4.name = "신사임당";
		s4.kor = 77;
		s4.eng = 88;
		s4.meth = 99;

		// s1,2,3,4 필드의 값 출력 print();
		System.out.println("===== S1 객체 =====");
		s1.print();
		System.out.println("\n===== S2 객체 =====");
		s2.print();
		System.out.println("\n===== S3 객체 =====");
		s3.print();
		System.out.println("\n===== S4 객체 =====");
		s4.print();

	}
}
