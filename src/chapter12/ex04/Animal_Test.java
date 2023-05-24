package chapter12.ex04;

public class Animal_Test {
	public static void main(String[] args) {

		// 1. 각 클래스를 객체화시 interface 타입으로 지정 후 메소드 호출, Animal(interface)
		Animal a1 = new Cat();
		Animal d1 = new Dog();
		Animal l1 = new Lion();
		Animal t1 = new Tiger();

		a1.cry();
		a1.run();
		d1.cry();
		d1.run();
		l1.cry();
		l1.run();
		t1.cry();
		t1.run();

		Animal[] arr = new Animal[] { a1, d1, l1, t1 };

		System.out.println("=== for ===============");
		for (int i = 0; i < arr.length; i++) {
			arr[i].run();
			arr[i].cry();
			System.out.println();
		}

		System.out.println("=== Enhanced For ===============");
		for (Animal k : arr) {
			k.cry();
			k.run();
			System.out.println();
		}

	}
}
