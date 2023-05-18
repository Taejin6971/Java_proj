package chapter08.ex02;

public class A {

	// 생성자
	public A() {
	}

	// 필드에 부여된 접근 제어자
	public int a = 1;		// 같거나,다른 패키지에서 모두 접근 가능
	protected int b = 2;	// 같은 패키지 내에서 접근 가능, 다른 패키지에서 접근할때는 상속관계가 있어야함
	int c = 3;				// 외부 클래스에서 접근 가능, 단 같은 패키지에 있어야 가능
	private int d = 4;		// 같은 클래스에서만 접근 가능, 외부 클래스 접근 불가 

	// 메소드에 부여된 접근 제어자
	public void abc() {
		System.out.println("public");
	}

	protected void bcd() {
		System.out.println("protected");
	}

	void cde() {
		System.out.println("default");
	}

	private void def() {
		System.out.println("private");
	}

	public static void main(String[] args) {

	}
}
