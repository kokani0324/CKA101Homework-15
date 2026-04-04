package hw3.hw3_1;

//import java.util.Scanner;

public class Triangle {
	int a ;
	int b ;
	int c ;
	
	public Triangle(int a , int b , int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public  String checkType() {
		if (a+b > c && a+c > b && b+c > a) {
        	
        	if(a == b && a==c && b==c ) {
        		System.out.println("正三角形！"); //return 正三角形
        	}
        	else if(a==b || b==c || a==c) {
        		System.out.println("等腰三角形！"); //return 等邀三角形
        	}else if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)|| Math.pow(b, 2)+Math.pow(c, 2)==Math.pow(a, 2) || 
        			Math.pow(a, 2)+Math.pow(c, 2)==Math.pow(b, 2)) { //用math.pow來求次方
        		System.out.println("直角三角形！"); //return 直角三角形
        		
        	}
        	
        	else {
        		System.out.println("其他三角形！");// return 其他三角形
        		
        	}
        	
        }
        else {
        	System.out.println("不是三角形！");//return 不是三角形
        }
		return  " ";
        
        
    }
	

}
