package chapter10.ex07;

class Apple {

	Apple(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	String name;
	int price;
	int count;
}

class Banana {

	Banana(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	String name;
	int price;
	int count;
}

class Strawberry {

	Strawberry(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	String name;
	int price;
	int count;
}

public class Ex01 {

	// 배열의 객체를 매개변수로 받아서 총 가격을 출력
	void totalPrice(Object[] obj) {

//		int sumA = 0;
//		int sumB = 0;
//		int sumS = 0;
//		int allSum = 0;
//
//		for (int i = 0; i < obj.length; i++) {
//			if (obj[i] instanceof Apple) {
//				sumA = ((Apple) obj[i]).price * ((Apple) obj[i]).count;
//			}
//		}
//		for (int i = 0; i < obj.length; i++) {
//			if (obj[i] instanceof Banana) {
//				sumB = ((Banana) obj[i]).price * ((Banana) obj[i]).count;
//			}
//		}
//		for (int i = 0; i < obj.length; i++) {
//			if (obj[i] instanceof Strawberry) {
//				sumS = ((Strawberry) obj[i]).price * ((Strawberry) obj[i]).count;
//			}
//		}
//		allSum = sumA + sumB + sumS;
//
//		System.out.println("모든 과일의 촐 가격은 " + allSum + " 원 입니다.");

		int[] sum = new int[3]; // { a1, b1, s1 }

		if (obj[0] instanceof Apple) {
			sum[0] = ((Apple) obj[0]).price * ((Apple) obj[0]).count;
		}
		if (obj[1] instanceof Banana) {
			sum[1] = ((Banana) obj[1]).price * ((Banana) obj[1]).count;
		}
		if (obj[2] instanceof Strawberry) {
			sum[2] = ((Strawberry) obj[2]).price * ((Strawberry) obj[2]).count;
		}

		System.out.println("사과의 합은 : " + sum[0]);
		System.out.println("바나나의 합은 : " + sum[1]);
		System.out.println("딸기의 합은 : " + sum[2]);
		System.out.println("모든 과일의 합은 : " + (sum[0] + sum[1] + sum[2]));
	}

	public static void main(String[] args) {

//		모든 클래스는 Object의 자식 클래스 이다.
//		모든 클래스는 Object의 타입으로 업캐스팅이 가능하다.

		// 생성자를 사용해서 각 객체의 값을 할당
		// "사과" 2000 5
		// "바나나" 4000 10
		// "딸기" 5000 30
		Apple a1 = new Apple("사과", 2000, 5);
		Banana b1 = new Banana("바나나", 4000, 10);
		Strawberry s1 = new Strawberry("딸기", 5000, 30);

		// 모든 객체를 Object 배열에 넣습니다.
		Object[] obj = new Object[] { a1, b1, s1 };

		Ex01 e1 = new Ex01();
		e1.totalPrice(obj);
	}
}
