package chapter17.ex05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Summary {

	public static void main(String[] args) {

//		Map <K,V>  : K : Key    : 중복되면 안됨 , Set 관리됨    <=== 방번호 (List) 
//	                 V : Value  : 중복된 값을 넣을 수 있음. 
//	                 
//			- HashMap <K,V> 	:  Key(HashSet)  임의로 출력됨, 싱글 쓰레드(ArrayList), 
//	        - HashTable <K,V>   :  Key(HashSet)  임의로 출력됨, 멀티 쓰레드(Vector), 모든 메소드가 동기화 처리됨 
//	        - LinkedHashMap<K,V) : Key(LinkedHashSet) : 넣은 순서대로 출력됨 
//	        - TreeMap<K,V)       : Key(TreeSet)  : Key가 정렬되어서 들어감. <오름차순 정렬> 

		// 1. HashMap : 입력순서와 출력 순서가 다르다. , 싱글 쓰레드 환경 <=== ArrayList
		Map<String, Integer> hMap = new HashMap();
		hMap.put("다", 30);
		hMap.put("마", 40);
		hMap.put("나", 50);
		hMap.put("가", 60);
		hMap.put("가", 70);
		System.out.println(hMap);

		// 2. HashTable : 입력 순서와 출력 순서가 다르다. 모든 메소드가 동기화 , 멀티쓰레드 환경 <== Vectory
		Map<String, Integer> tMap = new Hashtable();
		tMap.put("다", 30);
		tMap.put("마", 40);
		tMap.put("나", 50);
		tMap.put("가", 60);
		tMap.put("가", 70);
		System.out.println(tMap);

		// 3. LinkedHashMap : 입력된 순서로 출력됨
		Map<String, Integer> lMap = new LinkedHashMap();
		lMap.put("다", 30);
		lMap.put("마", 40);
		lMap.put("나", 50);
		lMap.put("가", 60);
		lMap.put("가", 70);
		System.out.println(lMap);

		// 4. TreeMap : Key 정렬되어서 입력됨 , 오름차순 정렬
		Map<String, Integer> treeMap = new TreeMap();
		treeMap.put("다", 30);
		treeMap.put("마", 40);
		treeMap.put("나", 50);
		treeMap.put("가", 60);
		treeMap.put("가", 70);
		System.out.println(treeMap);
	}
}
