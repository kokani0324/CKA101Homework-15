package hw4;

public class Q1 {
	public static void main(String[] args) {
		int Q1 [] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for (int i = 0; i < Q1.length; i++) {
		sum += Q1[i];
		}
		int Avg = sum / Q1.length ; //這邊的長度是指有幾個數字
		 System.out.println("第一題平均數："+Avg);
		 System.out.println(" ");	
		 System.out.print("大於平均數的有");
		 for(int i = 0 ; i <Q1.length ; i++) { //再用一個迴圈來一個一個比較大於平均的數
			 if(Q1[i]>Avg) {
				 System.out.print(+Q1[i]+ "\t");	 
			 }
		 }
		System.out.println(" ");
		System.out.println("<><><><><><><><><><><><><>"); 
//
		String s = "Hello World" ;
		for(int i = s.length()-1 ; i>=0 ; i--) { // 取長度會是11，但最後一個字的位置是10，因為是從0開始算，所以需要-1
			System.out.print(s.charAt(i)); 
		}
		System.out.println(); 
		System.out.println("<><><><><><><><><><><><><>"); 
//		
		String QQ1 [] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"} ;
		int count_a = 0 ; int count_e = 0 ; int count_i = 0 ; int count_o = 0 ; int count_u = 0 ;
		
		for(int  i = 0 ; i < QQ1.length; i++) { // 這是用來把陣列裡面的字串給個別拿出來
			String word = QQ1[i] ;
			for(int j = 0 ; j < word.length() ; j++) { // 這邊就是把拿出來的字串，去做字元的比較
				if(word.charAt(j)== 'a') { // charAt是可以把字串的字元各別抓出來，第一個位數是'0'
				count_a++;
				}
				if(word.charAt(j)== 'e') {
					count_e++;
					}
				if(word.charAt(j)== 'i') {
					count_i++;
					}
				if(word.charAt(j)== 'o') {
					count_o++;
					}
				if(word.charAt(j)== 'u') {
					count_u++;
					}
			}
		}
		System.out.println("a有："+count_a);
		System.out.println("e有："+count_e);
		System.out.println("i有："+count_i);
		System.out.println("o有："+count_o);
		System.out.println("u有："+count_u);

	}

}
