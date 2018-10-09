package chap06.oop.adv;

abstract public class Laptop {
	
	public void keyboard(){
		System.out.println("Laptop.keyboard()");
	}
	
	abstract public void mainboard(String param1);
	
	abstract public void chipset();
}