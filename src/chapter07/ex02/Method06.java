package chapter07.ex02;

class MethodOverRiding {
	
	// 메소드 오버 라이딩 : 부모 클래스의 메소드를 재정의 해서 사용
	
	// 기본 생성자 : 객체를 생성할때 필드의 초기값,
		// 다른 생성자가 없을때 생략시 호출 가능
		// 다른 생성자가 존재할때 생략시 호출 불가능
	MethodOverRiding() {}
	
	// 사용자 정의 생성자 : 매개변수로 인풋 값을 아규먼트로 받아서 필드에 로드
	MethodOverRiding (String a, String b, String c, int d, double e){
		company = a;
		model = b;
		color = c;
		maxSpeed = d;
		weight = e;
		
	}
	
	String company ;
	String model ;
	String color ;
	int maxSpeed ;
	double weight ;
	
	// 객체 자체를 출력시 객체의 Heap 주소를 출력 하는 것이 아니라, 객체의 RAM에 들어있는 값을 출력 하도록 함.
	// Object 클래스의 toString() 메소드를 오버라이딩 해서 출력
	@Override
	public String toString() {
		return "회사명 : " + company + ", 모델 : " + model + ", 색깔 : " + color + ", 최대속도 : " + 
				maxSpeed + ", 차의 무게 : " + weight;
	}
	
}

public class Method06 {
	public static void main(String[] args) {

		/*
			Object 클래스 : 모든 자바 클래스의 최상의 부모 클래스,
				- 모든 클래스는 Object 클래스의 필드와, 메소드를 상속 받습니다.
				- 자식 클래스는 Object 클래스의 필드와, 메소드를 사용 할 수 있다.
				- toString() 메소드는 객체 자체를 출력 할때 toString()이 작동됨
					- 자식 클래스에서 toString() 메소드를 재정의 해서 사용함.
					- 그 객체의 필드의 값을 출력 할때 많이 사용됨.
		 */
		
		// 기본 생성자 호출 후 출력
		MethodOverRiding m1 = new MethodOverRiding();
		System.out.println(m1);
		System.out.println(m1.toString());
		
		// 사용자 정의 생성자 호출 후 출력
		MethodOverRiding m2 = new MethodOverRiding("현대","그랜져","검은색",250,1000.0);
		MethodOverRiding m3 = new MethodOverRiding("기아","K9","흰색",350,2000.0);
		MethodOverRiding m4 = new MethodOverRiding("삼성","SM5","초록색",270,1500.0);
		MethodOverRiding m5 = new MethodOverRiding("쌍용","투싼","노란색",250,1700.0);
		
		System.out.println("=====================");
		//각 객체의 필드의 값을 출력
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
	}
}
