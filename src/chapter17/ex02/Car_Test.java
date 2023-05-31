package chapter17.ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Car_Test {
	public static void main(String[] args) {

		// 1. Car 타입의 객체 5개 생성
		Car c1 = new Car("삼성", "SM7", "흰색", 210);
		Car c2 = new Car("기아", "K9", "검은색", 200);
		Car c3 = new Car("쌍용", "티볼리", "노란색", 180);
		Car c4 = new Car("현대", "그랜저", "초록색", 230);
		Car c5 = new Car("벤츠", "Eclass", "빨간색", 250);

		// 2. ArrayList에 저장
		List<Car> aList = new ArrayList<>();
		aList.add(c1);
		aList.add(c2);
		aList.add(c3);
		aList.add(c4);
		aList.add(c5);

		// 3. Vector에 저장
		List<Car> aVector = new Vector<>();
		aVector.add(c1);
		aVector.add(c2);
		aVector.add(c3);
		aVector.add(c4);
		aVector.add(c5);

		// 4. LinkedList에 저장
		List<Car> aLinkedList = new LinkedList<>();
		aLinkedList.add(c1);
		aLinkedList.add(c2);
		aLinkedList.add(c3);
		aLinkedList.add(c4);
		aLinkedList.add(c5);

		// 5. 리스트에 저장된 Car객체를 가져와서 For 문으로 출력
		System.out.println("=== For 문 =======================================");
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
		System.out.println();

		// 6. 리스트에 저장된 Car객체를 가져와서 Enhanced For 문으로 출력
		System.out.println("=== Enhanced For 문 ===============================");
		for (Car c : aList) {
			System.out.println(c);
		}
	}
}
