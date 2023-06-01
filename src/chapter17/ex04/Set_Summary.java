package chapter17.ex04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Summary {
	public static void main(String[] args) {

//		Set<E> :
//			- HashSet<E>		: 입력 순서대로 출력되지 않고 랜덤하게 값이 출력
//			- LinkedHashSet<E>	: 입력 순서대로 값이 출력
//			- TreeSet<E>		: 검색을 빠르게 하기 위해서
//				- 값을 저장할때 정렬해서 저장됨 : 
//					- 오름차순 정렬 (ASC)(1,2,...,10)(A,B,...,Z)(가,나,...,하)
//					- 내림차순 정렬 (DESC)(10,9,...,1)(Z,Y,...,A)(하,파,...가)

		// 1. 객체 생성
		Set<String> hSet = new HashSet<>();
		Set<String> lSet = new LinkedHashSet<>();
		Set<String> tSet = new TreeSet<>();

		// 2. 값 입력 후 출력
		// HashSet : 랜덤하게 출력
		hSet.add("다");
		hSet.add("마");
		hSet.add("나");
		hSet.add("가");
		System.out.println(hSet); // HashSet : 입력한 순서대로 출력 되지 않는다. [가, 다, 마, 나]

		// LinkedHashSet : 입력한 순서대로 출력
		lSet.add("다");
		lSet.add("마");
		lSet.add("나");
		lSet.add("가");
		System.out.println(lSet); // LinkedHashSet : 입력한 순서대로 출력 [다, 마, 나, 가]

		// TreeSet : 오름차순 정렬해서 저장되어 출력
		tSet.add("다");
		tSet.add("마");
		tSet.add("나");
		tSet.add("가");
		System.out.println(tSet); // TreeSet : 오름차순 정렬되어 출력 [가, 나, 다, 마]
	}
}
