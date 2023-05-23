package chapter10.ex06;

class Student {

//	Student(String name) {
//		this.name = name;
//	}

	String name;

	// 합계와 평균 출력 하는 메소드 : 부모 클래스 메소드 : 실행코드 X,
	// 자식 클래스에서 오버 라이딩해서 구현 코드 생성
	void sum_avg() {

	}
}

class Student_Sub extends Student {

	int kor;
	int eng;
	int math;

	// 1. 생성자로 매개변수 값을 받아서 각 필드의 값을 할당. name, kor, eng, math
	Student_Sub(String name, int kor, int eng, int math) {

		// super(name);
		super.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 2. 필드의 값을 모두 합하고, 평균을 출력 (각 객체의 점수 합계/평균을 구하는 메소드)
	@Override
	void sum_avg() {

		int sum;
		double avg;

		sum = kor + eng + math;
		avg = sum / 3.0;

		System.out.printf("%s 학생의 각 과목의 점수 합은 %d 점 이고, 평균은 %.2f 점 이다", name, sum, avg);
		System.out.println();
	}
}

public class Ex01 {
	public static void main(String[] args) {

		// 각 객체 필드의 값 할당은 생성자 호출시 매개변수로 값을 넣도록 한다.
		// 홍길동/70/88/77
		// 이순신/80/68/87
		// 김똘똘/60/86/87
		// 홍길순/77/56/80
		// 강감찬/55/66/77

		// Student 타입의 sum_avg() 호출시 오버 라이딩된 메소드 호출
		Student s1 = new Student_Sub("홍길동", 70, 88, 77);
		Student s2 = new Student_Sub("이순신", 80, 68, 87);
		Student s3 = new Student_Sub("김똘똘", 60, 86, 87);
		Student s4 = new Student_Sub("홍길순", 77, 56, 80);
		Student s5 = new Student_Sub("강감찬", 55, 66, 77);

		// 직접 출력
		s1.sum_avg();
		s2.sum_avg();
		s3.sum_avg();
		s4.sum_avg();
		s5.sum_avg();

		System.out.println("====================================================");

		// 배열에 값 할당
		Student[] arr = new Student[] { s1, s2, s3, s4, s5 };

		// for 문을 사용해서 벼열의 메소드 호출
		for (int i = 0; i < arr.length; i++) {
			arr[i].sum_avg();
		}

		System.out.println("====================================================");

		// for 문을 사용해서 아래와 같이 출력되도록 구문 작성

		// 모든 사용자의 국어 점수의 총합 : ?점
		// 모든 사용자의 영어 점수의 총합 : ?점
		// 모든 사용자의 수학 점수의 총합 : ?점

		// 각 과목의 합을 구하는 변수 선언
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;

		// Student[] arr = new Student[] { s1, s2, s3, s4, s5 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Student_Sub) {
				sumKor += ((Student_Sub) arr[i]).kor;
				sumEng += ((Student_Sub) arr[i]).eng;
				sumMath += ((Student_Sub) arr[i]).math;
			}
		}
		System.out.println("모든 학생의 국어 점수의 합은 " + sumKor + " 점 입니다.");
		System.out.println("모든 학생의 영어 점수의 합은 " + sumEng + " 점 입니다.");
		System.out.println("모든 학생의 수학 점수의 합은 " + sumMath + " 점 입니다.");

		System.out.println("====================================================");
		
		// 배열로 변수 선언
		int[] sum = new int[3]; // sum[0,1,2] : 0-국어점수합, 1-영어점수합, 2-수학점수합
		
		for (int i = 0; i < arr.length; i++) {
			sum[0] += ((Student_Sub)arr[i]).kor; // sum[0] = sum[0] + kor
			sum[1] += ((Student_Sub)arr[i]).eng;
			sum[2] += ((Student_Sub)arr[i]).math;
		}
		System.out.println("모든 학생의 국어 점수의 합은 " + sum[0] + " 점 입니다.");
		System.out.println("모든 학생의 영어 점수의 합은 " + sum[1] + " 점 입니다.");
		System.out.println("모든 학생의 수학 점수의 합은 " + sum[2] + " 점 입니다.");
	}
}
