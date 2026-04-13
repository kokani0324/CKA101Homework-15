package hw5.q4;

public class MyRectangle {
	double width ;
	double depth ; //設兩個實體變數
	
	public MyRectangle() { //不帶參數也無內容的建構子
	
	}
	public MyRectangle(double width, double depth) {  //傳入的兩個引數會指定給對應的屬性
		this.width = width ; // 右邊是傳入的值，左邊是要維持類別的屬性(double)
		this.depth = depth ;
	}
	
	public void setWidth(double width) { //用來方便之後呼叫調整 寬度
		this.width = width ;
	}
	public void setDepth(double depth) {
		this.depth = depth ;
	}
	public double getArea() { //用來呼叫執行的
		return width*depth ;
	}

}
