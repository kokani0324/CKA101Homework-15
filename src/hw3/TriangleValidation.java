package hw3;
import java.util.Scanner; // 步驟一：必須先 import 這個類別

public class TriangleValidation {
	
	    public static void main(String[] args) {
	        
	        int i;    // 宣告一個 int 變數 (用來裝整數)
	        double d; // 宣告一個 double 變數 (用來裝小數)
	        
	        // 步驟二：建立 Scanner 物件，System.in 代表從標準輸入(鍵盤)讀取
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("請輸入一個數字：");
	        
	        // 步驟三：判斷並讀取整數
	        if (sc.hasNextInt()) { // 系統判斷鍵盤輸入的是否為 int 整數
	            i = sc.nextInt();  // 如果是，就取得該數字並存進變數 i
	            System.out.println("你輸入的整數是：" + i);
	        } 
	        // 步驟四：判斷並讀取浮點數 (小數)
	        else if (sc.hasNextDouble()) { // 系統判斷鍵盤輸入的是否為 double 浮點數
	            d = sc.nextDouble();       // 如果是，就取得該數字並存進變數 d
	            System.out.println("你輸入的浮點數是：" + d);
	        } else {
	            System.out.println("輸入的不是數字喔！");
	        }
	        
	        // 簡報左側提醒的「留意程式是否已終止」，通常我們會把 Scanner 關閉來釋放資源
	        sc.close(); 
	    }
	

}
