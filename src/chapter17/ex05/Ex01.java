package chapter17.ex05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class Student { // Map : Key : 중복되면 안됨 , equals(), hashCode()

	int stuID; // 중복되면 안되도록 처리,
	String stuName;

	Student(int stuID, String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
	}

	@Override
	public String toString() {
		return "" + stuID + "";
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
}

public class Ex01 {
	public static void main(String[] args) {

		// Key : Student , : 6시 : 20분까지 : p.jangwoo@gmail.com
		Map<Student, String> linkMap = new LinkedHashMap();

		linkMap.put(new Student(1111, "홍길동"), "학생 - 홍길동");
		linkMap.put(new Student(2222, "김길동"), "학생 - 김길동");
		linkMap.put(new Student(5555, "이길동"), "학생 - 이길동");
		linkMap.put(new Student(3333, "옥길동"), "학생 - 옥길동");
		linkMap.put(new Student(1111, "중복 길동"), "학생 - 홍길동"); // 중복저장 안됨
		linkMap.put(new Student(1111, "중복 길동"), "학생 - 홍길동"); // 중복저장 안됨

		System.out.println(linkMap);
		// 출력 정보 : {1111=학생 - 홍길동, 2222=학생 - 김길동, 5555=학생 - 이길동, 3333=학생 - 옥길동}
	}
}
