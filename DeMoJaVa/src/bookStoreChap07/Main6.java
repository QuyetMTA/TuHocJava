package bookStoreChap07;

import java.util.Scanner;

public class Main6 {

	private static BookStore storeObj = new BookStore();// Biến toàn cục

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int functionID = 0;
		boolean flag  = true;
		
		do {
			showMenu();
			
			try {
				functionID = sc.nextInt();
				sc.nextLine();
				
				switch (functionID) {
				case 1: addBook(); break;
				case 2: editBook(); break;
				case 3: deleteBook(); break;
				case 4: findBook(); break;
				case 5: listBook("price",0); break; //Price 0 : Hight - Low   
				case 6: listBook("price",1); break; //Price 1 : Low - hight 
				case 7: listBook("name",1); break; //Name 1 : name A-Z
				case 8: listBook("name",0); break; //Name 0 : name Z-A
				case 9:
				default:
					flag = false;
					break;
				}
			} catch (Exception e) {
				myPrint("Error! Please try again!");
				flag = true;
				sc.nextLine(); // xóa các thông tin nằm trong đối tượng scanner
			}
			
			
		}while(flag == true);
		
		sc.close();

	}
	
	public static void myPrint(String content){
		System.out.println(content);
	}
	
	public static void showMenu() {
		myPrint("----------- BOOK MANAGER ----------- ");
		myPrint("1. Add book");		// x
		myPrint("2. Edit book");	// x
		myPrint("3. Delete book");	//
		myPrint("4. Find book");	// x
		myPrint("5. List book(Price: Hight -> low)");
		myPrint("6. List book(Price: low  -> hight)");
		myPrint("7. List book(Name: A -> Z)");
		myPrint("8. List book(Name: Z -> A)");
		myPrint("9. Exit");			// x
		myPrint("Your choise [1-9]: ");
	}
	
	public static void addBook() {
		if(storeObj.checkFull()) {
			System.out.println("KHO SÁCH ĐẦY! KHÔNG THỂ THÊM.");
		}
		else {
			Scanner sc = new Scanner(System.in);
			
			String bookID ="";
			String bookName ="";
			double bookPrice = 0;
			
			myPrint("ID: ");
			bookID = sc.nextLine();
			
			myPrint("Name: ");
			bookName = sc.nextLine();
			
			myPrint("Price: ");
			bookPrice = sc.nextDouble();
			sc.nextLine();
			
			Validate validateObj = new Validate();
			
			boolean flagID = validateObj.checkID(bookID);
			boolean flagName = validateObj.checkName(bookName);
			boolean flagPrice = validateObj.checkPrice(bookPrice);
			//if (validateObj.checkID(bookID) == true) {
			if(flagID && flagName && flagPrice) {
				Book bookObj = new Book(bookID, bookName, bookPrice);
				storeObj.add(bookObj);
			}
			else {
				validateObj.getError();
			}
			
		}
	}
	
	public static void editBook() {
		
		Scanner sc			= new Scanner(System.in);
		String bookName		= "";
		String bookID		= "";
		double bookPrice	= 0;
		
		myPrint("ID: ");
		bookID	= sc.nextLine();
		
		myPrint("Name: ");
		bookName	= sc.nextLine();
		
		myPrint("Price: ");
		bookPrice	= sc.nextDouble();
		
		Validate validateObj = new Validate();
		
		boolean flagID = validateObj.checkID(bookID);
		boolean flagName = validateObj.checkName(bookName);
		boolean flagPrice = validateObj.checkPrice(bookPrice);
		//if (validateObj.checkID(bookID) == true) {
		if(flagID && flagName && flagPrice) {
			storeObj.edit(bookID, bookName, bookPrice);
		}
		else {
			validateObj.getError();
		}
		
		//storeObj.edit(bookID, bookName, bookPrice);
	}
	
	public static void deleteBook() {
		Scanner sc =new Scanner(System.in);
		
		String bookID = "";
		
		myPrint("ID: ");
		bookID = sc.nextLine();
		
		Validate validateObj = new Validate();
		
		boolean flagID = validateObj.checkID(bookID);
		//if (validateObj.checkID(bookID) == true) {
		if(flagID ) {
			storeObj.delete(bookID);
		}
		else {
			validateObj.getError();
		}
		
		//storeObj.delete(bookID);
	}
	
	public static void findBook() {
		Scanner sc = new Scanner(System.in);
		
		String IDfind = "";
		myPrint("Nhập vào ID: ");
		IDfind = sc.nextLine();
		
		Validate validateObj = new Validate();
		
		boolean flagID = validateObj.checkID(IDfind);
		//if (validateObj.checkID(bookID) == true) {
		if(flagID ) {
			storeObj.find(IDfind);
		}
		else {
			validateObj.getError();
		}
		//storeObj.find(IDfind);
	}
	
	public static void listBook(String property, int type) {
		if(property.equals("name") && type == 1) storeObj.sortNameAZ();
		if(property.equals("name") && type == 0) storeObj.sortNameZA();
		if(property.equals("price") && type == 1) storeObj.sortPriceUp();
		if(property.equals("price") && type == 0) storeObj.sortNameLow();
		storeObj.list();
	}
}
