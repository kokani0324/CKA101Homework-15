package hw3.hw3_2;


import java.util.Scanner;

public class GameTest {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		DigitalGames game = new DigitalGames(); // 這裡是呼叫一個建構子 這時就知道隨機數是多少
        System.out.print("開始猜數字吧? (0~100)");
        
        
        while(true)	{
        	if (sc.hasNextInt()) { // 系統判斷鍵盤輸入的是否為 int 整數
        	int playerGuess = sc.nextInt();// 如果是，就取得該數字並存進區域變數 answer
        	int result = game.CheckGuess(playerGuess) ;//這邊answer 是代表你輸入的數字。result是經過checkguess所回傳的值(0,-1,1)
            
            
            if (result == 1) {
            	 System.out.print("太大了");
            }else if(result == -1) {
            	
            	System.out.println("太小了");
            }else {
            	System.out.println("答對了" + "答案是；"+game.answer);//這邊會呼叫到DigitalGames的建構子的answer
            	break; //跳離迴圈，然後會碰到迴圈外的close就結束了
            }
            
            
            
        }  else {
        	System.out.println("請輸入正確的整數！");
        	sc.next();
                }
		
        	
	}        sc.close(); // 需要寫在迴圈外

	}
    

}
