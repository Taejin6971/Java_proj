package chapter17.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_VS_List {
	public static void main(String[] args) {

//		배열 : 
//			- 하나의 변수에 많은 값을 저장 : index 0 ~ // arr[0],arr[1] 
//			- 배열에 동일한 타입의 값을 저장해야 한다. int[] arr = new int[10];
//			- 배열 선언시 방크기가 지정. String[] arr = new String[] {"A","B","C"}
//			- 배열은 방의 크기가 지정이 되면 수정이 불가능 하다. 삭제 후 재생성
//			- 배열은 방의 중간의 값을 제거/삽입 시 방이 자동으로 축소/증가 되지않는다.

//		컬렉션(프레임워크) : 
//			- 방의 크기를 저장하지 않는다. 자동으로 축소/증가 한다. 무한으로 늘어난다
//			- 동일한 타입의 값을 저장 한다.
//			- 제너릭 타입
//			- List<E> : 인터페이스, 객체화 불가, 자식을 객체화시 타입으로 지정가능
//				- index[방번호]를 가진다 
//				- ArrayLit<E>, Vector<E>, LinkedList<E>

		// 1. 배열
		// 방의 크기 : arr.lengh() // 7
		String[] arr = new String[] { "가", "나", "다", "라", "마", "바", "사" };
		System.out.println("배열의 방의 객수 : " + arr.length);
		// 배열의 중간의 값을 제거시 자동으로 축소되거나 늘어나지 않는다.
		arr[2] = null;
		arr[5] = null;
		// 배열의 중간의 값을 제거시 자동으로 축소되지 않는다.
		System.out.println(Arrays.toString(arr));
		System.out.println("배열의 방의 객수 : " + arr.length);

		// 2. 컬렉션 : List<E> <== ArrayList<E> (import 필요)
		List<String> aList = new ArrayList<>();
//		인터페이스				List의 메소드를 구현한 구현체
		System.out.println("List의 방의 크기 : " + aList.size()); // 방의 크기출력
		aList.add("가"); // add : 값 추가
		aList.add("나");
		aList.add("다");
		aList.add("라");
		aList.add("마");
		aList.add("바");
		aList.add("사");
		System.out.println("List의 방의 크기 : " + aList.size()); // 방의 크기출력
		aList.remove("다"); // remove : 값 제거
		aList.remove("바");
		System.out.println("List의 방의 크기 : " + aList.size()); // 방의 크기출력

	}
}
