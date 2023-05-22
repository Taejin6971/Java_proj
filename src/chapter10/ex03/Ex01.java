package chapter10.ex03;

// 상속, 메소드 오버라이딩 (인스턴스 메소드), 업캐스팅, 다운캐스팅, 배열

// 부모 클래스 : 자식 클래스의 공통적으로 적용되는 필드/메소드 정의
class Human { // (부모)사람 <==> (자식)학생,교수,근로자

	// 기본 생성자가 생략 되어있다.
//	Human() {
//	}

	// 필드 : 상속받을 자식 클래스의 공통으로 사용하는 속성 정의
	String name;
	int age;

	// 메소드 : 인스턴스 메소드
	void eat() {
		System.out.println("Human - 모든 사람은 잠을 잡니다.");
	}
}

// 자식 클래스
class Student extends Human {
	// 기본 생성자가 생략 되어있다. <== 상속 관계에서는 기본 생성자 내부에 부모 클래스의 기본 생성자를 호출
	Student() {
		super(); // 부모 클래스의 생성자를 호출 : 생략되어있다.
	}

	// Human의 필드/메소드 상속
	// 필드 : 학생 클래스에서만 적용되는 필드
	int stuId;

	// 메소드 : 학생 클래스에서만 적용되는 메소드
	void goToSchool() {
		System.out.println("Student - 학생은 학교에 갑니다.");
	}

	// 메소드 오버 라이딩 : 부모 클래스에서 정의한 메소드를 자식 클래스가 재정의해서 사용
	@Override
	void eat() {
		System.out.println("Student - 학생은 식당에서 식사를 합니다.");
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", age=" + age + "]";
	}

}

class Professor extends Human {
	// Human의 필드/메소드 상속
	// 필드 : 교수 클래스에서만 적용되는 필드
	int proId;

	// 메소드 : 교수 클래스에서만 적용되는 필드
	void goToTeach() {
		System.out.println("Professor - 교수는 학생들을 가르치러 학교에 갑니다.");
	}

	// 메소드 오버 라이딩 : Human의 eat() 재정의
	@Override
	void eat() {
		System.out.println("Professor - 교수는 식사를 합니다.");
	}

	@Override
	public String toString() {
		return "Professor [proId=" + proId + ", name=" + name + ", age=" + age + "]";
	}

}

class Worker extends Human {
	// Human의 필드/메소드 상속
	// 필드 : 근로자 클래스에서만 적용되는 필드
	int worId;

	// 메소드 : 근로자 클래스에서만 적용되는 필드
	void goToWork() {
		System.out.println("Worker - 근로자는 일하러 일터로 출근 합니다.");
	}

	// 메소드 오버 라이딩 : Human의 eat() 재정의
	@Override
	void eat() {
		System.out.println("Worker - 근로자는 맛있게 식사를 합니다.");
	}

	@Override
	public String toString() {
		return "Worker [worId=" + worId + ", name=" + name + ", age=" + age + "]";
	}

}

