package chapter07.ex03;

class Product {

	// 생성자 오버로딩 필드의 갯수에 따라서 생성자 생성 : 5개 생성자 (기본생성자)
	// 객체 자체를 출력시 그 객체의 필드의 내용을 출력

	// 기본 생성자
	public Product() {
	}

	// 생성자 1개
	public Product(String proName) {
		this.proName = proName;
	}

	// 생성자 2개
	public Product(String proName, int proNo) {
		this.proName = proName;
		this.proNo = proNo;
	}

	// 생성자 3개
	public Product(String proName, int proNo, int proPrice) {
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
	}

	// 생성자 4개
	public Product(String proName, int proNo, int proPrice, int proCount) {
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
		this.proCount = proCount;
	}

	// 필드
	String proName; // 제품이름
	int proNo; // 제품번호
	int proPrice; // 제품가격
	int proCount; // 제품수량

	// 객체를 출력시 객체의 필드의 값을 출력
	@Override
	public String toString() {
		return "Product [proName=" + proName + ", proNo=" + proNo + ", proPrice=" + proPrice + ", proCount=" + proCount
				+ "]";
	}

}

public class Ex01 {
	public static void main(String[] args) {

		// 객체생성 및 값 할당
		Product p1 = new Product();
		Product p2 = new Product("오토바이");
		Product p3 = new Product("오토바이",250);
		Product p4 = new Product("오토바이",250,600);
		Product p5 = new Product("오토바이",250,600,10000);
		
		// 객체 출력
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
	}
}
