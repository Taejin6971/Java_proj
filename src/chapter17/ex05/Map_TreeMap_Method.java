package chapter17.ex05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_TreeMap_Method {

	public static void main(String[] args) {

//		map <K,V>  : K : Key    : 중복되면 안됨 , Set 관리됨    <=== 방번호 (List) 
//		             V : Value  : 중복된 값을 넣을 수 있음. 
//		                 
//			- HashMap <K,V> 	:  Key(HashSet)  임의로 출력됨, 싱글 쓰레드(ArrayList), 
//		    - HashTable <K,V>   :  Key(HashSet)  임의로 출력됨, 멀티 쓰레드(Vector), 모든 메소드가 동기화 처리됨 
//		    - LinkedHashMap<K,V) : Key(LinkedHashSet) : 넣은 순서대로 출력됨 
//		    - TreeMap<K,V)       : Key(TreeSet)  : Key가 정렬되어서 들어감. <오름차순 정렬> 

		// 1. Map 선언
		Map<Integer, String> tMap1 = new TreeMap();

		// 2. put(K,V) : Map에 값을 추가할때 사용
		tMap1.put(2, "나다라"); // Key : 2 , Value : "나다라"
		tMap1.put(1, "가나다");
		tMap1.put(3, "다라마");
//		tMap1.put(3, "가가가"); 

		System.out.println(tMap1);

		// 3. putAll(다른 맵객체) : 주의 : Key , Value 타입이 같아야 한다.
		Map<Integer, String> tMap2 = new TreeMap();
		tMap2.put(10, "홍길동");

		tMap2.putAll(tMap1);

		System.out.println(tMap2);

		// 4. replace (K key, V value) : key의 값을 value로 수정
		tMap2.replace(1, "가가가");
		tMap2.replace(4, "라라라"); // Key : 4는 존재하지 않음. (예외가 발생되지 않음)

		System.out.println(tMap2);

		// 5. replace (K key, V oldValue, V newValue) ; oldValue 의 값을 newValue로 수정
		tMap2.replace(1, "가가가", "나나나");
		tMap2.replace(2, "다다다", "라라라"); // key oldValue 가 정확하게 일치하지 않으면 newValue로 바뀌지 않음.

		System.out.println(tMap2);

		// 6. get (Object key) : key를 넣고, key에 해당하는 값을 가져옴
		System.out.println(tMap2.get(10)); // 홍길동

		// 7. containsKey (Object key) : 해당 키가 존재하면 true, 없으면 false
		System.out.println(tMap2.containsKey(2)); // true
		System.out.println(tMap2.containsKey(4)); // false

		// 8. containsValue(Object value) : 해당 값이 존재하면 true, 없으면 false
		System.out.println(tMap2.containsValue("홍길동")); // true
		System.out.println(tMap2.containsValue("따따따")); // false

		// 9. Set<K> ketSet() : 키만 추출
		Set<Integer> keyset = tMap2.keySet();
		System.out.println(keyset);

		// 10. Set<Map.Entry<K,V> entrySet() : Key의 Value ===> entry 를 추출
		Set<Map.Entry<Integer, String>> entrySet = tMap2.entrySet();

		System.out.println(entrySet);

		// 11. size() : 총갯수
		System.out.println(tMap2.size()); // 4개

		// 12. remove(Object key) : 키로 값을 삭제
		tMap2.remove(1);
		tMap2.remove(4); // 방번호가 없어도 오류 발생되지 않음.
		System.out.println(tMap2);

		// 13. remove (object key , Object value) : key와 value가 정확히 일치해야만 삭제됨
		tMap2.remove(2, "나다라"); // 삭제완료
		tMap2.remove(3, "가가가"); // 삭제 불능

		System.out.println(tMap2);

		// 14. clear() : 전체 삭제
		tMap2.clear();
		System.out.println(tMap2);
	}
}
