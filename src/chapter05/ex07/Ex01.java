package chapter05.ex07;

public class Ex01 {
	public static void main(String[] args) {
		/*
		Ex01)
		main 메소드 args 로 다음의 값을 넘긴다
		
		국어 60 영어 70 수학 80 음악 90 과학 70
		
		각 과목의 합계 : 
		각 과목의 평균 :
		*/
		
		// 1. for 문을 사용해서 배열로 들어오는 천제 내용을 출력
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " "); // String 각 방의 내용을 출력
		}
		System.out.println();

		System.out.println("===== for 문을 사용해서 각 과목의 점수를 int형으로 변환 후 출력 : 합계 : 평균 =====");

		int count = 0;
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			if (i % 2 != 0) { // (i == 1 || i == 3 || i == 5 || i == 7 || i == 9)
				sum += Integer.parseInt(args[i]); // sum = sum + 정수로 바꾼 점수
				count++;
			}
		}
		System.out.printf("모든 과목의 합계는 %d 이고, 평균은 %.2f 입니다.", sum, ((double) sum / count));
	}
}
