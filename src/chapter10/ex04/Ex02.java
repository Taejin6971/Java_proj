package chapter10.ex04;

class Car {

	String companyName = "현대자동차";
	int carYear;

}

class Hcar extends Car {

	String carName; // 자동차 모델 (에쿠스, 제네시스, 아반떼, 봉고)
	int maxSpeed; // 최대 스피드
	int oilLiter; // 각 차의 기름탱크 용량
}

class BMW extends Car {

}

public class Ex02 {

	Car[] arr = null;

	void carInfo(Car c1, Car c2, Car c3, Car c4) {
		// 현대자동차 객체를 인풋 받아서 arr배열 변수에 저장
		arr = new Car[] { c1, c2, c3, c4 };
		// 현대자동차의 배열에 저장된 최대스피드의 평균을 출력
		avgMaxSpeed(arr);
		// 현대자동차의 배열에 저장된 기름탱크용량의 합을 출력
		System.out.println("현대자동차의 배열에 저장된 기름탱크용량의 합은 " + sumOil(arr) + " L");
	}

	void avgMaxSpeed(Car[] arr) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Hcar) {
				Hcar h = (Hcar) arr[i];
				sum += h.maxSpeed;
				avg = (double) sum / arr.length;

			}
		}
		System.out.println("현대자동차의 배열에 저장된 최대스피드의 평균출력은 " + avg + " km/h");

	}

	int sumOil(Car[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Hcar) {
				Hcar h = (Hcar) arr[i];
				sum += h.oilLiter;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// 현대 자동차의 객체를 생성 후 필드 값 할당
		Hcar h1 = new Hcar(); // 2000년식/에쿠스/330km/60L
		Hcar h2 = new Hcar(); // 2010년식/제네시스/300km/50L
		Hcar h3 = new Hcar(); // 2022년식/그랜져/250km/55L
		Hcar h4 = new Hcar(); // 2023년식/아반떼/200km/40L

		h1.carYear = 2000;
		h1.carName = "에쿠스";
		h1.maxSpeed = 330;
		h1.oilLiter = 60;

		h2.carYear = 2010;
		h2.carName = "제네시스";
		h2.maxSpeed = 300;
		h2.oilLiter = 50;

		h3.carYear = 2022;
		h3.carName = "그랜져";
		h3.maxSpeed = 250;
		h3.oilLiter = 55;

		h4.carYear = 2023;
		h4.carName = "아반떼";
		h4.maxSpeed = 200;
		h4.oilLiter = 40;

		Ex02 e1 = new Ex02();
		e1.carInfo(h1, h2, h3, h4);

	}
}
