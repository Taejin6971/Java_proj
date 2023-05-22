package chapter10.ex03;

class Customer {

	void memberInfo() {
		System.out.println("회원님은 기본 회원님 입니다.");
	}
}

class Gold extends Customer {

	@Override
	void memberInfo() {
		System.out.println("회원님은 Gold 회원님 입니다.");
	}
}

class Silver extends Customer {

	@Override
	void memberInfo() {
		System.out.println("회원님은 Silver 회원님 입니다.");
	}
}

class Bronze extends Customer {

	@Override
	void memberInfo() {
		System.out.println("회원님은 Bronze 회원님 입니다.");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		// 자식을 객체화시 부모 타입으로 지정
		// 부모의 memberInfo() 메소드 호출시 오버라이딩된 메소드 출력
		// for / Enhanced For 문에 넣어서 출력

		Customer gc1 = new Gold();
		Customer sc1 = new Silver();
		Customer bc1 = new Bronze();

		gc1.memberInfo();
		sc1.memberInfo();
		bc1.memberInfo();

		Customer[] arr1 = new Customer[] { gc1, sc1, bc1 };

		System.out.println("===== For 문 =====");

		for (int i = 0; i < arr1.length; i++) {
			arr1[i].memberInfo();
		}

		System.out.println("===== Enhanced For 문 =====");

		for (Customer k : arr1) {
			k.memberInfo();
		}
	}
}
