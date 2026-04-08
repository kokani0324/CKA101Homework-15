package hw4;

public class Q4 {
	
	public static int Max(int [][] test) {
		int max = test[1][0];
		int hito = test[0][0];
		for (int i = 1; i < test[1].length; i++) {
			// 拿目前的數字跟 max PK
			if (test[1][i] > max) {
				max = test[1][i];// 遇到更大的，就更新 max 的值
				hito = test[0][i];
			}
		}
		return hito ;
		
	}
	public static void main(String[] args) {
		int [][] test1 = { {1,2,3,4,5,6,7,8}, {10,35,40,100,90,85,75,70} } ;
		int [][] test2 = { {1,2,3,4,5,6,7,8}, {37,75,77,89,64,75,70,95} } ;
		int [][] test3 = { {1,2,3,4,5,6,7,8}, {100,70,79,90,75,70,79,90} } ;
		int [][] test4 = { {1,2,3,4,5,6,7,8}, {77,95,70,89,60,75,85,89} } ;
		int [][] test5 = { {1,2,3,4,5,6,7,8}, {98,70,89,90,75,90,89,90} } ;
		int [][] test6 = { {1,2,3,4,5,6,7,8}, {90,80,100,75,50,20,99,75} } ;
		int result = Max(test1);
		System.out.println(result);
		
		int result2 = Max(test2);
		System.out.println(result2);
		int result3 = Max(test3);
		System.out.println(result3);
		int result4 = Max(test4);
		System.out.println(result4);
		int result5 = Max(test5);
		System.out.println(result5);
		int result6 = Max(test6);
		System.out.println(result6);
		
		int [] score = { Max(test1), Max(test2), Max(test3), Max(test4), Max(test5), Max(test6)};
		int[] count = new int[9]; // 不想用0
		
		for(int i = 0 ; i < score.length ; i++) {
			int hito = score[i] ; // 這邊會把出現的座號，放在hito上面
			count[hito]++ ; // 這邊會把座號出現次數，統計在count陣列裡面
		}
		
		for (int i = 1 ; i<count.length ; i++ ) {
			if(count[i]>0) {
				System.out.println(i+"號同學"+count[i]+"次");
			}
		}
	}

}
