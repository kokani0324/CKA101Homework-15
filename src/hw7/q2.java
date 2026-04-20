package hw7;

import java.io.FileWriter;

public class q2 {
	
	public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter("Data.txt" , true) ;//FileWriter專門把文字寫入檔案，寫入Data.txt，沒加true就是覆寫模式
		int i ;
		
		for(int x = 0 ; x < 10 ; x++) {
			
		i = (int)(Math.random()*1000)+1 ;
		
		System.out.println(i);
		
		fw.write(i + "\n"); //write()：是 FileWriter 提供的方法，代表執行動筆寫入的動作
		
		}
		
		fw.close();
		
		} catch(Exception e) {
			
			System.out.println("錯誤");
		}
	}

}
