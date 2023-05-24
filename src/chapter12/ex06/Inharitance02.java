package chapter12.ex06;

interface Animal1 {
	void cry(); // public abstract 생략
}

interface Animal2 {
	void run();
}

interface Animal3 {
	void eat();
}

// 인터페이스가 인터페이스를 상속 할 수 있다. extends키를 사용한다.
// 클래스 < 클래스를 상속할때, 인터페이스 < 인터페이스 상속할때(다중상속가능) extends키를 사용한다.
interface K extends Animal1, Animal2, Animal3 {
	// cry(), run(), eat()
}

class G implements K {

	@Override
	public void cry() {
		System.out.println("모든 동물은 웁니다");
	}

	@Override
	public void run() {
		System.out.println("모든 동물은 달립니다.");
	}

	@Override
	public void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}

}

public class Inharitance02 {
	public static void main(String[] args) {

		K g = new G();
		g.cry();
		g.run();
		g.eat();

		Animal1 g1 = new G();
		g1.cry();

		Animal2 g2 = new G();
		g2.run();

		Animal3 g3 = new G();
		g3.eat();

	}
}
