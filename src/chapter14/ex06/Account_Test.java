package chapter14.ex06;

public class Account_Test {
	public static void main(String[] args) {

		Account a1 = new Account();

		// 현재 잔고 출력 // 필드의 접근 제어자가 private이므로 getter를 사용하여 필드정보 출력
		System.out.println(a1.getbalance());

		// 입금 메소드
		a1.deposit(90000); // 9만원 입금

		// 추가 예금
		a1.deposit(50000); // 5만원 입금

		// 출금 메소드 // 일반 예외를 throws, 호출하는 곳에서 예외를 처리하도록 적용
		try {
			a1.withbrow(80000); // 만원 출금
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			a1.withbrow(80000); // 1만원 출금
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}


	}
}
