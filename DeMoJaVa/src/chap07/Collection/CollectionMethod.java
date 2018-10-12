package chap07.Collection;

import java.util.*;

public class CollectionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator();
	}
	
	public static void sortObj() {
		ArrayList listObj = new ArrayList();
		
		listObj.add(4);
		listObj.add(9);
		listObj.add(2);
		listObj.add(7);
		listObj.add(1);
		listObj.add(8);
		listObj.add(4);
		listObj.add(5);
		
		Iterator itr = listObj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(listObj);
		
		System.out.println("=========================");
		Iterator itr2 = listObj.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
	
	public static void compareTo() {
		
		Course courseJava = new Course("JAVA", 50);
		Course coursePHP = new Course("PHP", 20);
		Course courseAndroid = new Course("Android", 30);
		
		ArrayList arrCourse = new ArrayList();
		
		arrCourse.add(courseJava);
		arrCourse.add(courseAndroid);
		arrCourse.add(coursePHP);
		
		Iterator itr = arrCourse.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		Collections.sort(arrCourse);
		System.out.println("=========================");
		Iterator itr2 = arrCourse.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
			
		}
	}
	
	public static void Comparator() {
		
		//Course courseJava = new Course("JAVA", 50);
		//Course coursePHP = new Course("PHP", 20);
		//Course courseAndroid = new Course("Android", 30);
		
		ArrayList arrCourse = new ArrayList();
		
		arrCourse.add(new Course("JAVA", 50));
		arrCourse.add(new Course("PHP", 20));
		arrCourse.add(new Course("Android", 30));
		
		Iterator itr = arrCourse.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		Collections.sort(arrCourse, new TimeComparator());
		System.out.println("=========================");
		Iterator itr2 = arrCourse.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		Collections.sort(arrCourse, new NameComparator());
		System.out.println("=========================");
		Iterator itr3 = arrCourse.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
	}

}
