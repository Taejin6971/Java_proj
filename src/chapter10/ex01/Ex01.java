package chapter10.ex01;

// 부모 클래스 (Animal) : 동물

class Animal {

	String name;
	int age;
	String color;

	void eat() {
		System.out.println("Animal - 모든 동물은 먹습니다.");
	}

	void sleep() {
		System.out.println("Animal - 모든 동물은 잠을 잡니다.");
	}
}

// 자식 클래스 (Tiger, Eagle, Lion ==> Animal) // 추가으로 필드1 (Sound), 메소드1 (Run)

class Tiger extends Animal {

	String tigersound;

	void tigerRun() {
		System.out.println("Tiger 호랑이는 호다닥 뛰어다닙니다.");
	}
}

class Eagle extends Animal {

	String eaglesound;

	void eagleRun() {
		System.out.println("Eagle 독수리는 훨훨 날아다닙니다.");
	}
}

class Lion extends Animal {

	String lionsound;

	void lionRun() {
		System.out.println("Lion 사자는 펄쩍펄쩍 뛰어다닙니다.");
	}
}

// 자식의 자식 클래스 (LionChild ==> Lion)
class LionChild extends Lion {

	String lionchildsound;

	void lionchildRun() {
		System.out.println("LionCfild 새끼사자는 깡총깡총 뛰어다닙니다");
	}
}

public class Ex01 {
	public static void main(String[] args) {

		// 부모 : Animal 객체 생성
		Animal a1 = new Animal(); // a1 : Animal 타입만 존재

		// 자식 : Tiger, Eagle, Lion ==> Animal 객체 생성
		Tiger t1 = new Tiger(); // t1 : Tiger, Animal
		Eagle e1 = new Eagle(); // e1 : eagle, Animal
		Lion l1 = new Lion(); // l1 : Loin, Animal

		// 자식의 자식 : LionChild ==> Lion
		LionChild lc1 = new LionChild(); // lc1 : LionChild ,Loin, Animal

		a1.name = null;
		a1.age = 0;
		a1.color = null;

		a1.eat();
		a1.sleep();

		t1.name = "호랑이";
		t1.age = 10;
		t1.color = "줄무늬";
		t1.tigersound = "으르렁";

		t1.eat();
		t1.sleep();
		t1.tigerRun();

		e1.name = "독수리";
		e1.age = 11;
		e1.color = "회색";
		e1.eaglesound = "끼오오";

		e1.eat();
		e1.sleep();
		e1.eagleRun();

		l1.name = "사자";
		l1.age = 12;
		l1.color = "베이지";
		l1.lionsound = "어흥";

		l1.eat();
		l1.sleep();
		l1.lionRun();

		lc1.name = "새끼사자";
		lc1.age = 2;
		lc1.color = "베이지";
		lc1.lionchildsound = "카오";

		lc1.eat();
		lc1.sleep();
		lc1.lionchildRun();

	}
}
