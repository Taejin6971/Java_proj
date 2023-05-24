package chapter12.ex04;

public class Cat implements Animal {

	@Override
	public void cry() {
		System.out.println("야옹");
	}

	@Override
	public void run() {
		System.out.println("고양이가 달립니다.");
	}

}
