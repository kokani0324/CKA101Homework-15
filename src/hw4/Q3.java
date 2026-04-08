package hw4;

import java.util.Scanner;

public class Q3 {
	public static boolean isLeapYear(int year) {
	    // 條件一：能被 4 整除且不能被 100 整除
	    // 條件二：能被 400 整除
	    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	        return false;  // 是閏年
	    } else {
	        return true; // 是平年
	    }
	}
	public static void main(String[] args) {
		int m1 [] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int m2 [] = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		int sum = 0 ;
		int total = 0 ;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("請輸入西元yyyy年?");
			int year =sc.nextInt();
			
			System.out.print("請輸入mm月?");
			int month =sc.nextInt();
			
			System.out.print("請輸入dd日?");
			int day =sc.nextInt();
			
			if(isLeapYear(year)) {
				for (int i = 0; i < month; i++) {
					sum += m1[i];
					}
				 total= sum + day ;
			}else {
				for (int i = 0; i < month; i++) {
					sum += m2[i];
					}
				total = sum+day ;
			}
				 
			
			System.out.print("輸入的日期為"+ year +"年第"+ total + "天" );
			sc.close();
		}
	}

}
