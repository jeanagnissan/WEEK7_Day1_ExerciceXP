package Exercice3;

public class Vehicule {

	protected String model;
	protected Integer speed;

	public Vehicule() {
		super();
	}

	public Vehicule(String model, Integer speed) {
		super();
		this.model = model;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public static void main(String[] args) {
	}

}
