package chapter08.ex03;

public class Animal {

	private String animalName;
	private String animalCry;
	private int animalAge;
	private double animalWeight;

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalCry() {
		return animalCry;
	}

	public void setAnimalCry(String animalCry) {
		this.animalCry = animalCry;
	}

	public int getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}

	public double getAnimalWeight() {
		return animalWeight;
	}

	public void setAnimalWeight(double animalWeight) {
		this.animalWeight = animalWeight;
	}

	public static void main(String[] args) {

		Animal a1 = new Animal();

		// setter로 필드의 값 주입
		a1.setAnimalName("호랑이");
		a1.setAnimalCry("어흥");
		a1.setAnimalAge(10);
		a1.setAnimalWeight(85.5);

		// getter로 필드의 값 풀력
		System.out.println(a1.getAnimalName());
		System.out.println(a1.getAnimalCry());
		System.out.println(a1.getAnimalAge());
		System.out.println(a1.getAnimalWeight());
		
	}
}
