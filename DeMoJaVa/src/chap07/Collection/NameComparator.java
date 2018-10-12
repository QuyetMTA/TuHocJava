package chap07.Collection;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Course courseObj1 = (Course)o1;
		Course courseObj2 = (Course)o2;
		
		return courseObj1.getName().compareTo(courseObj2.getName());
	}
	
}
