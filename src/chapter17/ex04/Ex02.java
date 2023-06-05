package chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Student {
	int stuID; // 식별자 :
	String stuName;
	String stuPhone;

	public Student(int stuID, String stuName, String stuPhone) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuPhone = stuPhone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(stuID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return stuID == other.stuID;
	}

	// 객체 자체를 출력시
	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", stuName=" + stuName + ", stuPhone=" + stuPhone + "]";
	}
}

public class Ex02 {
	public static void main(String[] args) {

		Set<Student> hset = new HashSet();

		// 학생 객체 5개 생성해서 set에 넣을 경우 stuID 필드에 중북된 값을 넣지 못하도록 설정
		// stuID필드의 equals() 재정의 , hashCode() 재정의
		// 완료시간 : 17:00 , p.jangwoo@gmail.com

		Student s1 = new Student(1111, "홍길동", "010-1111-1111");
		Student s2 = new Student(2222, "김길동", "010-1111-1112");
		Student s3 = new Student(3333, "옥길동", "010-1111-1113");
		Student s4 = new Student(1111, "홍길동", "010-1111-1111");
		Student s5 = new Student(1111, "홍길동", "010-1111-1111");

		// Set 에 값을 할당 : hset
		hset.add(s1); // 중복
		hset.add(s2);
		hset.add(s3);
		hset.add(s4); // 중복
		hset.add(s5); // 중복

		System.out.println(hset.size());

		System.out.println("=====Set에 저장된 값을 출격 : Iterator 사용================");
		Iterator<Student> ir = hset.iterator();
		while (ir.hasNext()) {

			Student student = ir.next();

			System.out.println(student);
//			System.out.println((ir.next()).stuID);
		}

		System.out.println("=====Set에 저장된 값을 출격 : Enhanced For 사용================");
		for (Student k : hset) {
			System.out.println(k.stuID);
		}
	}
}