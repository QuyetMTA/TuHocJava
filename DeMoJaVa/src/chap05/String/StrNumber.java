package chap05.String;

import java.util.Scanner;

public class StrNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		std01();
	}
	
	public static void std01() {
		
		boolean flag = true;
		String result ="";
		String str_000 = "";
		String str_00 = "";
		String str_0 = "";
		String[] dic = {"Không","Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín"};
		
		String input = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("INPUT:");
			input = sc.nextLine();
			
			if(input.matches("\\d{3}") == true) {
				
				int digit_000 = Integer.parseInt(input.substring(0,1));
				str_000 = dic[digit_000] + " trăm ";
				
				int digit_00 = Integer.parseInt(input.substring(1,2));
				str_00 = dic[digit_00] + " mươi ";
				if(digit_00 == 0) str_00 = "linh ";
				if(digit_00 == 1) str_00 = "mười ";
				
				int digit_0 = Integer.parseInt(input.substring(2));
				str_0 = dic[digit_0];
				
				if(digit_00 ==0  && digit_0 == 0) {
					str_00 =""; str_0="";
				}
				if(digit_0 == 0) {
					str_0 = "";
				}
				if(digit_00 > 1 && digit_0 == 1) {
					str_0 = "mốt";
				}
				if(digit_00 > 0 && digit_0 ==5) {
					str_0 = "lăm";
				}
				
				result = str_000 + str_00 + str_0;
				
				System.out.println(result);
				flag = false;	
			}
			else {
				System.out.println("Số không hợp lệ, mời nhập lại");
			}
			
		} while (flag == true);
	}

}
