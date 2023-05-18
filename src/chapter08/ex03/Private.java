package chapter08.ex03;

class Student { // default : 외부 패키지에서 접근 불가함.

	// 외부에서 접근 불가한 필드, 외부 클래스에서 필드의 직접 값을 접근 할 수 없도록 설정
	private String stuName; // <==
	private String stuAddr;
	private int stuAge;
	private double stuWeight;

	// getter, setter 를 사용 : 접근 지정자를 public
	// private 필드에 값을 넣을때 (setter) 사용
	// private 필드에 값을 불러올때 (getter) 사용

	// stuName 필드에 대한 getter : 필드의 값을 리턴
	public String getStuName() {
		return stuName;
	}

	// stuName 필드에 대한 setter : 필드의 값을 외부에서 주입
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAddr() {
		return stuAddr;
	}
	
	public void setStuAddr(String stuAddr) {
		this.stuAddr = stuAddr;
	}
	
	public int getStuAge() {
		return stuAge;
	}
	
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
	public double getStuWeight() {
		return stuWeight;
	}
	
	public void setStuWeight(double stuWeight) {
		this.stuWeight = stuWeight;
	}
	
}

public class Private {
	public static void main(String[] args) {

		Student s1 = new Student();

		// private 필드에 직접 접근 불가 : 외부 클래스에서 < getter/setter를 사용해 값을 출력/입력
//		s1.stuName = "홍길동";			// private
//		System.out.println(s1.stuName);	// private

		// getter 를 사용해서 필드의 내용을 출력
		System.out.println(s1.getStuName()); // null
		
		// setter 를 사용해서 필드의 값을 입력
		s1.setStuName("홍길동");
		s1.setStuAddr("서울");
		s1.setStuAge(25);
		s1.setStuWeight(75.5);
		
		// getter 를 사용해서 필드의 내용을 출력
		System.out.println(s1.getStuName());
		System.out.println(s1.getStuAddr());
		System.out.println(s1.getStuAge());
		System.out.println(s1.getStuWeight());
		
	}
}