public class Ex01 {
	public static void main(String[] args) {

		// 1. 부모 클래스의 필드/메소드 상속 확인

		// Human 클래스의 h1 객체 생성
		Human h1 = new Human();
		// h1 : Human 타입만 내포 - (부모)Human을 객체화했기 때문에 (자식)클래스를 내포하지않아 다운캐스팅 불가
		// 다운 캐스팅 오류발생 : (클래스) 명시 해야한다
		// 오류 : 컴파일오류 (이클립스에서 실행전 오류를 발생시킴), 런타임오류 (실행시 오류발생)
		// 주의 : 런타임 오류발생 - instanceof 사용하여 해당 타입이 존재하는지 확인후 캐스팅필요.
		if (h1 instanceof Student) {
			Student hh1 = (Student) h1;
		} else {
			System.out.println("h1에는 Student 타입이 존재하지 않습니다.");
		}
		System.out.println(h1 instanceof Human); // true
		System.out.println(h1 instanceof Student); // false
		System.out.println(h1 instanceof Professor); // false
		System.out.println(h1 instanceof Worker); // false

		System.out.println("====================================");

		// Student 클래스의 s1 객체를 생성
		Student s1 = new Student(); // s1 : Human/Student 타입을 내포, Student 타입으로 지정
		// s1 : Human/Student의 필드/메소드 모두 접근 가능
		s1.name = "홍길동"; 	// Human(부모) 필드
		s1.age = 20; 		// Human(부모) 필드
		s1.stuId = 1234; 	// Student(자식) 필드

		Human sh1 = new Student(); // sh1 : Human/Student 타입을 내포, Human 타입으로 지정
		// sh1 : Human의 필드/메소드 만 접근 가능
		sh1.name = "이순신"; 	// Human(부모) 필드
		sh1.age = 30; 		// Human(부모) 필드

		// 다운캐스팅 : sh1는 Human/Student 타입을 내포하고 있기때문에, Human ==> Student 다운캐스팅이 가능하다.
		System.out.println(sh1 instanceof Student); // true

		Student shs1 = null;
		if (sh1 instanceof Student) {
			shs1 = (Student) sh1;
		}

		// shs1 : Human/Student 타입을 내포하고 있고 Student 타입으로 다운캐스팅 : Human/Student 필드/메소드
		// 모두사용가능
		shs1.name = "세종대왕"; // Human(부모) 필드
		shs1.age = 50; 		// Human(부모) 필드
		shs1.stuId = 2345; 	// Student(자식) 필드

		// 업캐스팅 : shs1 - Student(자식) ==> hUman(부모) : (클래스) 명시하지 않아도 자동 캐스팅
		System.out.println(shs1 instanceof Human); // true
		Human shsh1 = shs1; // 업캐스팅은 캐스팅시 instanceof를 사용하지 않아도 됨 : 컴파일오루가 뜨기 떄문

		// 자식을 객체화 해서 부모 타입으로 지정후 배열/컬렉션에 저장후 끄집어 내서 출력함.
		Student s10 = new Student();
		Professor p10 = new Professor();
		Worker w10 = new Worker();

		// 각 객체의 필드의 값을 할당
		s10.name = "김학생";
		s10.age = 30;
		s10.stuId = 1234;

		p10.name = "김교수";
		p10.age = 40;
		p10.proId = 2345;

		w10.name = "홍근로자";
		w10.age = 20;
		w10.worId = 3456;

		// 위 객체를 배열/컬렉션(ArrayList/Vector/Set/Map)에 넣어서 처리함
		// 배열/컬렉션의 지정되는 것은 동일한 타입으로 지정되어야 한다.
		// s10 : Student타입, p10 : Professor타입, w10 : Worker타입 <== 공통 Human타입
		// s10, p10, w10 자동으로 업캐스팅되어 Human 타입으로 저장
		Human[] arr1 = new Human[] { s10, p10, w10 };

		// arr1[0] : Human/Student
		// arr1[1] : Human/Professor
		// arr1[2] : Human/Worker

		// 배열의 각 방의 값을 끄집어 내어서 변수에 재할당
		Human hs10 = arr1[0]; // Human
		Human hp10 = arr1[1]; // Human
		Human hw10 = arr1[2]; // Human

		// 배열의 각 방의 내용을 끄집어 낼때 다운 캐스팅 하면서 끄집어 낸다.
		Student sh10 = (Student) arr1[0]; // Human ==> Student 으로 다운캐스팅
		Professor ph10 = (Professor) arr1[1]; // Human ==> Professor 으로 다운캐스팅
		Worker wh10 = (Worker) arr1[2]; // Human ==> Worker 으로 다운캐스팅

		// 각 객체의 필드의 내용 출력
		System.out.println("// Student 객체 정보 출력");
		System.out.println(sh10);
		System.out.println("// Professor 객체 정보 출력");
		System.out.println(ph10);
		System.out.println("// Worker 객체 정보 출력");
		System.out.println(wh10);

		System.out.println("=============================================");

		// 3. 메소드 오버 라이딩 테스트

		// 3-1 Human 객체 생성 후 eat() 메소드 호출
		Human h20 = new Human(); // h30 : Human 타입만 내포
		h20.eat(); // Human 클래스의 eat() 메소드 호출

		// 3-2 자식 클래스 객체 생성시 자식 클래스 타입으로 지정
		Student s20 = new Student(); // s20 : Human/Student 타입 내포
		Professor p20 = new Professor();
		Worker w20 = new Worker();

		// 자식 클래스의 eat() 메소드 호출
		s20.eat(); // Student 클래스의 eat() 메소드 호출
		p20.eat(); // Professor 클래스의 eat() 메소드 호출
		w20.eat(); // Worker 클래스의 eat() 메소드 호출

		System.out.println("===== 오버라이딩된 메소드 출력 ================");
		
		// 자식 클래스 객체 생성시 부모 클래스 타입으로 지정 후 오버라이딩된 메소드 호출
		Human sh20 = new Student(); // sh20 : Human/Student 타입 내포
		Human ph20 = new Professor();
		Human wh20 = new Worker();
		
		// Human 클래스의 eat() 메소드 호출
		sh20.eat(); // Human 클래스의 eat() 메소드 호출시 Student 클래스의 오버라이딩된 eat()메소드 작동
		ph20.eat(); // Human 클래스의 eat() 메소드 호출시 Professor 클래스의 오버라이딩된 eat()메소드 작동
		wh20.eat(); // Human 클래스의 eat() 메소드 호출시 Worker 클래스의 오버라이딩된 eat()메소드 작동
		
		// 부모의 eat() 메소드 호출시 자식 클래스의 오버라이딩된 eat()메소드가 출력됨
	}
}
