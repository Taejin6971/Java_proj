package chapter06.ex01;

class Animal {
	// 기본 생성자
	public Animal() {}

	// 필드
	String animalName;
	String animalCry;
	String animalRun;
	int animalAge;
	double animalWeigth;

	// 필드의 내용을 출력
	public void print() {
		System.out.println("동물의 종 : " + animalName);
		System.out.println("동물의 울음소리 : " + animalCry);
		System.out.println("동물의 걸음거리 : " + animalRun);
		System.out.println("동물의 나이 : " + animalAge + "살");
		System.out.println("동물의 몸무게 : " + animalWeigth + "kg");
	}

}

public class Object05 {
	public static void main(String[] args) {
		// Animal 클래스 ==> tiger 객체 생성 : 호랑이 / 어흥 / 껑충껑충 / 10 / 300
		// Animal 클래스 ==> egle 객체 생성 : 독수리 / 키이오 / 훨훨날아감 / 20 / 30
		// Animal 클래스 ==> dog 객체 생성 : 개 / 멍멍 / 팔짝팔짝 / 40 / 20
		// arr1 배열에 객체를 저장 후 끄집어 내서 출력

		// 객체 생성
		Animal tiger = new Animal();
		Animal egle = new Animal();
		Animal dog = new Animal();

		// 각 객체의 필드 값 할당
		// 호랑이 / 어흥 / 껑충껑충 / 10 / 300
		tiger.animalName = "호랑이";
		tiger.animalCry = "어흥";
		tiger.animalRun = "껑충껑충";
		tiger.animalAge = 10;
		tiger.animalWeigth = 300;

		// 독수리 / 키이오 / 훨훨날아감 / 20 / 30
		egle.animalName = "독수리";
		egle.animalCry = "키이오";
		egle.animalRun = "훨훨 날아감";
		egle.animalAge = 20;
		egle.animalWeigth = 30;

		// 개 / 멍멍 / 팔짝팔짝 / 40 / 20
		dog.animalName = "개";
		dog.animalCry = "멍멍";
		dog.animalRun = "팔짝팔짝";
		dog.animalAge = 40;
		dog.animalWeigth = 20;

		// 객체의 필드 값 출력
		System.out.println("===== tiger 객체 =====");
		tiger.print();
		System.out.println("\n===== egle 객체 =====");
		egle.print();
		System.out.println("\n===== dog 객체 =====");
		dog.print();

		// 배열 선언
		// 1. 방의 크기를 지정 후 각 방에 값을 입력
		int[] arr11 = new int[3];// arr11 배열은 방(index) 3개가 생성이 되고 정수만 저장 가능
		double[] arr12 = new double[3]; // arr12 배열은 방(index) 3개가 생성되고 실수만 저장 가능
		String[] arr13 = new String[3]; // arr13 배열은 방(index) 3개가 생성되고 문자열만 저장 가능

		Animal[] arr1 = new Animal[3];
		
		// 각 배열의 방에 Animal 타입의 객체를 저장, 
		//tiger, egle, dog는 Animal 클래스로 생섬됨, Animal 타입을 가지고있다. 
		arr1[0] = tiger;	// arr1 0번쨰 방에 tiger 객체를 저장
		arr1[1] = egle;		// arr1 1번쨰 방에 egle 객체를 저장
		arr1[2] = dog;		// arr1 2번쨰 방에 dog 객체를 저장

		// 각 배열의 방에는 객체의 Heap의 주소가 들어가있다.
		System.out.println("======================");
		System.out.println(tiger);	// @76ccd017
		System.out.println(egle);	// @182decdb
		System.out.println(dog);	// @26f0a63f

		// 각 배열의 방의 저장된 객체를 다시 변수에 할당해서 끄집어 낸다.
		//객체 변수를 선언 후 끄집어 낸다.
		System.out.println("======================");
		
		Animal out1 = null; 		// 객체형 변수 : out1
		System.out.println(out1);	// null
		out1 = arr1[0];				// arr1[0] 의 방의 값을 가지고 와서 out1 변수에 할당
		System.out.println(out1);	// 76ccd017
		Animal out2 = arr1[1];		// egle 객체를 끄집어 내서 out2에 할당
		Animal out3 = arr1[2];		// dog 객체를 끄집어 내서 out3에 할당
		
		System.out.println(out2);	// @182decdb
		System.out.println(out3);	// @26f0a63f

		// 출력
		System.out.println("====================");
		out1.print();
		System.out.println("\n====================");
		out2.print();
		System.out.println("\n====================");
		out3.print();

	}
}
