package chapter14.ex06;

public class Account {

	private long balance = 10000; // balance : 은행에 예금된 잔고

	// 기본 생성자
	Account() {
	}

	// getter : 메소드 호출시 필드의 정보를 출력, private 필드의 정보를 출력
	public long getbalance() {
		return balance;
	}

	// 예금을 입금만 하는 메소드 > money를 인풋 받아 예금잔고에 + 적용
	public void deposit(int money) {
		// 코드 완성
		System.out.println("예금잔고는 : " + getbalance() + "원 입니다.");
		System.out.println(money + "원이 입금 되었습니다.");
		balance += money;
		System.out.println("현재 예금잔고는 : " + getbalance() + "원 입니다.\n");
	}

	// 예금을 출금만 하는 메소드
	// money를 인풋 받아 예금잔고보다 높으면 BalanceException ("예금잔고가 부족합니다")
	public void withbrow(int money) throws BalanceException {
		// 코드 완성
		if (money > balance) { // 출금액이 예금액보다 많으면 예외 처리
			System.out.println("예금잔고는 : " + getbalance() + "원 입니다.");
			System.out.println("출금액은 : " + money + "원 입니다.");
			throw new BalanceException("예금잔고가 " + (balance - money) + "원 부족합니다.\n");
			// 예외를 강제 발생
		} else {
			System.out.println("예금잔고는 : " + getbalance() + "원 입니다.");
			System.out.println(money + "원을 출금 하셨습니다.");
			balance -= money;
			System.out.println("현재 예금잔고는 : " + getbalance() + "원 입니다.\n");
		}
	}
}
