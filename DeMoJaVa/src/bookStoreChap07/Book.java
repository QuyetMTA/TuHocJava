package bookStoreChap07;

public class Book {
	
	private String ID;
	private String name;
	private double price;
	
	public Book(String ID, String name, double price){
		this.setID(ID);
		this.setName(name);
		this.setPrice(price);
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "Book Info: "
					+ "\n- ID \t\t:" + this.getID()
					+ "\n- Name \t\t:" + this.getName()
					+ "\n- Price  \t:" + this.getPrice();
		return result;
	}
	/*
	public void showInfo() {
		System.out.println("Book Info: ");
		System.out.println("- ID \t\t:" + this.getID());
		System.out.println("- Name \t\t:" + this.getName());
		System.out.println("- Price  \t:" + this.getPrice());
	} */
}
