package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class q1 {
	
	public static void main(String args[]) {
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
		
			List list = new ArrayList();
			list.add(new Integer(100));
			list.add(new Double(3.14));
			list.add(new Long(21L));
			list.add(new Short("100"));
			list.add(new Double(5.1));
			list.add("Kitty");
			list.add(new Integer(100));
			list.add(new Object());
			list.add("Snoopy");
			list.add(new BigInteger("1000")); //這個是無限的整數
			
			Iterator it = list.iterator() ;
			
//			 while (it.hasNext()) {
//			        
//			        Object s = it.next();
//			        System.out.println(s);
//			 }
		
//			 for(int i = 0; i < list.size() ; i++) {
//				 System.out.println(list.get(i));
//			 }
			
//			for(Object obj : list) {
//				System.out.println(obj); // foreach 語法
//			}
			 System.out.println("==============================");
			 
			while (it.hasNext()) { //Q1.2    只要 it 看到前面還有東西...
				Object obj = it.next(); //it走過去把那個東西 給 obj 看
		        if(obj instanceof Number) { // instanceof檢查身分是不是數字
		         it.remove(); //如果是數字，it就把它從list裡丟掉
		        }else {
		        	System.out.println(obj);
		        }
		    }
			
			while (it.hasNext()) { //Q1.3
		        
		        Object s = it.next();
		        System.out.println(s);
		 }
	}

}
