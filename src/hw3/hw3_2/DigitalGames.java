package hw3.hw3_2;

//import java.util.Random;
//import java.util.Scanner;

public class DigitalGames {
	int answer ; // 設定一個實體變數
	public DigitalGames() { //這是一個建構子
		answer =(int) (Math.random()*101) ; //一個0~100的隨機數
		
	}
	
	
	public int CheckGuess(int playerGuess) { // playerGuess是我們猜的數字
		if (playerGuess > answer) {
			return 1  ; // 太大了 
		}else if (playerGuess < answer) {
			return -1 ; //太小了
		}else {
			return 0 ; //答對了
		}
		
		
		
		
		
	}

	
	
	

}
