package chap05.String;

import java.util.Scanner;

public class StrRE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sdt04();

	}
	
	//01 Number
	// Dữ liệu nhập vào phải là số tự nhiên 0 < x < 100
	public static void sdt01() {
		boolean flag = false;
		String input = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhập vào số tự nhiên: ");
			input = sc.nextLine();
			
			if(input.matches("\\d{1,2}") == true) {
				flag = true;
				System.out.println("Số hợp lệ!");
			}
			else {
				System.out.println("Số ko hợp lệ. Nhập lại: ");
			}
		} while ( flag == false);
		
		sc.close();
	}
	
	// 02 ID
	// ID phải có chiều dài là 7 ký tự XXX-YYY
	// XXX phải nằm trong A-z
	// YYY phải nằm trong 2-8
	// =>  [A-z]{3}-[2-8]{3}
	public static void sdt02() {
		boolean flag = false;
		String input = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhập vào ID: ");
			input = sc.nextLine();
			
			if(input.matches("[A-z]{3}-[2-8]{3}") == true) {
				flag = true;
				System.out.println("ID hợp lệ!");
			}
			else {
				System.out.println("ID ko hợp lệ. Nhập lại: ");
			}
		} while ( flag == false);
		
		sc.close();
	}
	
	// 003 Username
	// Tên đăng nhập phải bắt đầu bằng một ký tự hoặc dấu gạch dưới
	// Tên đăng nhập là tập hợp của các ký tự a-z, 0-9 và có thể có các ký tự như dấu chấm ( . ), dấu gạch dưới ( _ )
	// Độ dài tối thiểu của tên đăng nhập là là 5 ký tự và độ dài tối đa là 32 ký tự
	// => [A-z_][A-z0-9_/.]{4,31}
	public static void sdt03() {
		boolean flag = false;
		String input = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhập vào username: ");
			input = sc.nextLine();
			
			if(input.matches("[A-z_][\\w\\.]{4,31}") == true) {
				flag = true;
				System.out.println("usernam hợp lệ!");
			}
			else {
				System.out.println("usernam ko hợp lệ. Nhập lại: ");
			}
		} while ( flag == false);
		
		sc.close();
	}
	
	// 004 Website
	// ^(https?://(www\.)?|(www\.))[a-z0-9\-]{3,}(\.[a-z]{2,4}){1,2}$
	// http://www.zend.vn
	// https://www.zend.vn.vn
	// http://zend.vn
	// https://zend.vn
	// www.zend.vn
	public static void sdt04() {
		boolean flag = false;
		String input = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhập vào website: ");
			input = sc.nextLine();
			
			if(input.matches("(https?://(www\\.)?|(www\\.))[a-z0-9\\-]{3,}(\\.[a-z]{2,4}){1,2}") == true) {
				flag = true;
				System.out.println("website hợp lệ!");
			}
			else {
				System.out.println("website ko hợp lệ. Nhập lại: ");
			}
		} while ( flag == false);
		
		sc.close();
	}
	

}
