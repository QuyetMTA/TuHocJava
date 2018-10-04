package Chap03.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		study001();
	}
	
	public static void study001() {
		int rows, columns;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ROWS: ");
		rows = sc.nextInt();
		sc.nextLine(); //tránh các lỗi không mong muốn
		
		System.out.println("COLUMNS: ");
		columns = sc.nextInt();
		sc.nextLine();
		
		
		
		int[][] arrMulti = new int[rows][columns];
		for(int i=0; i <rows ; i++) {
			for(int j=0; j<columns; j++) {
				System.out.printf("Dòng %d cột %d : %n",i+1, j+1);
				arrMulti[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}
		sc.close();
		
		System.out.println(Arrays.deepToString(arrMulti));
		
		// tìm giá trị lớn nhất
		int max = arrMulti[0][0];
		/*
		for(int i=0; i <rows ; i++) {
			for(int j=0; j<columns; j++) {
				if(max < arrMulti[i][j]) max = arrMulti[i][j];
			}
		}
		System.out.println(max); */
		
		// tìm giá trị lớn nhất (cách 2) : cách 2 tối ưu hơn
		for(int i=0; i<rows ; i++) {
			Arrays.sort(arrMulti[i]);
			int lenght = arrMulti[i].length;
			if(max < arrMulti[i][lenght-1]) max = arrMulti[i][lenght-1];
		}
		System.out.println("Max: "+ max);
	}

}
