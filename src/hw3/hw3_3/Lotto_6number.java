package hw3.hw3_3;

public class Lotto_6number {
	
	
	public  void printNumber( int badnumber) {
		int [] seikaiNum = new int[6] ; //建立一個陣列，來存放6個亂數的地方
		int count = 0 ;
		
		while1:
		while(count<6) {
			int randomNum = (int) (Math.random() * 49) + 1 ;//抽1到49的號碼

			if (randomNum / 10 ==badnumber || randomNum % 10 == badnumber ) { //判斷有沒有不喜歡的數，有就再跑一次迴圈
				continue ;
				}
			
			for(int j = 0 ; j<count ; j++) {
				if (seikaiNum[j] == randomNum ) {
					continue while1 ; 
				}
			}
			
			seikaiNum [count] = randomNum ; //號碼存在陣列
			System.out.print(randomNum + "\t"); // 印出來
	        count++; // 成功收集到 1 個，計數器 +1
		}
	}
	
}
