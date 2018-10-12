package chap07.Collection;

import java.util.Comparator;

public class TimeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Course courseObj1 = (Course)o1;
		Course courseObj2 = (Course)o2;
		
		// sắp xếp tăng dần
		if(courseObj1.getTime() < courseObj2.getTime()) return -1;
		if(courseObj1.getTime() > courseObj2.getTime()) return 1;
		return 0;
	}
	
	
}
