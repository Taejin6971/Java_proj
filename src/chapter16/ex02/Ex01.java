package chapter16.ex02;

class Tiger {
	String name = "호랑이";
}

class Lion {
	String name = "사자";
}

class Eagle {
	String name = "독수리";
}

class Animal {

	private Object obj = null;

	// getter : 객체 정보 출력
	public Object getObj() {
		return obj;
	}

	// setter : obj 필드 값 할당
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class Ex01 {
	public static void main(String[] args) {

		// Animal 클래스에 Tiger, Lion, Eagle 객체를 setter 주입, ==> Object 타입
		// getter 사용해서 가져와 name 필드 출력 ==> 다운캐스팅

		Animal a1 = new Animal();

		a1.setObj(new Tiger());
		System.out.println(((Tiger) a1.getObj()).name);

		a1.setObj(new Lion());
		System.out.println(((Lion) a1.getObj()).name);

		a1.setObj(new Eagle());
		System.out.println(((Eagle) a1.getObj()).name);

	}
}
