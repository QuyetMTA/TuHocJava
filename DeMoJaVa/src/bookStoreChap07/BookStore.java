package bookStoreChap07;

import java.util.*;

import chap07.Collection.NameComparator;

public class BookStore implements StoreInterface{
	private final int MAX_ITEMS = 10; //Số sách mà kho sách chứa được , , final chỉ 1 hằng số
	private List listItems = null; // mảng kiểu book
	
	// Khởi tạo listItems là 1 mảng có MAX_ITEMS quyển sách
	public  BookStore() {
		listItems = new LinkedList();
	}
	
	// Trả về i nếu tìm thấy sách có id là bookID
	public int getItemPosition(String bookID) {
		/*for(int i=0; i< getTotalItems(); i++) {
			Book bookObj  = (Book) listItems.get(i); // ép kiểu
			if(bookID.equals(bookObj.getID())) return i;
		}*/
		
		Iterator itr = listItems.iterator();
		int i =0;
		while (itr.hasNext()) {
			Book bookObj = (Book) itr.next();
			if(bookID.equals(bookObj.getID())) return i; 
			i++;
		}
		return -1;
	}
	
	public boolean checkFull() {
		if(getTotalItems() == MAX_ITEMS) return true;
		return false;
	}
	
	public boolean checkEmpty() {
		return listItems.isEmpty();
	}
	
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		Book bookObj = (Book)obj;
		if(this.checkFull()) {
			System.out.println("KHO SÁCH ĐÃ ĐẦY!");
		}
		else {
			listItems.add(bookObj);
			System.out.println("add successfull!");
		}
	}

	public void edit(String bookID, String bookName, double bookPrice) {
		int bookPosition = this.getItemPosition(bookID);
		if(bookPosition == -1) {
			System.out.println("SÁCH KHÔNG TỒN TẠI!");
		}
		else {
			Book bookObj = (Book) listItems.get(bookPosition);
			bookObj.setName(bookName);
			bookObj.setPrice(bookPrice);
			System.out.println("EDIT SUCCESSFULL!");
		}
	}
	
	public void delete(String bookID) {
		int bookPosition = this.getItemPosition(bookID);
		if(bookPosition == -1) {
			System.out.println("SÁCH KHÔNG TỒN TẠI!");
		}
		else {
			listItems.remove(bookPosition);
			System.out.println("DELETE SUCCESSFULL!");
		}
	}
	
	public void find(String bookID) {
		int bookPosition = this.getItemPosition(bookID);
		if(bookPosition == -1) {
			System.out.println("KHÔNG TÌM THẤY!");
		}
		else {
			System.out.println(listItems.get(bookPosition));
		}
	}
	
	public void list() {
		if(this.checkEmpty()) System.out.println("LIST Book rỗng!");
		else {
			/*for(int i =0 ; i<getTotalItems(); i++) {
				System.out.println(listItems.get(i));
			}*/
			Iterator itr = listItems.iterator();
			while (itr.hasNext()) {
				Book bookObj = (Book) itr.next();
				System.out.println(bookObj);
			}
		}
	}

	public int getTotalItems() {
		return listItems.size();
	}
	
	public void sortNameAZ() {
		//System.out.println("BookStore.sortNameAZ()");
		Collections.sort(listItems, new NameAZComparator());
	}

	public void sortNameZA() {
		Collections.sort(listItems, new NameZAComparator());
	}
	
	public void sortPriceUp() {
		Collections.sort(listItems, new PriceUpComparator());
	}
	
	public void sortNameLow() {
		Collections.sort(listItems, new PriceUpComparator());
		Collections.reverse(listItems);
	}
}
