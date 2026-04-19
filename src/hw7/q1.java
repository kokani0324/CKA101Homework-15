package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class q1 {
	 public static void main(String[] args) {
	        // 建立 File 物件代表該檔案路徑
	        File file = new File("\\C:\\CKA101_Workspace\\CKA101Homework-15\\src\\hw7\\Sample.txt");
	        
	        if (!file.exists()) { //利用 exists() 檢查檔案是否存在，當檔案不存在時，就回傳 找不到 用return來回傳結束main方法，
	        	System.out.println("找不到檔案！");
	        	return; // 結束程式
	        }
	        
	        //  取得檔案位元組大小
	        long byteCount = file.length();  //用來抓取檔案多少位元
	        
	        int charCount = 0; //累加字元
	        int lineCount = 0; //累加行數

	        // 使用 try-catch 來處理 I/O 過程中可能發生的例外
	        try {
	            // 建立 I/O 鍊：FileReader (低階) 搭配 BufferedReader (高階)
	            FileReader fr = new FileReader(file);
	            BufferedReader br = new BufferedReader(fr);
	            
	            String line;
	            // readLine() 讀取到檔案末端時會回傳 null
	            while ((line = br.readLine()) != null) { // br.readLine() 會一次讀取檔案中的一行文字並回傳給line
	                lineCount++;                 // 每次讀到一列，列數就加 1
	                charCount += line.length();  // 將該列的字元長度累加至字元總數
	            }
	            
	            // 使用完畢後關閉資料流 
	            br.close();
	            fr.close();
	        } catch (IOException e) { //用來捕捉讀寫過程中可能拋出的IOException (輸入輸出例外錯誤)，變數e用來承接該錯誤物件
	            e.printStackTrace(); //發生錯誤，呼叫此方法將錯誤的詳細追蹤訊息
	        }
	        
	     // 輸出統計結果
	        System.out.println("檔案名稱：" + file.getName()); //file工具箱裡  用來抓去檔案名字
	        System.out.println("共有 " + byteCount + " 個位元組 (Bytes)");
	        System.out.println("共有 " + charCount + " 個字元 (Characters)");
	        System.out.println("共有 " + lineCount + " 列資料 (Lines)");
	 }
}
