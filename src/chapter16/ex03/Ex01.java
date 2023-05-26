package chapter16.ex03;

class Tiger {
	String name = "호랑이";
}

class Lion {
	String name = "사자";
}

class Eagle {
	String name = "독수리";
}

class Animal<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Ex01 {
	public static void main(String[] args) {

		// Animal Generic 클래스의 Tiger, Lion, Eagle 클래스를 Setter 주입, Getter로 가져와 필드내용 출력
		Animal<Tiger> t1 = new Animal<>();
		t1.setT(new Tiger());
		System.out.println(t1.getT().name);

		Animal<Lion> l1 = new Animal<>();
		l1.setT(new Lion());
		System.out.println(l1.getT().name);

		Animal<Eagle> e1 = new Animal<>();
		e1.setT(new Eagle());
		System.out.println(e1.getT().name);

	}
}
