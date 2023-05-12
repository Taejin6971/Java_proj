package chapter05.ex07;

public class Ex02 {
	public static void main(String[] args) {
		/*
		Ex02)
		main 메소드의 배열 변수 args 로 실수 값 넣어서 계산하기
		args : 합계 10.2 20.5 30.5 40.5 77.7 88.123 99.345 65.123
			for 문을 사용해서 처리
			합계 : <실수를 더한 합계>
		 */
		
		// fpr 문을 사용해서 args 배열에 담긴 값 출력
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " "); // String 각 방의 내용을 출력
		}
		System.out.println();

		System.out.println("=========================================");

		double sum = 0;
		for (int i = 1; i < args.length; i++) {
			sum += Double.parseDouble(args[i]);
		}
		System.out.printf("합계는 %.3f 입니다.", sum);
	}
}
