package chapter08.ex04;

public class Member_Test {
	public static void main(String[] args) {

		// 객체생성
		Member m1 = new Member();

		// setter
		m1.setMemberNo(12345L);
		m1.setMemberId("himedia");
		m1.setMemberpass("q1w2e3r4");
		m1.setMemberEmail("aaa@aaa.com");
		m1.setMemberAge(25);

		// getter
		System.out.println(m1.getMemberNo());
		System.out.println(m1.getMemberId());
		System.out.println(m1.getMemberpass());
		System.out.println(m1.getMemberEmail());
		System.out.println(m1.getMemberAge());

		// toString()
		System.out.println(m1);
		System.out.println(m1.toString());
		
	}
}
