package bookStoreChap07;

import java.util.Comparator;

public class PriceUpComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Book bookObj1 = (Book)o1;
		Book bookObj2 = (Book)o2;
		
		// sắp xếp tăng dần
		if(bookObj1.getPrice() < bookObj2.getPrice()) return -1;
		if(bookObj1.getPrice() > bookObj2.getPrice()) return 1;
		return 0;
	}
}
