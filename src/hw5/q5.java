package hw5;


//身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//與數字的亂數組合
public class q5 {
	public static void main(String[] args) {
	char randomChar ;
	String result = "" ;
	
	for(int i= 0 ; i<8 ; ){
		randomChar = (char) ((Math.random() * 75)+ 48); //隨機抽數
		
		boolean isNumber = (randomChar >= '0' && randomChar <= '9');//判斷是否是數字
        boolean isUpper  = (randomChar >= 'A' && randomChar <= 'Z');//判斷是不是大寫字母
        boolean isLower  = (randomChar >= 'a' && randomChar <= 'z');//判斷是不是小寫字母
        
		if(isNumber || isUpper || isLower) { // ||的符號 = or ，有一個true就是true
			result = randomChar + result ;
			i ++ ;
		}else { //重跑一次 不加i
			
		}
	}
	System.out.println("驗證碼：" + result);
	}
}
