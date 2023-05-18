package chapter08.ex03;

public class Car { // public : 외부 패키지에서 접근 가능

	private String company;
	private String carName;
	private int carMaxSpeed;
	private double carWeight;

	// getter, setter를 생성해서 각 필드의 값을 넣고(setter) 출력(getter)
	public String getCompany() {
		return company;
	}

	public String getCarName() {
		return carName;
	}

	public int getCarMaxSpeed() {
		return carMaxSpeed;
	}

	public double getCarWeight() {
		return carWeight;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setCarMaxSpeed(int carMaxSpeed) {
		this.carMaxSpeed = carMaxSpeed;
	}

	public void setCarWeight(double carWeight) {
		this.carWeight = carWeight;
	}

	public static void main(String[] args) {
		// Car 객체를 생성후 각 메소드 setter를 호출해서 값을 넣고
		// getter를 사용해서 출력

		Car c1 = new Car();

		c1.setCompany("쌍용");
		c1.setCarName("티볼리");
		c1.setCarMaxSpeed(240);
		c1.setCarWeight(1.7);

		System.out.println(c1.getCompany());
		System.out.println(c1.getCarName());
		System.out.println(c1.getCarMaxSpeed() + " km/h");
		System.out.println(c1.getCarWeight() + " 톤");

	}
}
