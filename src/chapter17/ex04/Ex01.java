package chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {

		Set<Integer> hSet = new HashSet<>();

		// 1. For 문을 사용해서 1~100 까지 HashSet에 값 저장
		for (int i = 1; i <= 100; i++) {
			hSet.add(i);
		}

		// 2. iterator를 사용해서 HashSet에 저장된 값 출력
		Iterator<Integer> iterator = hSet.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		// 3. Enhanced For문을 사용해서 출력
		for (int k : hSet) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// 4. HashSet에 저장된 값 ==> 배열로 변환, 일반 for문을 사용해서 출력
		Integer[] arr = hSet.toArray(new Integer[0]);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
