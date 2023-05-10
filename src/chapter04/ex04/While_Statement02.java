package chapter04.ex04;

public class While_Statement02 {
	public static void main(String[] args) {
		/*
			반목문 : 무한루프 빠지지 않도록 해야 한다
		 */
		System.out.println("===== 무한루프 탈출 ======");

		boolean abc = true;
		int i = 1;

		while (abc) { // 무한루프 : 100번 출력
			System.out.println("무한루프" + i);
			if (i == 100) {
				break;	// i 가 100 일때 while 블락을 탈출
			} 
			i++;

		}

	}
}
