package hi.org;

public class ConsoleOutput2 {
	public static void main(String[] args) {
		
		//변수 선언 (문자열 변수)
		String str1="안녕";
		String str2=" 하세요";
		
		//변수 선언 (정수 변수)
		int a = 10;
		int b = 20;
	
		//변수 선언 (실수 변수)
		double c =11.1;
		double d =12.5;
		
		System.out.println("==========변수의 내용 출력==========");
		
		System.out.println("str 변수의 값은 : "+str1);
		System.out.printf("str 변수의 값은 : %s\n",str2);
		
		System.out.println("=====println을 사용해서 문자열과 변수를 출력(+)=====");
		
		System.out.println("str1 : "+str1+", sta2 : "+str2);
		System.out.printf("str1 : %s, str2 : %s\n",str1,str2);
		System.out.println("ㅋ");
	}
}
