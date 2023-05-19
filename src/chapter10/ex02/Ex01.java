package chapter10.ex02;

// 상속, 캐스팅
class Customer { // 부모 클래스 : 고객의 정보를 담은 클래스

	String name; // 고객이름
	Long customerId; // 고객ID
	int customerPoint;

	void custominfo() {
		System.out.println("고객 이름 : " + name + ", 고객 ID : " + customerId + ", 고객 포인트 : " + customerPoint);
	}

}

// 자식 클래스 : GoldMember, SilverMember, BronzeMember 
//				<== int goldPoint 10점, silverPoint 5점, bronzePoint 3점, 
//					메소드 goldInfo() 골드 회원 입니다. ...

class GoldMember extends Customer {

	int goldpoint;

	void goldinfo() {
		System.out.println("고객 이름 : " + name + ", 고객 ID : " + customerId + ", 고객 포인트 : " + customerPoint);
	}
}

class SilverMember extends Customer {

	int silverpoint;

	void silverinfo() {
		System.out.println("고객 이름 : " + name + ", 고객 ID : " + customerId + ", 고객 포인트 : " + customerPoint);
	}
}

class BronzeMember extends Customer {

	int bronzepoint;

	void bronzeinfo() {
		System.out.println("고객 이름 : " + name + ", 고객 ID : " + customerId + ", 고객 포인트 : " + customerPoint);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 각 객체를 생성해서 부모 클래스의 필드/메소드 접근 가능한지 확인후 업캐스팅 <== 다운캐스팅

		Customer c1 = new Customer();
		GoldMember g1 = new GoldMember();
		SilverMember s1 = new SilverMember();
		BronzeMember b1 = new BronzeMember();

		c1.name = null;
		c1.customerId = 0L;
		c1.customerPoint = 0;
		c1.custominfo();

		System.out.println("====================");

		// GoldMember
		g1.name = "골드맴버";
		g1.customerId = 1111L;
		g1.customerPoint = 10;
		g1.goldinfo();

		System.out.println("====================");

		// SilverMember
		s1.name = "실버맴버";
		s1.customerId = 2222L;
		s1.customerPoint = 5;
		s1.silverinfo();

		System.out.println("====================");

		// BronzeMember
		b1.name = "브론즈맴버";
		b1.customerId = 3333L;
		b1.customerPoint = 3;
		b1.bronzeinfo();

		System.out.println("\n===== c1, g1, s1, b1 을 Customer 타입으로 배열에 저장 =====");

		// c1(cus타입), g1(gold/cus 타입), s1(sil/cus 타입), b1(bron/cus 타입) 을
		// Customer 타입으로 배열에 저장
		// 배열 arr1에 저장된 모든 객체는 Customer타입을 내포 하고있고 Customer타입으로 업캐스팅 되어 들어가 있음

		// arr1에 들어가 있는 객체는 Customer 타입
		Customer[] arr1 = new Customer[] { c1, g1, s1, b1 };

		// 베열에 저장된 객체를 가지고 온다
		Customer cc1 = arr1[0]; // Customer
		Customer cc2 = arr1[1]; // Customer, GoldMember
		Customer cc3 = arr1[2]; // Customer, SilverMember
		Customer cc4 = arr1[3]; // Customer, BronzeMember

		//
		cc1.custominfo();

		// 다운캐스팅
		GoldMember g2 = (GoldMember) cc2;
		g2.goldinfo();

		SilverMember s2 = (SilverMember) cc3;
		s2.silverinfo();

		BronzeMember b2 = (BronzeMember) cc4;
		b2.bronzeinfo();

		System.out.println("===================================");

		// 객체 생성시 타입을 지정

		// 1. Customer 객체 생성시 타입 지정
		Customer cus1 = new Customer();

		// 2. GoldMember 객체화시 Customer 타입으로 지정
		Customer cus2 = new GoldMember(); // cus2 : GM / CM 를 내포하지만 CM 으로 타입 지정
		cus2.name = "고객 이름"; // CM 만 접근가능
		GoldMember gm1 = (GoldMember) cus2;
		gm1.goldpoint = 10;
		gm1.goldinfo();

		// 2.1 GoldMember 객체화시 GoldMember 타입으로 지정 : GM / CM 모두 접근가능
		GoldMember gm2 = new GoldMember();
		gm2.goldinfo();

		// 3. SilverMember 객체화시 Customer타입으로 지정
		Customer cus3 = new SilverMember(); // cus3 : SM / CM 를 내포하지만 CM 으로 타입 지정
		SilverMember sm1 = (SilverMember) cus3;

		// 3.1 SilverMember 객체화시 SilverMember 타입으로 지정
		SilverMember sm2 = new SilverMember();
		// sm2 : SilverMember / Customer

		System.out.println("==========================================");

		Customer ccc1 = new GoldMember(); // ccc1 : GM / CM 내포
		Customer ccc2 = new SilverMember(); // ccc1 : SM / CM 내포
		Customer ccc3 = new BronzeMember(); // ccc1 : BM / CM 내포

		// 자식 클래스를 부모 타입으로 객체화 해서 배열에 저장
		Customer[] arr2 = new Customer[] { ccc1, ccc2, ccc3 };
		
		// 각 배열의 방의 값을 끄집어 내면서 다운 캐스팅
		GoldMember gm3 = (GoldMember) arr2[0];
		SilverMember sm3 = (SilverMember) arr2[1];
		BronzeMember bm3 = (BronzeMember) arr2[2];
	}
}
