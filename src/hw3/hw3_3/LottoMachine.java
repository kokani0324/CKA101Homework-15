package hw3.hw3_3;

public class LottoMachine {
	public  void printNumber( int badnumber) {
		int i ;
		int count = 0 ;
		
		
		for (i =1 ; i<=49 ; i++) {
			if (i / 10 ==badnumber) { //10位數的
				continue;
			}else if (i % 10 == badnumber) { //個位數的
				continue;
			}else
				System.out.print(i + "\t");
				count++ ;
				if (count % 7 == 0) {
					System.out.println();
					
				}
					
			
		}
		System.out.println("\n總共有" + count + "數字可選");
	}

}
