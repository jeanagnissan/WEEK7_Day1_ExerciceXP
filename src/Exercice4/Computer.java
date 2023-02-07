package Exercice4;


public class Computer {
	
    protected String operatingSystem;
    protected int storage;
    protected int memory;

    public Computer(String operatingSystem, int storage, int memory) {
        this.operatingSystem = operatingSystem;
        this.storage = storage;
        this.memory = memory;
    }

    public void displaySpecs() {
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Memory: " + memory + " GB");
    }

    public void installSoftware(String software) {
        System.out.println("Installing " + software + " on " + operatingSystem);
    }
}

