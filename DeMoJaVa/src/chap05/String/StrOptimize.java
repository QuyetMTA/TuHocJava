package chap05.String;

import java.util.Scanner;

public class StrOptimize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		std02();
	}
	
	// 01: 
	//	Không có khoảng trắng ở đầu và cuối chuỗi
	//	Giữa các từ trong chuỗi chỉ tồn tại một khoảng trắng duy nhất
	//	Ký tự đầu tiên trong chuỗi phải là ký tự in hoa, 
	// 	Các ký tự còn lại la ký tự thường
	//  Hết câu bằng dấu chấm	
	public static void std01() {

		Scanner sc = new Scanner(System.in);
		
		String str = "";
		System.out.println("NHẬP VÀO CÂU: ");
		str = sc.nextLine();
		
		//1.Không có khoảng trắng ở đầu và cuối chuỗi
		str = str.trim();
		//System.out.println(str);
		
		//2. Giữa các từ trong chuỗi chỉ tồn tại 1 khoảng trắng duy nhất
		str = str.replaceAll("\\s+", " ");
		
		//3. Kí tự đầu tiên trong chuỗi là kí tự in hoa
		//4. các kí tự còn ở dạng chữ thường
		 str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
		
		//5. Hết câu bằng dấu chấm
		//5.1. Nếu cuối chuỗi ko có dấu chấm 
		if(str.charAt(str.length()-1) != '.') { 
			str = str +".";
		}
		//5.2. Cuối chuỗi có khoảng trắng + dấu chấm
		str = str.replaceAll("\\s+\\.", "\\.");
		System.out.println("CÂU SAU KHI CHUẨN HÓA:\n"+str);
	}
	
	// 02: 
	// 1. Không có khoảng trắng ở đầu và cuối chuỗi
	// 2. Giữa các từ trong chuỗi chỉ tồn tại một khoảng trắng duy nhất
	// 3. Ký tự đầu tiên trong chuỗi phải là ký tự in hoa, 
	// 4. Hết câu bằng dấu chấm
	// 5. Các ký tự đầu tiên ở mỗi từ phải được viết hoa
	public static void std02() {
		
		Scanner sc= new Scanner(System.in);
		String str = "";
		System.out.println("NHẬP VÀO CÂU: ");
		str = sc.nextLine();
		
		//1.
		str= str.trim();
		//2. có 5 nên ko cần
		//str = str.replaceAll("\\s+", " ");
		//3. có 5 nên ko cần
		//str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
		//4.
		str =str.replaceAll("\\s+\\.", ".");
		if(str.charAt(str.length()-1) != '.') {
			str = str +".";
		}
		//5.
		String[] arrStr = str.split("\\s+");
		StringBuilder strResult = new StringBuilder();
		//5.c1
		for(int i=0; i< arrStr.length; i++) {
			arrStr[i] = arrStr[i].substring(0, 1).toUpperCase() + arrStr[i].substring(1).toLowerCase();
			strResult.append(arrStr[i]);
			if(i != arrStr.length-1) strResult.append(" ");
		} 
		//5.c2
		/*
		for (String elem : arrStr) {
			String strImp = elem.substring(0, 1).toUpperCase() + elem.substring(1).toLowerCase();
			strResult.append(" ").append(strImp);
		}
		strResult.deleteCharAt(0);
		*/
		System.out.println("CÂU SAU KHI CHUẨN HÓA:\n"+strResult);
	}
}
