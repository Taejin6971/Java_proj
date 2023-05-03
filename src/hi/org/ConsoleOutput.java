package hi.org;
// 패키지 : 클래스 파일이 저장될 폴더 구조


public class ConsoleOutput {
	public static void main(String[] args) {
		// main 메소드 블락에서 프로그램 작성
		
		//1. System.out.println ();
		
		//문자열 출력 : " " <== 처리함
		System.out.println("안녕하세요");
		
		System.out.println("오늘은 " + "날씨가 매우 맑습니다.");
		
		// + : 문자열일때는 연결을 의미
		// + : 정수, 실수 일때는 더하기 연산
		System.out.println("2"+"4");
		
		//정수 출력 : "" 를 처리 안함.
		System.out.println(2+4);
		
		//실수 출력 : ""를 처리하지 않는다.
		System.out.println(11.5+11.5);
		
		//문자열 + 실수 ==> 뒤에 실수가 문자열로 바뀜
		System.out.println("11.5"+11.5);
		
		
		System.out.println("=============================");
		//문자열과 숫자를 + 할떄 : 연결
		System.out.println("문자열"+3+4+5);
		
		//정수 + 정수 + 정수 + "문자열"
		System.out.println(3+4+5+" 문자열");
		
		//변수 선언 : 문자열을 저장하는 변수
		//자료형 변수명 = 초기값 ;
		
		String str = "안녕하세요";
		
		System.out.println(str);
		
		//정수를 담는 자료형 : int
		int a = 10;
		int b = 20;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		
		
		
		
		
	}

}
