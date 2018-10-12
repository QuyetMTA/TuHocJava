package bookStoreChap07;

import java.util.Comparator;

public class NameAZComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Book bookObj1 = (Book)o1;
		Book bookObj2 = (Book)o2;
		
		return bookObj1.getName().compareToIgnoreCase(bookObj2.getName()); // Bỏ qua chữ hoa chữ thường, coi như 1
	}
	
}
