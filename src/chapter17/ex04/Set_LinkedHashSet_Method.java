package chapter17.ex04;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_LinkedHashSet_Method {
	public static void main(String[] args) {

//		set<E> : 인터페이스, 객체화 불가, 자식을 객체화시 타입으로 지정 가능
//			: 선언만 된 메소드 ==> 자식 클래스가 오버라이딩해서 구현
//			: 인터페이스의 메소드 호출시 자식 클래스의 오버라이딩된 메소드 작동
//			: 방번호가 없다. 중복된 값을 넣을수 없다. <== ID
//			: set에 값을 저장하면 중복제거되어 저장됨. 

//			- LinkedHashSet<E>		: 입력 순서대로 출력되지 않고 랜덤하게 값이 출력
//			- LinkedLinkedHashSet<E>	: 입력 순서대로 값이 출력
//			- TreeSet<E>		: 검색을 빠르게 하기 위해서
//				- 값을 저장할때 정렬해서 저장됨 : 
//					- 오름차순 정렬 (ASC)(1,2,...,10)(A,B,...,Z)(가,나,...,하)
//					- 내림차순 정렬 (DESC)(10,9,...,1)(Z,Y,...,A)(하,파,...가)

		// Set 선언
		Set<String> lSet1 = new LinkedHashSet<>();

		// 1. add(E element) : Set의 값을 추가함.
		lSet1.add("가"); // "가" 가 중복됨 <== Set은 중복된 값을 저장할수 없다.
		lSet1.add("나");
		lSet1.add("가");
		System.out.println(lSet1); // [가, 나]

		// 2. addAll (다른 Set 객체) : 자신의 set에 다른 set에 저장된 값을 넣을수 있다.(중복된 값은 저장되지 않는다)
		Set<String> lSet2 = new LinkedHashSet<>();
		lSet2.add("나");
		lSet2.add("다");
		lSet2.addAll(lSet1);
		System.out.println(lSet2); // [나, 다, 가]

		// 3. remove (Object o) : 값으로 삭제, (방번호로 삭제 불가)
		lSet2.remove("나");
		System.out.println(lSet2); // [다, 가]
		System.out.println(lSet2.toString()); // 컬랙션의 모든 구현체는 toString()이 재정의 되어있다.

		// 4. clear() : 모든값을 제거
		lSet2.clear();
		System.out.println(lSet2); // []

		// 5. isEmpty() : set에 값이 비어있으면 true, 존재하면 false
		boolean bool1 = lSet2.isEmpty();
		System.out.println(bool1); // true
		System.out.println(lSet2.isEmpty()); // true

		// 6. contains(Object o) : 메소드의 매개변수로 들어오는 값이 set에 존재하면 true 존재하지않으면 false
		Set<String> lSet3 = new LinkedHashSet<>();
		lSet3.add("가");
		lSet3.add("나");
		lSet3.add("다");
		System.out.println(lSet3.contains("나")); // true
		System.out.println(lSet3.contains("라")); // false

		// 7. size() : set에 저장된 값의 갯수
		System.out.println(lSet3.size()); // 3

		// 8. iterator 를 사용해서 set에 저장된 값을 출력 :
//		set은 방번호가 없어서 For문을 사용해서 값을 출력할수 없다.
//			iterator : set에 저장된 값을 순회자
//				hasNext() : set에 다음값이 존재하면 true 존재하지않으면 false
//				next() : 값을 출력하고, 다음 값으로 이동

		System.out.println("=== iterator를 사용해 값 출력 ================");

		// 8-1 Iterator 객체 생성
		Iterator<String> iterator = lSet3.iterator(); // set 객체에 iterator를 장창 (import)

		// 8-2 Iterator 객체를 사용해서 lSet3의 저장된 값을 가져온다
		while (iterator.hasNext()) { // 다음 값이 존재하면
			System.out.print(iterator.next() + " "); // 가 나 다
		}
		System.out.println();

		System.out.println("=== Enhanced For문을 사용해 값 출력 ==================");

		// 9. Enhanced For 문을 사용해서 출력.
		for (String k : lSet3) {
			System.out.print(k + " "); // 가 나 다
		}
		System.out.println();

		System.out.println("=== Set ==> Array로 변환후 출력 ===========");

		// 10. toArray() : set에 저장된 값을 배열로 변환, Object[] 타입으로 리턴
		Object[] obj = lSet3.toArray();
		System.out.println(Arrays.toString(obj)); // [가, 나, 다]

		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i] + " "); // 가 나 다
		}
		System.out.println();

		System.out.println("===============================");

		// 11. toArray(T[] t) : set에 저장된 값을 배열로 변환, 해당 타입으로 변환
		String[] str = lSet3.toArray(new String[0]); // String[] 배열로 꺼낸다.
		// [0] : Set에 저장된 값에 따라 방크기 지정
		System.out.println(Arrays.toString(str)); // [가, 나, 다]

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " "); // 가 나 다
		}
		System.out.println();
	}
}
