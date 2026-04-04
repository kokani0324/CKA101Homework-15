package hw3.hw3_1;
import java.util.Scanner; // 步驟一：必須先 import 這個類別

public class TriangleValidation {
	//先輸入3個數值，要比較數值的大小，來分配位置，
	// a+b > c 基本三角形判斷 if a+b > c && a+c > b && b+c > a 
	// a==b==c 正三角形    a==b 等邀三角形
	//a^2 + b^2 = c^2 直角三角形
	
	    public static void main(String[] args) {
	        
	        int a ,b,c;    // 宣告個三個 int 變數 (用來裝整數)
	   
	        
	        // 步驟二：建立 Scanner 物件，System.in 代表從標準輸入(鍵盤)讀取
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("請輸入三角形的長度：");
	        
	        // 步驟三：判斷並讀取整數
	        if (sc.hasNextInt()) { // 系統判斷鍵盤輸入的是否為 int 整數
	            a = sc.nextInt();// 如果是，就取得該數字並存進變數 a
	            b = sc.nextInt();
	            c = sc.nextInt();
	            if (a+b > c && a+c > b && b+c > a) {
	            	
	            	if(a == b && a==c && b==c ) {
	            		System.out.println("正三角形！");
	            	}
	            	else if(a==b || b==c || a==c) {
	            		System.out.println("等腰三角形！");
	            	}else if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)|| Math.pow(b, 2)+Math.pow(c, 2)==Math.pow(a, 2) || 
	            			Math.pow(a, 2)+Math.pow(c, 2)==Math.pow(b, 2)) { //用math.pow來求次方
	            		System.out.println("直角三角形！");
	            		
	            	}
	            	
	            	else {
	            		System.out.println("其他三角形！");
	            		
	            	}
	            	
	            }
	            else {
	            	System.out.println("不是三角形！");
	            }
	            
	            
	        }
	        else {
	            System.out.println("輸入的數字不符合！");
	        }
	        
	        // 「留意程式是否已終止」，通常我們會把 Scanner 關閉來釋放資源
	        sc.close(); 
	    }
	

}
