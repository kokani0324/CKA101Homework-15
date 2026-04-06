package hw3.hw3_3;

import java.util.Scanner;

public class Lotto_main_6number {
	public static void main(String[] args) {
		Lotto_6number a = new Lotto_6number();
		
		 try (Scanner sc = new Scanner(System.in)) {
			 
			 System.out.print("請輸入你不喜歡的數字?(1~9)");
			 
			 if (sc.hasNextInt()) {
				 int x =sc.nextInt();
				 a.printNumber(x);
			 } 
		 }
	}
}
