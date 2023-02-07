package Exercice4;


public class SmartPhone extends Computer {
	
    private String carrier;

    public SmartPhone(String operatingSystem, int storage, int memory, String carrier) {
        super(operatingSystem, storage, memory);
        this.carrier = carrier;
    }

    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Carrier: " + this.carrier);
    }

    public void makeCall(String phoneNumber) {
        System.out.println("Making call to " + phoneNumber + " via " + this.carrier);
    }
}

