package chapter10.ex02;

// 부모 클래스
class Animal {

	String name;
	int age;

	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}

// 자식 클래스 (Tiger, Lion)
class Tiger extends Animal {

	String tigerCry;

	void tigerRun() {
		System.out.println("호랑이는 달립니다.");
	}
}

class Lion extends Animal {

	String LionCry;

	void lionRun() {
		System.out.println("사자는 달립니다.");
	}
}

// 자식의 자식 클래스 (LionChild)
class LionChild extends Lion {

	String lionChildCry;

	void lionChildRun() {
		System.out.println("새끼사자는 엉금엉금 기어갑니다.");
	}
}

public class TyepCasting01 {
	public static void main(String[] args) {

//		객체의 타입 변환 (Object Type Casting) :
//			- 업캐스팅 (up casting) : 자식 타입 ==> 부모 타입으로 변환, 명시하지 않아도 자동 변환
//				객체를 배열/컬랙션 에 저장하기 위해서 동일한 타입으로 배열/컬랙션 에 저장 

//			- 다운캐스팅 (down casting) : 부모 타입 ==> 자식 타입으로 변환, 명시해서 변환
//				- instanceof 를 사용해서 자식 타입이 존재하는지 살펴보고 다운 캐스팅해야한다.
//				- 만약 자식 타입이 존재 하지 않을 경우 실행시 오류발생

		// 1. Animal
		Animal a1 = new Animal(); // a1은 Animal 타입만 존재 : Animal 클래스의 필드/메소드만 접근가능

		// a1 : Tiger, Lion, LionChild 타입을 가지고 있지 않다.
		a1.age = 10;
		a1.name = "동물";
		a1.eat();

		// 2. Tiger 객체를 생성
		Tiger t1 = new Tiger(); // t1은 Tiger, Animal 타입을 가진다

		t1.tigerCry = "어흥"; // Tiger 필드
		t1.tigerRun(); // Tiger 메소드

		t1.name = "호랑이"; // Animal 필드
		t1.age = 20; // Animal 필드
		t1.eat(); // Animal 메소드

		// 업캐스팅 (up casting) : 자식 타입을 부모 타입으로 변환 : t1(Animal(부모), Tiger(자식))
		Animal t2 = t1; // Tiger 타입에서 Animal 타입으로 없캐스팅 (Animal 타입의 필드/메소드 만 접근가능)

		// t2는 Animal 타입으로 업캐스팅 : Animal의 필드/메소드만 접근가능
		System.out.println(t2.name);
		System.out.println(t2.age);
//		System.out.println(t2.tigerCry);	Tiger 의 필드/메소드는 접근불가

		System.out.println("===========================");

		// t2는 Animal 타입으로 정의 : 업캐스팅으로 Animal 타입만 쓸수있지만 Tiger/Animal 타입을 내포하고있긴하다.

		// 다운캐스팅 : 부모 타입 ==> 자식 타입, 명시해서 변환, 반드시 instanceof를 사용해서 실행시 오류나지않도록 처리
		Tiger t3 = (Tiger) t2;

		// t3은 Tiger 타입으로 다운캐스팅 : Tiger/Animal의 <== 부모/자식의 필드/메소드 모두 근가능

		System.out.println(t3.name); // Animal
		System.out.println(t3.age); // Animal
		System.out.println(t3.tigerCry); // Tiger

		System.out.println("===========================");

		// 3. Lion 객체를 생성 : l1 - Lion/Animal 타입 존재
		// 자식 클래스를 객체화 시키면 부모 클래스의 필드/메소드 사용가능
		Lion l1 = new Lion();
		// Lion,Animal 의 필드/메소드 모두 사용가능

		// 업캐스팅 : Lion(l1) 타입에서 Animal(l2)타입으로 업캐스팅
		// l2는 Animal의 필드/메소드만 접근가능하지만 Animal/Lion 필드/메소드를 가지고있다.
		Animal l2 = l1;

		// 다운캐스팅 : Animal(부모)타입에서 Lion(자식) 타입으로 다운캐스팅
		// l3는 Lion/Animal 의 필드/메소드 모두 사용가능
		Lion l3 = (Lion) l2;

		System.out.println("===== instanceof =====");

		// 객체 내부에 해당 타입이 존재하면 true, 존재하지 않으면 false
		System.out.println(l3 instanceof Animal); // true
		System.out.println(l3 instanceof Lion); // true
		System.out.println(a1 instanceof Tiger); // false
		System.out.println(a1 instanceof Animal); // true

		// a1 : Animal 타입만 존재
		// 객체 내부에 해당 타입이 존재하지 않는 경우 : 실행기 오류가 발생 > 컴파일 단계에서는 오류가 발생하지 않음

		if (a1 instanceof Tiger) { // false : a1 객체는 Tiger 객체가 존재 하지않는다.

			Tiger a2 = (Tiger) a1;
		} else {
			System.out.println("해당객체는 Tiger타입이 존재하지 않습니다.");
		}

		// Tiger a2 = (Tiger) a1;

		System.out.println("============================");
		
		// 4. LionChild : LionChild/Lion/Animal
		LionChild lc1 = new LionChild();

		lc1.age = 30; // Animal
		lc1.LionCry = "어흥"; // Lion
		lc1.lionChildCry = "응애"; // LionChild

		// 업캐스팅 : LionChild ==> Animal
		// lc2는 LionChild/Lion/Animal의 필드/메소드를 가지지만 Animal 필드/메소드만 접근가능
		Animal lc2 = lc1;

		System.out.println(lc2 instanceof Animal); // true
		System.out.println(lc2 instanceof Lion); // true
		System.out.println(lc2 instanceof LionChild); // true

		// 다운캐스팅 : Animal ==> Lion
		Lion lc3 = null; // 객체의 초기화 null
		if (lc2 instanceof Lion) {
			lc3 = (Lion) lc2;
			System.out.println("lc2는 Lion 타입으로 다운캐스팅 되었습니다");
		} else {
			System.out.println("lc2는 Lion 타입으로 다운캐스팅 할 수 없습니다.");
		}

		// lc3 : Lion/Animal 접근가능, LionChild/Lion/Animal의 필드/메소드 내포
		lc3.LionCry = "어흥어흥어흥"; // Lion
		lc3.age = 30; // Animal

		// lc3(Lion) ==> LionChild 로 다운캐스팅
		LionChild lc4 = (LionChild) lc3;
		
		System.out.println(lc4 instanceof LionChild); // true

	}
}
