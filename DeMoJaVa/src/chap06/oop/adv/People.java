package chap06.oop.adv;

public interface People {
	public void eat();
	public void sleep();
	public default void defaultAbstract() {
		System.out.println("People.defaultAbstract()");
	}
	public static void staticAbstract() {
		System.out.println("People.staticAbstract()");
	}
	
}
