package chap07.Collection;

public class Course implements Comparable {
	private String name;
	private int time;
	
	public Course(String ten, int TG ) {
		this.setName(ten);
		this.setTime(TG);
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
		return this.getName() + " - " + this.getTime();
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Course courseObj = (Course)o;
		if (this.getTime() > courseObj.getTime()) return 1; // return -1
		if (this.getTime() < courseObj.getTime()) return -1; // retunr 1 => sap xep giam dan
		return 0;
	}
	
	
}
