package chap06.oop.adv;

public class Superman extends Laptop implements People,Bird {

	@Override
	public void eat() {
		System.out.println("Superman.eat()");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Superman.sleep()");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Superman.fly()");
	}

	@Override
	public void mainboard(String param1) {
		// TODO Auto-generated method stub
		System.out.println("Superman.mainboard()");
	}

	@Override
	public void chipset() {
		// TODO Auto-generated method stub
		System.out.println("Superman.chipset()");
	}

}
