package chapter12.ex05;

public class Fluit_Test {
	public static void main(String[] args) {

		Fluit a = new Apple();
		Fluit s = new Strawberry();
		Fluit b = new Banana();

		Fluit[] arr = new Fluit[] { a, s, b };

		for (Fluit k : arr) {
			k.name();
			k.eat();
			k.color();
			System.out.println();
		}
	}
}
