package chapter10.ex04;

// 상속, 업/다운캐스팅

class Human { // 부모 클래스

	String name;
	int age;

}

class Student extends Human {

	int kor;
	int eng;
	int math;

}

public class Ex01 {

	// 메소드 : Student 객체를 매개변수로 받아서 배열게 저장하는 객체이고,
	// 인풋으로 Student 객체를 받아서 배열에 저장
	Human[] arr = null;

	void arrMethod(Human h1, Human h2, Human h3) {
		// 1. h1,2,3 객체를 arr배열 변수에 저장
		arr = new Human[] { h1, h2, h3 }; // h1,2,3 : Human/Student 타입 내포
		// sumKor(arr); "배열에 저장된 객체의 모든 국어 점수는 ???점 입니다."
		sumKor(arr);
		// sumEng(arr); "배열에 저장된 객체의 모든 영어 점수는 ???점 입니다."
		sumEng(arr);
		// sumMath(arr); "배열에 저장된 객체의 모든 수학 점수는 ???점 입니다."
		System.out.println("배열에 저장된 객체의 모든 국어 점수는 " + sumMath(arr) + " 점 입니다.");

	}

	void sumKor(Human[] arr) { // Student 타입으로 다운캐스팅 후 각 객체의 국어점수를 더해서 결과를 출력하는 메소드
		// for 문을 사용해서 각방의 Human 타입의 객체를 Student 타입으로 다운캐스팅해서 kor점수만 뽑아온다
		// 국어점수의 합을 저장하는 변수 선언
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Student) {
				Student s = (Student) arr[i]; // Human arr[i] ==> Student 타입으로 다운캐스팅
				sum += s.kor;
			}
		}
		System.out.println("배열에 저장된 객체의 모든 국어 점수는 " + sum + " 점 입니다.");
	}

	void sumEng(Human[] arr) { // Student 타입으로 다운캐스팅 후 각 객체의 영어점수를 더해서 결과를 출력하는 메소드
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Student) {
				Student s = (Student) arr[i]; // Human arr[i] ==> Student 타입으로 다운캐스팅
				sum += s.eng;
			}
		}
		System.out.println("배열에 저장된 객체의 모든 국어 점수는 " + sum + " 점 입니다.");
	}

	int sumMath(Human[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Student) {
				sum += ((Student)arr[i]).math;
			}
		}
		return sum; // 배열에 들어온 수학점수를 모두 더해서 리턴으로 돌려줌
	}

	public static void main(String[] args) {

		// 객체 생성
		Student s1 = new Student(); // 홍길동/30/60/70/80
		Student s2 = new Student(); // 이순신/30/66/77/88
		Student s3 = new Student(); // 강감찬/50/77/88/99

		// 객체 필드에 값 할당
		s1.name = "홍길동";
		s1.age = 30;
		s1.kor = 60;
		s1.eng = 70;
		s1.math = 80;

		s2.name = "이순신";
		s2.age = 30;
		s2.kor = 66;
		s2.eng = 77;
		s2.math = 88;

		s3.name = "강감찬";
		s3.age = 50;
		s3.kor = 77;
		s3.eng = 88;
		s3.math = 99;

		// 메소드 호출
		Ex01 e1 = new Ex01();
		e1.arrMethod(s1, s2, s3);

	}
}
