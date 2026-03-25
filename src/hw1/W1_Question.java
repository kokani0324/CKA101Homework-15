package hw1;

public class W1_Question {
	public static void main(String[] args) {
		
		System.out.println("第一題：");
		System.out.println(12+6);//Question 1
		System.out.println(12*6);
		//
		
		int egg = 200;//Question 2
		System.out.println("第二題：");
		System.out.println(egg/12 + "打" + "又" + egg % 12 +"顆" );
		
		//
//		System.out.println("第三題：");
		long alltime = 256559 ;//Q3
		long day = alltime/60/60/24;
		long hour = (alltime/60/60)- (day*24);
		long minute = (alltime/60)- (day*24*60)-(hour*60);
		long second = (alltime)- (day*24*60*60)-(hour*60*60)-(minute*60);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		System.out.println("第三題："+ day + "天" + hour+ "小時" + minute+ "分" + second+ "秒");
		//
		final double PI = 3.1415; //Q4
		double r = 5 ;
		System.out.println("第四題:");
		System.out.printf("圓面積：" + "%.2f\n" , (r*r*PI));
		System.out.printf("圓周長" + "%.2f\n" , (2*r*PI));
		//
		 double PV = 1500000;//Q5
		 double rate = 0.02;
		 //PV*(1+rate)^10
		 System.out.println("第五題：");
		 System.out.printf("%.2f\n" , PV*(Math.pow((1+rate), 10)));
		 
		 
		 //
		 System.out.println("第六題：");
		 System.out.println(5+5);//裡面的數值是int，進行基本的數字相加
		 System.out.println(5+'5');//當整數和字元做運算會把字元轉變成ASCII表的位置，'5'位置是53，所以和5相加就是58
		 System.out.println(5+"5");//裡面有一個字串，所以會變成一個字串的合併
		
	}

}
