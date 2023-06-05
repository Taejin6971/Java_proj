package chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member {
	String memberID; // 식별자. equals(), hashCode()
	String memberName;

	// 생성자를 통해서 필드의 값을 입력
	Member(String memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	// 객체를 출력시 필드의 내용을 출력
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는" + memberID + " 입니다.";
	}

	// set의 중복된 값을 식별 : equals(), hashCode();
	@Override
	public int hashCode() {
		return Objects.hash(memberID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(memberID, other.memberID);
	}
}

class MemberMethod { // 완료시간 : 6:00 까지. p.jangwoo@gmail.com
	// Set을 정의
	Set<Member> memSet;

	// MemberMethod 객체를 생성시 Set을 활성화 시킴.
	MemberMethod() {
		this.memSet = new HashSet();
	}

	// 메소드를 정의 : Member객체를 인풋으로 던지면 set에 저장
	public void addMember(Member member) {
		// 코드
		memSet.add(member);
	}

	// 정수를 받음 : memberID ==> set => Member => memberID : 인풋받은 member ID를 삭제
	public boolean removeMember(String memberID) {
		// 코드
		Iterator ir = memSet.iterator();

		while (ir.hasNext()) {
			Member member = (Member) ir.next();

			if (memberID == member.memberID) {
				memSet.remove(member);
				return true;
			}
		}
		System.out.println("회원님의 아이디는 검색 되지 않았습니다. ");

		return false; // 잘 삭제가 완료된 경우 true , 해당 ID가 존재하지 않는 경우 return false
	}

	// Set에 저장된 Member객체의 필드의 값을 출력
	public void showMember() {
		Iterator ir = memSet.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next()); // ir.next() <== Member
		}
	}

	// Set에 저장된 총 갯수를 출력
	public void showSize() {
		System.out.println("Set에 저장된 총 갯수는 : " + memSet.size());
	}
}

public class Ex03 {
	public static void main(String[] args) {

		// Member 객체 5개 생성후 MemberMethod 객체의 메소드를 사용해서 set에 객체를 저장하고 /삭제/ 출력

		// Member 객체 생성
		Member m1 = new Member("1111", "홍길동");
		Member m2 = new Member("2222", "홍길순");
		Member m3 = new Member("3333", "홍길동");
		Member m4 = new Member("4444", "김길동");
		Member m5 = new Member("1111", "이길동");
		Member m6 = new Member("1111", "박길동");

		// MemberMethod 객체화
		MemberMethod mm = new MemberMethod();
		mm.addMember(m1);
		mm.addMember(m2);
		mm.addMember(m3);
		mm.addMember(m4);
		mm.addMember(m5);
		mm.addMember(m6);

		// set에 저장된 총 갯수
		mm.showSize(); // 4

		System.out.println("==================");
		// set에 저장된 member 객체를 출력
		mm.showMember();

		System.out.println("===============");
		// memberID
		mm.removeMember("2222");
		mm.removeMember("3333");

		mm.showMember(); // 2
	}

}