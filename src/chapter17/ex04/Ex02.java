package chapter17.ex04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
	int stuID; // 식별자
	String stuName;
	String stuPhone;

	public Student(int stuID, String stuName, String stuPhone) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuPhone = stuPhone;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			if (this.stuID == ((Student) obj).stuID) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(stuID);
	}

}

public class Ex02 {
	public static void main(String[] args) {

		Set<Student> hSet = new HashSet();

		// 학생 객체 5개 생성해서 Set에 넣을 경우 stuID필드의 중복된 값을 넣지 못하도록 설정
		// stuID필드의 equals(), hashCode() 재정의
		hSet.add(new Student(123, "홍길동", "아이폰"));
		hSet.add(new Student(456, "홍길순", "갤럭시"));
		hSet.add(new Student(789, "강감찬", "큐리텔"));
		hSet.add(new Student(147, "이순신", "LG"));
		hSet.add(new Student(258, "김을동", "SKY"));
		System.out.println(hSet.size());
	}
}
