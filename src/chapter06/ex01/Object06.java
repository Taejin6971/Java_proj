package chapter06.ex01;

class Student2 {
	// 기본생성자
	public Student2() {}

	// 필드
	String sName; 	// 학생 이름
	int sAge; 		// 학생 나이
	String sAddr; 	// 학생 거주지
	String sEmail; 	// 학생 이메일

	// 메소드 : 필드의 내용을 출력하는 메소드
	public void print() {
		System.out.println("이름 : " + sName);
		System.out.println("나이 : " + sAge + "살");
		System.out.println("거주지 : " + sAddr);
		System.out.println("이메일 : " + sEmail);
	}

}

public class Object06 {
	public static void main(String[] args) {
		// kim 객체 : 김길동 / 20 / 서울 / aaa@aaa.com
		// lee 객체 : 이순신 / 30 / 부산 / bbb@bbb.com
		// hong 객체 : 홍길동 / 45 / 광주 / ccc@ccc.com
		// 각 객체의 필드의 값 입력 후, 배열에 넣어서 저장 후 끄집어 내어서 다시 출력

		// 객체 생성
		Student2 kim = new Student2();
		Student2 lee = new Student2();
		Student2 hong = new Student2();

		// 각 객체의 필드 값 할당
		// 김길동 / 20 / 서울 / aaa@aaa.com
		kim.sName = "김길동";
		kim.sAge = 20;
		kim.sAddr = "서울";
		kim.sEmail = "aaa@aaa.com";

		// 이순신 / 30 / 부산 / bbb@bbb.com
		lee.sName = "이순신";
		lee.sAge = 30;
		lee.sAddr = "부산";
		lee.sEmail = "bbb@bbb.com";

		// 홍길동 / 45 / 광주 / ccc@ccc.com
		hong.sName = "홍길동";
		hong.sAge = 45;
		hong.sAddr = "광주";
		hong.sEmail = "ccc@ccc.com";

		// 객체의 필드 값 출력
		System.out.println("===== kim 객체 =====");
		kim.print();
		System.out.println("\n===== lee 객체 =====");
		lee.print();
		System.out.println("\n===== hong 객체 =====");
		hong.print();

		// 배열 선언과 동시에 배열에 값 할당
		Student2[] arr1 = new Student2[] {kim, lee, hong};
			//arr1[0] = kim;
			//arr1[1] = lee;
			//arr1[2] = hong;

		// 각 배열의 방의 저장된 객체를 다시 변수에 할당해서 끄집어 낸다.
		Student2 out1 = arr1[0]; // kim
		Student2 out2 = arr1[1]; // lee
		Student2 out3 = arr1[2]; // hong

		System.out.println("\n===== arr1 배열로 객체 출력 =====");

		// 출력
		out1.print(); // kim
		System.out.println("\n===============");
		out2.print(); // lee
		System.out.println("\n===============");
		out3.print(); // hong

	}
}
