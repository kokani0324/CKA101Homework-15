package hw2;

public class W2_Question2 {
	public static void main(String[] args) {
		int i = 1;
				
		for (i =1 ; i<=49 ; i++) {
			if (i / 10 ==4) { //10位數的
				continue;
			}else if (i % 10 == 4) { //個位數的
				continue;
			}else
			System.out.print(i + " ");
		}
		
		
		System.out.println("");
		System.out.println("");
		
		
		
		int i1 = 1 ;
		int j1 = 10 ;

	
	while (j1>0) {
		for (i1 =1 ;i1 <=j1 ; i1++ ) {
			
		System.out.print(i1 + " ");
		
		}
		
		j1 = j1 -1;
		
		System.out.println();
	}


		
//		
//		for (i1 =1 ;i1 <=9 ; i1++ ) {
//			System.out.print(i1 + " ");
	}
	
}
