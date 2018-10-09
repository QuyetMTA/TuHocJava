package chap06.oop.adv;

public class Course {
	private String name;
	private int time;
	
	public Course(String name, int time) {
		super();
		this.name = name;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Course Info:\n- Name :\t " + this.getName() + "\n- Time :\t " + this.getTime();
	}
	
	@Override
	public boolean equals(Object Obj) {
		// TODO Auto-generated method stub
		Course CourseObj = (Course) Obj; // ép kiểu Obj thành kiểu Course
		if((this.getTime() == CourseObj.getTime()) && (this.getName() == CourseObj.getName())) return true;
		return false;
	}
	
	public void showInfo() {
		System.out.println("Course Info: ");
		System.out.println("- Name : \t\t " + this.name);
		System.out.println("- Time : \t\t" + this.time);
	}
	
	
}
