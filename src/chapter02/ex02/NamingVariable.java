package chapter02.ex02;

public class NamingVariable {

	//변수 이름 지정 규칙 (변수명)
		//소문자로 시작
		//한글을 변수명으로 사용할 수 있다. (권장사항이 아니다)
		//특수문자는 2개만 사용가능하다. (_,$)
		//변수명에 숫자를 사용할 수 있으나, 첫 자에 숫자가 오면 오류 발생
		//자바에서 사용하는 예약어는 변수명으로 사용할 수 없다. (package,public,class,int,...)
	
	boolean aBcD;
	byte 가나다라;
//	byte 3bbb;		변수명 첫자에는 숫자가 오면 오류 발생
	boolean _abcd;	// _특수문자 사용사능
	int $cde;		// $ 사용가능
	int ABCDE;		//대문자로 변수명 사용가능 (권장사항은 아니다.), 변수 : 소문자로시작, 상수 : 대문자
	int mywork;		//변수명은 처음단어는 소문자 두번쨰 단어는 첫자가 대문자
	
}
