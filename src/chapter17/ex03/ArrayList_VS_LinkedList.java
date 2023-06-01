package chapter17.ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_VS_LinkedList {
	public static void main(String[] args) {

//		List<E>
//			- ArrayList<E>, Vector<E> : 검색시 성능이 빠르다. 값을 추가(add)/삭제(remove)시 부하가 많이 걸린다.
//			- LinkedList<E> : 검색이 느리다. 값을 추가/삭제시 부하가 걸리지 않는다.

		// 1. 데이터를 추가할때 성능 비교
		List<Integer> List = new ArrayList<>();
		List<Integer> LinkedList = new LinkedList<>();

		// 성능을 체크하는 변수 선언
		long startTime = 0, endTime = 0;

		// 1-1 ArrayList의 성능 체크
		startTime = System.nanoTime(); // 현재 시간을 나노로 변환해서 정수형으로 저장

//		System.out.println(startTime);
		// ArrayList에 1부터 1씩 증가하면서 100000개의 값을 저장
		for (int i = 0; i < 100000; i++) {
			List.add(0, i);
		}
		// 프로그램을 실행한 나노 타임
		endTime = System.nanoTime();
		System.out.println(endTime - startTime); // 234565400 나노(초) ArratList

		System.out.println("=======================");

		// 1-1 LinkedList의 성능 체크
		startTime = System.nanoTime(); // 현재 시간을 나노로 변환해서 정수형으로 저장

//		System.out.println(startTime);
		// LinkedList에 1부터 1씩 증가하면서 100000개의 값을 저장
		for (int i = 0; i < 100000; i++) {
			LinkedList.add(0, i);
		}
		// 프로그램을 실행한 나노 타임
		endTime = System.nanoTime();
		System.out.println(endTime - startTime); // 3574000 나노(초) LinkedList

		System.out.println("=== 값을 검색시 차이 ==================");

		// 2. ArrayList 검색시 성능 체크
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			List.get(i);
		}
		endTime = System.nanoTime();
		System.out.println(endTime - startTime); // 903700 나노(초) ArratList 검색시간

		System.out.println("=====================================");

		// 2. LinkedList 검색시 성능 체크
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			LinkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println(endTime - startTime); // 2873906600 나노(초) LinkedList 검색시간
	}
}
