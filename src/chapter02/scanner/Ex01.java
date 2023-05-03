package chapter02.scanner;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		// 18:00 까지 완료.

		//1. Scanner 등록
		//2. 아버지 이름, 어머니 이름, 형제 이름, 자신 이름	: sc.next();
			//아버지 나이, 어머니 나이, 형제 나이, 자신 나이	: sc.nextint();
		//3. 스캐너로 받은 변수의 값을 출력
		//4. 전체 나이의 합과, 평균을 구해서 소숫점 이하 2자리까지 출력
		
		Scanner sc = new Scanner (System.in);
		String fatherName;
		String motherName;
		String brotherName;
		String myName;
		int fatherAge;
		int motherAge;
		int brotherAge;
		int myAge;
		
		System.out.println("아버지의 이름을 입력하세요>>>");
		fatherName=sc.next();
		System.out.println("어머니의 이름을 입력하세요>>>");
		motherName=sc.next();
		System.out.println("형제의 이름을 입력하세요>>>");
		brotherName=sc.next();
		System.out.println("자신의 이름을 입력하세요>>>");
		myName=sc.next();
		
		System.out.println("아버지의 나이를 입력하세요>>>");
		fatherAge=sc.nextInt();
		System.out.println("어머니의 나이를 입력하세요>>>");
		motherAge=sc.nextInt();
		System.out.println("형제의 나이를 입력하세요>>>");
		brotherAge=sc.nextInt();
		System.out.println("자신의 나이를 입력하세요>>>");
		myAge=sc.nextInt();
		
		int sum=fatherAge+motherAge+brotherAge+myAge;
		double avg=sum/4.0;
		
		System.out.printf("입력한 가족의 이름은 %s, %s, %s, %s, 입니다.\n",
				fatherName,motherName,brotherName,myName);
		System.out.printf("아버지 나이는 %d, 어머니 나이는 %d, 형제 나이는 %d, 자신의 나이는 %d 입니다,\n",
				fatherAge,motherAge,brotherAge,myAge);
		System.out.printf("%s 님의 가족원의 나이의 합은 %d 이고, 평균은 %5.2f 입니다.",
				myName,sum,avg);
		
		
		
		
		
		
		
		
		
		
			
	}
}
