package hi.org;

public class ConsoleOutput3 {
	public static void main(String[] args) {
		// 코드는 main 메소드 내에서 작성
		
		// 변수 선언 : Java와 JavaScriot는 완전히 별개의 언어
			// <자료형> <변수명> = <변수에 들어갈 초기값>;
		
		//문자열 자료형 : String
		String fatherName = "홍길동";
		String motherName = "홍길순";
		String myName = "홍당무";
		
		//정수형 자료형 : int
		int age = 30;
		
		//int age2 = 77.7;	// 오류 : 정수 자료형에 실수를 넣어서
		
		//실수형 자료형 : double
		double weith = 70.5;
		//double weith2 = 50;		//오류발생 X : 정수 ==>실수형으로 자동변환
		
		//int age = 50;
		System.out.println(age);	// 30
		age = 60;		// 오류 발생 age 변수를 새롭게 선언
		System.out.println(age);	// 60
		
		System.out.println("================================");
		
		age = 25;
		
		//1. println(); 으로 출력 : 문자열과 변수를 + 연결
		System.out.println("=====println() 으로 출력");
		// 우리 아버지 이름은 홍길동 이고, 우리 어머니 이름은 홍실순 입니다.
		// 나의 이름은 홍당무 이고, 나이는 25살 이고, 몸무게는 70.5 입니다.
		System.out.println("우리 아버지 이름은 "+fatherName+"이고, "+"우리 어머니 이름은 "+motherName+" 입니다.");
		System.out.println("나의 이름은 "+myName+"이고, "+"나이는 "+age+"이고, "+"몸무게는 "+weith+" 입니다.");

		//2. print(); 으로 출력 : 문자열과 변수를 + 연결
		System.out.println("=====print() 으로 출력=====");		
		System.out.print("우리 아버지 이름은 "+fatherName+"이고, "+"우리 어머니 이름은 "+motherName+" 입니다.\n"
				+ "나의 이름은 "+myName+"이고, "+"나이는 "+age+"이고, "+"몸무게는 "+weith+" 입니다.\n");

		//3. printf(); 으로 출력 : 문자열내에서 콤마 뒤의 값을 불러들여서 출력
		System.out.println("=====printf() 으로 출력=====");
		System.out.printf("우리 아버지 이름은 %s 이고, 우리 어머니 이름은 %s 입니다.\n",fatherName,motherName);
		System.out.printf("나의 이름은 %s 이고, 나이는 %d이고, 몸무게는 %4.1f 입니다.\n",myName,age,weith);
		
		System.out.printf("우리 아버지 이름은 %s 이고, 우리 어머니 이름은 %s 입니다.\n"
				+ "나의 이름은 %s 이고, 나이는 %d 이고, 몸무게는 %4.1f 입니다.\n",fatherName,motherName,myName,age,weith);

		}
}
