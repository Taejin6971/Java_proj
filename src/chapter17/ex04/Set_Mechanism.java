package chapter17.ex04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// hashCode(), equals()를 재정의 하지 않은 클래스
class A { // data 필드에 들어오는 값으로 각 객체를 식별하기 위해서는 hashCode(), equals() 재정의 되어 있어야 한다.
	int data;

	A(int data1) {
		this.data = data1;
	}

	@Override
	public String toString() {
		return data + "";
	}
}

//hashCode(), equals() 메소드 재정의 : data 필드 값이 동일할때 hashCode가 동일
class B {
	int data;

	B(int data) {
		this.data = data;
	}

	// 1. equals() 재정의 : set의 중복된 값을 넣지 않도록 식별자 생성, Object의 equals()는 stack의 주소 비교
	// data 필드의 Heap의 값을 비교하도록 재정의
	@Override
	public boolean equals(Object obj) { // b1.equals(b2)
		if (obj instanceof B) { // 다운캐스팅하기 전에 해당타입이 존재하는지 확인후 처리
			if (this.data == ((B) obj).data) { // Heap에 저장된 data 필드의 값을 비교
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	// hashCode() 재정의 : data필드의 값으로 hashCode를 생성하도록 재정의
	// data 필드의 값이 동일하면 동일한 hashCode()가 생성됨
	@Override
	public int hashCode() {
		return Objects.hash(data); // data 필드의 갑으로 hashCode를 생성함. 16진수
	}

	// 객체를 출력시 data 필드의 값을 출력
	@Override
	public String toString() {
		return data + "";
	}
}

public class Set_Mechanism {
	public static void main(String[] args) {

//		Set<E> : 1. 방번호[index]가 존재하지 않는다. 2. 중복된 값을 넣을수 없다.
//			- Set에 중복된 값을 넣지 못하도록 하기 위해서는 Object의 2개의 메소드가 재정의 되어있어야 한다.
//				- 객체의 특정필드에 hashCode(), equals() 재정의 되어 있어야 한다.
//			- Wrapper Class : Boolean, Byte, Short, Integer, Long, Float, Double, Char, String
//			- 자신이 생성한 특정한 클래스(Type)를 Set에 넣을 경우 : Object의 hashCobe(), equals() 를 재정의 해야한다.

		// 1. Set에 Wrapper class : Integer를 사용한 경우 중복된 값이 저장되지 않는다.
		Set<Integer> hSet1 = new HashSet<>();
		hSet1.add(22);
		hSet1.add(33);
		hSet1.add(22);
		hSet1.add(33);
		hSet1.add(33);
		System.out.println(hSet1);
		System.out.println(hSet1.size());

		// 2. Set에 Wrapper class가 아닌 일반 클래스를 사용한 경우 (hashCode(), equals() 재정의 X)
		Set<A> hSet2 = new HashSet<>();
		hSet2.add(new A(22));
		hSet2.add(new A(22));
		hSet2.add(new A(22));
		System.out.println(hSet2);
		System.out.println(hSet2.size());

		// 3. Set에 B : data 필드의 대해서 hashCode(), equals() 재정의 함
		Set<B> hSet3 = new HashSet<>();
		hSet3.add(new B(33));
		hSet3.add(new B(33));
		hSet3.add(new B(33));
		System.out.println(hSet3);
		System.out.println(hSet3.size());
	}
}
