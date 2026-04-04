package hw3.hw3_3;

import java.util.Scanner;

public class SuperLotto {
	public static void main(String[] args) {
		
		LottoMachine machine = new LottoMachine();
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.print("請輸入你不喜歡的數字?(1~9)");
//		4要用輸入的值，
			if (sc.hasNextInt()) {// 系統判斷鍵盤輸入的是否為 int 整數
				int x =sc.nextInt(); // 如果是，就取得該數字並存進區域變數 x
				machine.printNumber(x);
							
			}
		}
	}

}
