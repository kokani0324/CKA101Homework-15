package hw2;

public class Testninenine {
	public static void main(String[] args) {
		int i =1;
		int j =1;
		for (i=1; i < 10; i = i + 1 ) {
			j =1 ;
			while(j <= 9) {
			
			System.out.print(i + "*" +j + "=" + i*j + "\t" );
			j = j + 1 ;
			}
		System.out.println();
		}
		System.out.println("===========================================");
		for (i=1; i < 10; i = i + 1 ) {
			j =1 ;
			do {
			
			System.out.print(i + "*" +j + "=" + i*j + "\t" );
			
			j = j + 1 ;
			} while (j <= 9);
			
		System.out.println();
		}
		System.out.println("===========================================");
		int i1 =1;
		int j1 =1;
		while (i1 < 9 ) {
			i1= i1 +1;
			j1 =1 ;
			do {
			
			System.out.print(i1 + "*" +j1 + "=" + i1*j1 + "\t" );
			
			j1 = j1 + 1 ;
			} while (j1 <= 9);
			
		System.out.println();
		
		}

}
}
