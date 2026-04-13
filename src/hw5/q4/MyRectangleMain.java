package hw5.q4;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle My1 = new MyRectangle();
		My1.width = 10 ;
		My1.depth = 20 ;
		
		System.out.println("第一題 的面積為: " + My1.getArea());
		
		MyRectangle My2 = new MyRectangle(10, 20); //呼叫預設傳入值的建構子
		System.out.println("第二題 的面積為: " + My2.getArea());
	}
}
