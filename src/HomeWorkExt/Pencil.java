package HomeWorkExt;

public class Pencil extends Pen {
	public Pencil (String brand, double price) {
		super(brand, price); //這是呼叫父類別的建構子
	}
	public Pencil() {
		
	}
	       // 實作父類別交代的抽象方法
	    public void write() {
	        // 填入題目要求的具體動作
	        System.out.println("削鉛筆再寫");
	    }
	    
	    public double getPrice() {
	    	return super.getPrice() * 0.8;
	    }
	    
}
