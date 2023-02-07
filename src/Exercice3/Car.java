package Exercice3;

public class Car extends Vehicule {

	private String name;

	public Car() {
		super();
	}

	public Car(String model, int speed, String name) {
		super(model, speed);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Car car =  new Car("Tesla", 233, "");
		car.getDetails("Roadster");
		car.setDetails("Toyota", 333, "4x4");
		car.getDetails("Roadster");

	}
	
	public void setDetails(String model, int speed, String name) {
		this.model = model;
		this.speed = speed;
		this.name = name;
	}

	public void getDetails(String carName) {
		this.name = carName;
		System.out.println(this.name + " : " + this.model + " " + this.speed );
	}
}
