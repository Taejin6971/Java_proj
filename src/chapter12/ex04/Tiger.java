package chapter12.ex04;

public class Tiger implements Animal {

	@Override
	public void cry() {
		System.out.println("크아앙");
	}

	@Override
	public void run() {
		System.out.println("호랑이가 달립니다.");
	}

}
