package Exercice4;

public class Laptop extends Computer {
	
    private double screenSize;

    public Laptop(String operatingSystem, int storage, int memory, double screenSize) {
        super(operatingSystem, storage, memory);
        this.screenSize = screenSize;
    }

    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Screen Size: " + screenSize + " inches");
    }

    public void useTouchscreen() {
        System.out.println("Using touch screen with size " + screenSize + " inches");
    }
}
