package hw5;



public class q2 {
	public static int randnum() {
		int randNum =(int) (Math.random()*101) ;
		return randNum;
		
	
		
	}
	public static void main(String[] args) {
		int x[] = new int[10];
		int sum = 0 ;
		System.out.println("本次亂數是結果 ");
		for(int i = 0 ; i<x.length ; i++) {
			x[i] = randnum();
			System.out.print(x[i]+" ");
			 sum = x[i] + sum ;
		}
		double avg = (double) sum / x.length ;
		System.out.println();
		System.out.print("平均是 " + avg);
	}

}
