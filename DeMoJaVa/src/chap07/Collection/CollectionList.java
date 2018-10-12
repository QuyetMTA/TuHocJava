package chap07.Collection;

import java.util.*;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeSet();
	}
	
	public static void arrayList() {
		List ListObj = new ArrayList();
		Course courseObj = new Course("JAVA", 500);
		
		//add
		ListObj.add(89);
		ListObj.add(true);
		ListObj.add(45.4);
		ListObj.add(89);
		ListObj.add("Đặng Văn Quyết");
		ListObj.add(courseObj);
		
		//size
		System.out.println("độ lớn của arrayList: "+ ListObj.size());
		
		//get
		System.out.println("Lấy phần tử ở vị trí i :" + ListObj.get(5));
		
		System.out.println(ListObj.get(3));
		//set
		ListObj.set(3, "allaalla");
		System.out.println(ListObj.get(3));
		
		//in ra các phần tử trong list
		//c2.
		//for (Object elm : ListObj) {
		//	System.out.println(elm);
		//}
		
		System.out.println("============================");
		//c3.
		Iterator itr = ListObj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public static void linkList() {
		List ListObj = new LinkedList();
		Course courseObj = new Course("JAVA", 500);
		
		//add
		ListObj.add(89);
		ListObj.add(true);
		ListObj.add(45.4);
		ListObj.add(89);
		ListObj.add("Đặng Văn Quyết");
		ListObj.add(courseObj);
		
		//size
		System.out.println("độ lớn của arrayList: "+ ListObj.size());
		
		//get
		System.out.println("Lấy phần tử ở vị trí i :" + ListObj.get(5));
		
		System.out.println(ListObj.get(3));
		//set
		ListObj.set(3, "allaalla");
		System.out.println(ListObj.get(3));
		
		//in ra các phần tử trong list
		//c2.
		//for (Object elm : ListObj) {
		//	System.out.println(elm);
		//}
		
		System.out.println("============================");
		//c3.
		Iterator itr = ListObj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public static void hashSet() { 		//các phần tử không theo thứ tự
		Set setObj = new HashSet();
		Course courseObj = new Course("JAVA", 500);
		
		//add
		setObj.add(89);
		setObj.add(true);
		setObj.add(45.4);
		setObj.add(89);
		setObj.add("Đặng Văn Quyết");
		setObj.add(courseObj);
		
		//size
		System.out.println("độ lớn của arrayList: "+ setObj.size());
		
		//in ra các phần tử trong list
		//c2.
		//for (Object elm : ListObj) {
		//	System.out.println(elm);
		//}
		
		System.out.println("============================");
		//c3.
		Iterator itr = setObj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	public static void LinkedHashSet() { // in ra các phần tử theo thứ tự
		Set setObj = new LinkedHashSet();
		Course courseObj = new Course("JAVA", 500);
		
		//add
		setObj.add(89);
		setObj.add(true);
		setObj.add(45.4);
		setObj.add(89);
		setObj.add("Đặng Văn Quyết");
		setObj.add(courseObj);
		
		//size
		System.out.println("độ lớn của arrayList: "+ setObj.size());
		
		//in ra các phần tử trong list
		//c2.
		//for (Object elm : ListObj) {
		//	System.out.println(elm);
		//}
		
		System.out.println("============================");
		//c3.
		Iterator itr = setObj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public static void treeSet() { // in ra các phần tử sắp xếp tăng dần = > phải cùng 1 kiểu
		Set setObj = new TreeSet();
		
		//add
		setObj.add(89.6);
		setObj.add(24.3);
		setObj.add(19.1);
		setObj.add(89.9);
		setObj.add(66.2);
		setObj.add(11.5);
		
		//size
		System.out.println("độ lớn của arrayList: "+ setObj.size());
		
		//in ra các phần tử trong list
		//c2.
		//for (Object elm : ListObj) {
		//	System.out.println(elm);
		//}
		
		System.out.println("============================");
		//c3.
		Iterator itr = setObj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
