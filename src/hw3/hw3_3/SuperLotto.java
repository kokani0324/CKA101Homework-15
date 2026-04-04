package hw3.hw3_3;

import java.util.Scanner;

public class SuperLotto {
	public static void main(String[] args) {
		
		int i ;
		int x ;
		int count = 0 ;
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.print("請輸入你不喜歡的數字?(1~9)");
//		4要用輸入的值，
			if (sc.hasNextInt()) {
				x =sc.nextInt();
				
			for (i =1 ; i<=49 ; i++) {
				if (i / 10 ==x) { //10位數的
					continue;
				}else if (i % 10 == x) { //個位數的
					continue;
				}else
					System.out.print(i + "\t");
					count++ ;
					if (count % 7 == 0) {
						System.out.println();
						
					}
						
				
			}
			}else {
	            System.out.println("輸入的數字不符合！");
	        }
		}System.out.print("總共有" + count + "數字可選"+ "\t");
	}

}
