package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class q4 {
	
	public static void main(String args[]) {
		File data = new File("C:\\data"); //新增一個data資料夾
		data.mkdir();//實作出來
		
		try {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\data\\Object.ser"));
		// new FileOutputStream("C:\\data\\Object.ser" FileOutputStream 是用來寫入原始位元組的數據流，只認得最基礎的資料格式（位元組）
		//new ObjectOutputStream 是把原始位元組 翻譯壓縮成一連串的位元組，序列化的意思
		
		Dog dog1 = new Dog("dog1");  // 產生一隻狗 
		Dog dog2 = new Dog("dog2");
		Cat cat1 = new Cat("cat1");  // 產生一隻貓 
		Cat cat2 = new Cat("cat2");
		
		oos.writeObject(dog1);
		oos.writeObject(dog2);
		oos.writeObject(cat1);
		oos.writeObject(cat2);
		System.out.println("寫入成功");
		oos.close();
		} catch(Exception e) {
			
			System.out.println("錯誤");
			
		}
	
		
	
	}


}
