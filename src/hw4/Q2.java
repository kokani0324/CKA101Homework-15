package hw4;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("請輸入想借的金額?");
			// 建立二維陣列
            // cash[0] 存放員工編號
            // cash[1] 存放身上現金
			int [][] cash = { {25,32,8,19,27}, {2500,800,500,1000,1200}   } ; //後面的中括號是指那一排的第幾個
			int count = 0 ;
			if (sc.hasNextInt()) {
				 int x =sc.nextInt();
				 for(int i=0 ; i<cash[0].length ; i++) {
					 
					 if(cash[1][i]>=x) { // 這邊的一是指第二行的意思，零就是第一行
						 System.out.print(cash[0][i]+"有");
						 System.out.print(cash[1][i]+"元 ");
						 System.out.println( );
						 count++; // 統計人數
					 }
				 }
			}
		
			System.out.println("共 " + count + " 人!");
			
			
			
		}
		
		
	}

}
