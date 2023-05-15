package chapter06.ex01;

class Car {

	// 기본 생성자
	public Car() {}

	// 필드 (속성)
	String company; // 제조사
	String carName; // 차명
	String carColor; // 색깔
	int carSpeed; // 스피드
	double carWeigth; // 무게

	// 메소드 (기능)
	public void start() {
		System.out.println(carName + " 가(이) 달립니다.");
	}

	public void stop() {
		System.out.println(carName + " 가(이) 멈춥니다.");
	}

	public void print() {
		System.out.println("회사명 : " + company);
		System.out.println("차명 : " + carName);
		System.out.println("차 색깔 : " + carColor);
		System.out.println("차 스피드 : " + carSpeed + "km/h");
		System.out.println("차 무게 : " + carWeigth + "톤");
	}
	
}

public class Object04 {
	public static void main(String[] args) {
		// c1 객체 : 현대자동차 / 그랜져 / 검은색 / 250 / 1.0 톤
		// c2 객체 : 쌍용자동차 / 투싼 / 노란색 / 300 / 2.0 톤
		// c3 객체 : 기아자동차 / K9 / 흰색 / 350 / 2.5 톤

		// 각 기체의 메소드 출력

		// c1,2,3 객체 생성
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();

		// 객체 자체를 출력 할 경우 : 객체의 Heap 주소가 출력 됨 : 패키지이름.클래스이름@주소 : 16진수
		System.out.println(c1);

		// c1,2,3 필드의 값 할당
		// 현대자동차 / 그랜져 / 검은색 / 250 / 1.0 톤
		c1.company = "현대자동차";
		c1.carName = "그랜져";
		c1.carColor = "검은색";
		c1.carSpeed = 250;
		c1.carWeigth = 1.0;

		// 쌍용자동차 / 투싼 / 노란색 / 300 / 2.0 톤
		c2.company = "쌍용자동차";
		c2.carName = "투싼";
		c2.carColor = "노란색";
		c2.carSpeed = 300;
		c2.carWeigth = 2.0;

		// 기아자동차 / K9 / 흰색 / 350 / 2.5 톤
		c3.company = "기아자동차";
		c3.carName = "K9";
		c3.carColor = "흰색";
		c3.carSpeed = 350;
		c3.carWeigth = 2.5;

		// c1,2,3 필드의 값 출력 (stop();, start();, print();)
		System.out.println("\n===== c1 객체 =====");
		c1.start();
		c1.stop();
		c1.print();
		System.out.println("\n===== c2 객체 =====");
		c2.start();
		c2.stop();
		c2.print();
		System.out.println("\n===== c3 객체 =====");
		c3.start();
		c3.stop();
		c3.print();

		// 객체를 배열에 저장후 출력
		System.out.println("\n===== 객체를 배열에 저장 =====");

		// c1, c2, c3 객체를 1차원 배열에 저장
		// 배역 선언 : Car 객체를 저장
		Car[] arr1 = new Car[3]; // arr1은 Car 객체를 저장

		// 배열의 각 방에 Car 객체를 저장
		arr1[0] = c1;
		arr1[1] = c2;
		arr1[2] = c3;

		// 배열의 저장된 각 방에 객체를 다시 끄집어 낸다.
		Car out1 = arr1[0]; // arr1 0번 방의 객체 c1이 out1으로 끄집어 내진다.
		Car out2 = arr1[1]; // arr1 1번 방의 객체 c2이 out2으로 끄집어 내진다.
		Car out3 = arr1[2]; // arr1 2번 방의 객체 c3이 out3으로 끄집어 내진다.
		System.out.println(c1);
		System.out.println(out1);

		out1.print();
		System.out.println("============");
		out2.print();
		System.out.println("============");
		out3.print();

	}
}
