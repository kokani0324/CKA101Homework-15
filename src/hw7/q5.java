package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class q5 {
	
	public static void main(String args[]) {
		
		try {
		ObjectInputStream read = new ObjectInputStream(new FileInputStream("C:\\data\\Object.ser"));
		
		read.readObject();
		
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("錯誤");
		}
	}
}
