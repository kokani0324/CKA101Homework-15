package hw3.hw3_1;

import java.util.Scanner;

public class Validation {
	public static void main (String[] args) {
		int a ;
		int b ;
		int c ;
		
		Scanner sc = new Scanner(System.in);
        
        System.out.print("請輸入三角形的長度：");
        
        if (sc.hasNextInt()) { // 系統判斷鍵盤輸入的是否為 int 整數
            a = sc.nextInt();// 如果是，就取得該數字並存進變數 a
            b = sc.nextInt();
            c = sc.nextInt();
		Triangle T = new Triangle(a, b, c);
		String result = T.checkType();
		
		System.out.println(result) ;
		
        }
     // 「留意程式是否已終止」，通常我們會把 Scanner 關閉來釋放資源
        sc.close(); 
	}
		

}
