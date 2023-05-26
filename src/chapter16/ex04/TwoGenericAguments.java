package chapter16.ex04;

import java.awt.RenderingHints.Key;

class KeyValue<K, V> {

//	A ~ Z 중 임의의 타입을 지정
//	T : Type
//	K : Key
//	V : Value
//	N : Number

	private K key;
	private V value;

	// getter/setter
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

public class TwoGenericAguments {
	public static void main(String[] args) {

		// 1. String, Integer를 아규먼트로 하는 객체 생성
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		// setter 주입
		kv1.setKey("사과");
		kv1.setValue(1000);
		// getter를 사용해 필드의 값 출력
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());

		KeyValue<String, Integer> kv2 = new KeyValue<>();
		kv2.setKey("오렌지");
		kv2.setValue(2000);
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());

		// 2. Integer, String을 아규먼트로 객체 생성
		KeyValue<Integer, String> kv3 = new KeyValue<>();
		kv3.setKey(404);
		kv3.setValue("해당 요청은 페이지를 찾을 수 없습니다.");
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());

		// 3. 아규먼트에 void를 사용하면 해당 아규먼트는 사용되지 않도록 설정
		// 주의 : void > Void (객체형 : V 대문자로 처리)
		KeyValue<String, Void> kv4 = new KeyValue<>();
		kv4.setKey("키 값만 사용");
		System.out.println(kv4.getKey());
		// Void로 지정된 곳에는 null 만 입력 가능하지만 사용하지 않도록 처리할때 사용
		kv4.setValue(null);
		System.out.println(kv4.getValue());

	}
}
