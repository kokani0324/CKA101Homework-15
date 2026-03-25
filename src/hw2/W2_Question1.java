package hw2;

public class W2_Question1 {
	public static void main(String[] args) {
		int i =1;
		int sum = 0 ;
		for (i = 1; i<=1000; i++) {
			if (i % 2 == 0) {
				sum = sum + i ;
				
			}
			
				
		}
		System.out.println("第一題：" + sum);
		
		
		//第二題
		int i1 = 1;
		int product1 = 1 ;
		for (i1 =1; i1<=10 ; i1++) {
			product1 = product1 * i1 ;
//			System.out.println(product1);
		}
		System.out.println("第二題：" + product1);
		
		//第三題
		int i2 = 1;
		int product2 = 1 ;
		while (i2 <=10) {
			product2 = product2 * i2 ;
			i2 = i2 +1 ;
//			System.out.println(product2);
		}
		
		System.out.println("第三題：" + product2);
		
		//第四題
		int i3 =1;
		int product3 = 1;
	
		System.out.print("第四題：");
		for(i3 =1 ; i3<=10 ; i3++) {
			product3 = i3 * i3 ;
			
			System.out.print( product3 +"  ");
		}
		
		
	}

}
