package hw5;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入寬?");
		int width =sc.nextInt();
		System.out.print("請輸入高?");
		int height =sc.nextInt();
		
		for(int i = 0 ; i < height ;i++ ) {
			
			for(int j = 0 ; j < width ;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		sc.close();
		
	}
	
}
