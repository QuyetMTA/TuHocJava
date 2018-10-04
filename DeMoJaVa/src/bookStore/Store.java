package bookStore;

import java.util.Arrays;

public class Store {
	private static int totalItems = 0; // Số sách hiện tại trong kho
	private final int MAX_ITEMS = 10; //Số sách mà kho sách chứa được , , final chỉ 1 hằng số
	private Book[] listItems = null; // mảng kiểu book
	
	// Khởi tạo listItems là 1 mảng có MAX_ITEMS quyển sách
	public  Store() {
		listItems = new Book[MAX_ITEMS];
	}
	
	public int getItemPosition(String bookID) {
		for(int i=0; i< totalItems; i++) {
			if(bookID.equals(listItems[i].getID())) return i;
		}
		return -1;
	}
	
	public boolean checkFull() {
		if(totalItems == MAX_ITEMS) return true;
		return false;
	}
	
	public boolean checkEmpty() {
		if(totalItems == 0) return true;
		return false;
	}
	
	public void add(Book bookObj) {
		if(checkFull()) {
			System.out.println("KHO SÁCH ĐÃ ĐẦY!");
		}
		else {
			listItems[totalItems] = bookObj;
			totalItems++;
			System.out.println("add successfull!");
		}
		
	}

	public void edit(String bookID, String bookName, double bookPrice) {
		int bookPosition = this.getItemPosition(bookID);
		if(bookPosition == -1) {
			System.out.println("SÁCH KHÔNG TỒN TẠI!");
		}
		else {
			listItems[bookPosition].setName(bookName);
			listItems[bookPosition].setPrice(bookPrice);
			System.out.println("EDIT SUCCESSFULL!");
		}
	}
	
	public void delete(String bookID) {
		int bookPosition = this.getItemPosition(bookID);
		if(bookPosition == -1) {
			System.out.println("SÁCH KHÔNG TỒN TẠI!");
		}
		else {
			for(int i = bookPosition; i< totalItems - 1 ; i++ ) {
				listItems[i] = listItems[i+1];	
			}
			this.totalItems--;
			System.out.println("DELETE SUCCESSFULL!");
		}
	}
	
	public void find(String bookID) {
		int bookPosition = this.getItemPosition(bookID);
		if(bookPosition == -1) {
			System.out.println("KHÔNG TÌM THẤY!");
		}
		else {
			listItems[bookPosition].showInfo();
		}
	}
	
	public void list() {
		if(checkEmpty()) System.out.println("LIST Book rỗng!");
		else {
			for(int i =0 ; i<totalItems; i++) {
				listItems[i].showInfo();
			}
		}
		
	}
	
}
