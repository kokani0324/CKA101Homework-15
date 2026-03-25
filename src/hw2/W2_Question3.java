package hw2;

public class W2_Question3 {
	public static void main(String[] args) {
//		System.out.println("\u0041"); 16*4+1 = 65
		int i =1;
		int j =1 ;
		int unicode = 64 ;
		
			for (i =1 ; i <=6 ; i++) {
				unicode = unicode +1 ;
				for (j=1; j <= i; j++) {
					System.out.print((char)unicode);
				}
				System.out.println();
			}
		
	
	}
	
}
