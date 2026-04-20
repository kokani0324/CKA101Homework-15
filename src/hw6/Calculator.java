package hw6;

public class Calculator {
	public int powerXY(int x , int y)throws CalException { //將可能發生的例外，丟給CalException處理
		//例外一
		if(x==0 && y == 0) { //x 和 y ==0
			throw new CalException("0的0次方沒有意義"); //丟出去
		}
		//例外二
		if(y<0) {
			throw new CalException("次方為負值，結果回傳不為整數!");//丟出去
		}
		//沒問題，進行計算 回傳
		return (int) Math.pow(x, y) ; //.pow：這是 「power」（冪/次方）的縮寫
	}

}
