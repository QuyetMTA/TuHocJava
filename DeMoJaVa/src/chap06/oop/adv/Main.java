package chap06.oop.adv;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		std03();
	}
	
	public static void std01() {
		//1. Interface
		//People peopleObj = new Superman();
		Superman peopleObj = new Superman(); // phải khai báo đối tượng superman mới truy cập được method fly()
		peopleObj.eat();
		peopleObj.sleep();
		peopleObj.defaultAbstract();
		People.staticAbstract(); // với từ khóa static không thể sử dụng đối tượng PeopelObj được.
		peopleObj.fly();
		peopleObj.mainboard("AL");
		peopleObj.chipset();
		
		System.out.println("---------------------------");
		//2. Abstract class
		Laptop LaptopObj = new LaptopHP();
		LaptopObj.keyboard();
		LaptopObj.chipset();
		LaptopObj.mainboard("QQQ");
	}
	
	public static void std02() {
		Course CourseJava = new Course("JAVA", 50);
		Course CoursePHP = new Course("PHP", 50);
		
		System.out.println(CourseJava);// có phương thức nên sẽ in ra trực tiếp như thế này
		System.out.println(CoursePHP);
		
		if(CourseJava.equals(CoursePHP)) {
			System.out.println("BẰNG NHAU");
		}
		else {
			System.out.println("Không bằng nhau!");
		}
		
		//CourseJava.showInfo();
		//CoursePHP.showInfo();
	}

	public static void std03() {
		PlayStation playObj = new PlayStation();
		Fifa fifaObj = new Fifa();
		Mario marioObj = new Mario();
		playObj.play(fifaObj);
		playObj.play(marioObj);
	}
}
