package Exercice4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------retour de la class fille smartPhone----------");

		SmartPhone smartPhone = new SmartPhone("Android", 160, 8, "c xp-3");
		smartPhone.displaySpecs();
		System.out.println("-----------------------------------------------");
		smartPhone.makeCall("097383783383");;

		
		System.out.println("----------retour de la class fille Laptop---------");
		
		Laptop laptop = new Laptop("Windows", 800, 23,32.44);
		laptop.displaySpecs();
		System.out.println("-----------------------------------------------");
		laptop.useTouchscreen();;


	}

}
