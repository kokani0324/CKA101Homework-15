package hw7;

import java.io.FileReader;
import java.io.FileWriter;

public class q3 {
	public static void copyFile (String source , String target) {
		
		try {
			FileWriter fw = new FileWriter( target , true) ;
			FileReader fr = new FileReader(source) ; //讀取用的物件
			int c ;
			while((c = fr.read()) != -1) { // 呼叫讀取，讀到沒有 = -1 就停止迴圈
				fw.write(c);
				System.out.println(c);
			}
			
			fw.close(); fr.close();
			
		}catch(Exception e){
			System.out.println("錯誤");
		}
	}
	public static void main(String[] args) {
		copyFile("Data.txt", "Data_copy.txt");
	}

}
