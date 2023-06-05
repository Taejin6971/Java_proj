package chapter17.ex04;

import java.util.Set;
import java.util.TreeSet;

class MyClass { // 일반 클래스 : TreeSet에 넣을 경우 정렬되어 저장되지 않습니다.
	int data1; //
	int data2;

	// 생성자로부터 필드의 값할당
	MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return data1 + " ";
	}
}

// MyClass2는 TreeSet 에 저장할때 특정 필드가 정렬해서 저장되도록 함. 
class MyClass2 implements Comparable<MyClass2> {

	int data1; // <=== 정렬
	int data2;

	// 생성자로부터 필드의 값할당
	MyClass2(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public int compareTo(MyClass2 o) {
		// 오름차순 정렬해서 저장
		if (this.data1 < o.data1) {
			return -1;
		} else if (this.data1 == o.data1) {
			return 0;
		} else {
			return 1;
		}

		// 내림차순 정렬해서 저장
//		if (this.data1 < o.data1) {
//			return 1;
//		} else if (this.data1 == o.data1) {
//			return 0;
//		} else {
//			return -1; 
//		}
	}

	@Override
	public String toString() {
		return data1 + " ";
	}
}

class MyClass3 implements Comparable<MyClass3> {
	String data1; // <== 정렬해서 TreeSet에 저장하도록 설정
	String data2;

	// 생성자를 사용해서 필드의 값 입력
	MyClass3(String data1, String data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public int compareTo(MyClass3 o) {
		// 방법1
//		return (this.data1.compareTo(o.data1)); // 오름차순 정렬

		// 방법2 : 오름차순 정렬
//		if (this.data1.charAt(0) < o.data1.charAt(0)) {
//			return -1;
//		} else if (this.data1.charAt(0) == o.data1.charAt(0)) {
//			return 0;
//		} else {
//			return 1;
//		}

		// 방법3 : 내림 차순 정렬
		if (this.data1.charAt(0) < o.data1.charAt(0)) {
			return 1;
		} else if (this.data1.charAt(0) == o.data1.charAt(0)) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return data1 + " ";
	}
}

public class Set_TreeSet_Class {
	public static void main(String[] args) {

//		 TreeSet <E> : 
//			1. Set<E> 을 인터페이스를 구현한 클래스 , 
//			2. 중복된 값을 넎을수 없다, 
//			3. 방번호가 없다. 
//			4. 값이 정렬되어서 들어간다(오름차순 정렬), 
//			5. 검색/정렬 기능의 메소드가 추가적으로 들어있다. 
//			- Wrapper Class 는 자동으로 정렬해서 들어 가도록 설계가 되어 있다. String

//			- 일반 클래스를 TreeSet에 저장할때 특정 컬럼을 정렬해서 저장 되도록 하기 위해서는 
//			- Comparable<E> 인터페이스를 구현해서 compareTo() 메소드를 오버라이딩해서 특정컬럼이 정렬되어 들어가도록 설계해야한다.

		// Wrapper 클래스를 TreeSet에 저장하면 자동으로 오름차순 정렬되어 들어감. :
		Set<String> set1 = new TreeSet();
		set1.add("하");
		set1.add("카");
		set1.add("다");
		set1.add("아");

		System.out.println(set1);

		Set<Integer> set2 = new TreeSet();
		set2.add(50);
		set2.add(50);
		set2.add(30);
		set2.add(40);
		set2.add(50);
		System.out.println(set2);

//		특정 객체를 TreeSet에 넣으면 정렬되어 저장 되지 않습니다.
//		- Comparable<E> 인터 pareTo() 메소드를 오버라이딩해서 특정컬럼이 정렬
//		- 중복되지 않도록 할려면 : Object 클래스의 equals(), hashCode() 를 재정의

		System.out.println("=====================");
		// 1. MyClass 객체를 TreeSet에 저장 <== 일반 클래스 : 정렬되어 들어가지 않는다.
		Set<MyClass> mySet = new TreeSet();

//		mySet.add(new MyClass(1, 1));
//		mySet.add(new MyClass(5, 5));
//		mySet.add(new MyClass(3, 3));

		System.out.println(mySet);

		// 2. MyClass2 객체를 TreeSet에 저장 <== Comparable 인터페이스의 comparTo() 메소드를 재정의 함:
		// data1 : dat1 필드를 정렬

		Set<MyClass2> mySet2 = new TreeSet();
		mySet2.add(new MyClass2(1, 1));
		mySet2.add(new MyClass2(5, 5));
		mySet2.add(new MyClass2(3, 3));
		mySet2.add(new MyClass2(5, 5));
		mySet2.add(new MyClass2(5, 5));
		mySet2.add(new MyClass2(4, 4));
		mySet2.add(new MyClass2(4, 4));

		System.out.println(mySet2);

		System.out.println("============================================");
		Set<MyClass3> mySet3 = new TreeSet();

		mySet3.add(new MyClass3("다", "다"));
		mySet3.add(new MyClass3("가", "가"));
		mySet3.add(new MyClass3("파", "파"));
		mySet3.add(new MyClass3("사", "사"));
		mySet3.add(new MyClass3("파", "파"));

		System.out.println(mySet3);
	}
}
