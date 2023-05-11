package chapter05.ex03;

public class Ex02 {
	public static void main(String[] args) {
		/*
		배열 방 1000개 생성, 정수 배열, 
		4의 배수를 담는데 8의 배수는 생략하여 저장
		
		출력은 10개씩 끊어서 출력, for 문을 사용해서 출력 
 		 */
		
		// 배열선언
		int[] arr1 = new int[1000]; // 배열방 1000개 생성, index : 0~1000

		// 각 배열 방에 값을 삽입
		int i = 0;
		int a = 0;
		
		for ( a = 0; true; a++) { // i: 배열의 방 번호, a : 배열방의 값
			
			if ((a % 4 == 0) && (a % 8 != 0)) { // 4의 배수이면서 8의 배수가 아닐떄
				arr1[i] = a;
				i++;
			}
			if (i == 1000)
				break;
		}
		
		//출력
		for ( i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+"\t");
		
			if((i+1)%10==0) {
				System.out.println();
			}
		}
	}
}
