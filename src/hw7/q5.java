package hw7;

import java.io.*;

public class q5 {
    public static void main(String[] args) {
        File file = new File("C:\\data\\Object.ser");

        // 這是 try-with-resources 寫法，小括號內的資源會被自動關閉
        try (FileInputStream fis = new FileInputStream(file); //最底層的工具 把資料當作一連串的 位元 (bytes) 讀進來 ，看到都是 0 與 1 的位元流
             ObjectInputStream ois = new ObjectInputStream(fis)) { // 工作是把那些原始的位元重新拼湊，還原成記憶體中的 Java 物件 ，叫做反序列化

            System.out.println("--- 開始讀取物件並執行 speak() ---");

            // 使用無窮迴圈，直到讀到檔案末尾跑到 EOFException 為止
            while (true) {
                // 【多型簡化】直接轉型成父類別 Animal
                Animal a = (Animal) ois.readObject(); //轉型Animal物件
                a.speak(); 
            }

        } catch (EOFException e) {
            // 當 readObject() 讀到檔案最後，會跳到這裡，代表正常結束
            System.out.println("資料讀取完畢！");
        } catch (Exception e) {
            // 處理其餘像是找不到檔案或讀取錯誤的問題
            e.printStackTrace();
            System.out.println("讀取發生錯誤");
        }
    }
}