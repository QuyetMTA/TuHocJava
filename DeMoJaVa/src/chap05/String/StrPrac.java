package chap05.String;

import java.util.Scanner;

public class StrPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		std02();
	}
	
	//01. Kiểm tra mail hợp lệ
	// bắt đầu bằng 1 kí tự
	// Tập hợp các kí tự a-z, 0-9, và có thể có dấu . hoặc _
	// độ dài 5<x<32
	// tên miền email có thể là cấp 1 hoặc cấp 2
	// -> [a-z][a-z0-9\._]{4,31}@[a-z0-9]{2,}(\.[a-z0-9]{2,4}){1,2}
	public static void std01() {
		
		Scanner sc = new Scanner(System.in);
		String email = "";
		boolean flag = false;
		do {
			System.out.println("NHẬP VÀO EMAIL:");
			email = sc.nextLine();
			
			if (email.matches("[a-z][a-z0-9\\._]{4,31}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}") == true) {
				System.out.println(email);
				flag = true;
			}
			else {
				System.out.println("Email không hợp lệ, mời nhập lại");
			}
			
		} while (flag == false);
	}
	
	//02. Đọc số nhỏ hơn 999
	// 9 : chín
	// 12 : mười hai
	public static void std02() {
		
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean flag = false;
		String str_000 = "";
		String str_00 = "";
		String str_0 = "";
		String result = "";
		String[] dic = {"Không","Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín"};
		
		do {
			System.out.println("Nhập vào chuõi số: ");
			input = sc.nextLine();
			
			if (input.matches("\\d{1,3}") == true) {
				int lenght = input.length();
				
				if(lenght == 1) {
					int digit_0 = Integer.parseInt(input.substring(0));
					str_0 = dic[digit_0];
					result = str_0;
					System.out.println(result);
				}
				if(lenght == 2) {
					int digit_00 = Integer.parseInt(input.substring(0,1));
					str_00 = dic[digit_00] + " mươi ";
					int digit_0 = Integer.parseInt(input.substring(1,2));
					str_0 = dic[digit_0];
					result = str_00 + str_0;
					System.out.println(result);
				}
				if(lenght == 3) {
					int digit_000 = Integer.parseInt(input.substring(0, 1));
					str_000 = dic[digit_000] + " trăm ";
					
					int digit_00 = Integer.parseInt(input.substring(1,2));
					str_00 = dic[digit_00] + " mười ";
					
					int digit_0 = Integer.parseInt(input.substring(2));
					str_0 = dic[digit_0];
		
					result = str_000 + str_00 + str_0;
					System.out.println(result);
				}

				flag = true;
			}
			else {
				System.out.println("Số không hợp lệ, mời nhập lại");
			}
			
		} while (flag==false);
	}

}
