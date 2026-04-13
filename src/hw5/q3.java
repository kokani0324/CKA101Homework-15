package hw5;

public class q3 {
	
	public static int maxElement(int x[][]) {
		int max = x[0][0];
		for(int i = 0 ; i < x.length ; i++) { //這邊是用雙重迴圈 先用直的
			
			for(int j = 0 ; j <x[i].length; j++ ) {//再用橫的
				if(x[i][j]>max) {  //這邊來比出最大值
					max = x[i][j];
				}
			}
			
		}
		return max ; //前面沒有寫void，這邊寫一個return來回傳最大值
	}
	

	
	
	
	
	
	public static double maxElement(double x[][]) {
		double max = x[0][0];
		for(int i = 0 ; i < x.length ; i++) {
			
			for(int j = 0 ; j <x[i].length; j++ ) {
				if(x[i][j]>max) {
					max = x[i][j];
				}
			}
			
	}return max;
	}
	
	public static void main(String[] args) {
		int[][] intArray = {
		        {1, 6, 3},
		        {9, 5, 2}
		};
	
		double[][] doubleArray = {
		        {1.2, 3.5, 2.2},
		        {7.4, 2.1, 8.2}
		};
		
		System.out.println(maxElement(intArray)); //這邊使用了上面的方法，括弧裡就是用傳到方法裡的值，得出的答案就是方法跑完的回傳值。
		System.out.println(maxElement(doubleArray));
	}
}

