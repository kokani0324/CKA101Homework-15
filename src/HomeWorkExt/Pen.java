package HomeWorkExt;

public abstract class Pen {
	private String brand ;
	private double price ;
	
	
	public Pen() {
		
	}
	public Pen(String brand, double price ) {
		this.brand = brand ;
		this.price = price ; //從外面接收到的值，傳入4 5 行設定的變數。
	}
	
	public String getBrand () { //因為原本的變數被封裝起來，所以要拿到該值需要透過方法來呼叫，所以這邊只是用來回傳被封裝起來的值
		return brand ;
	}
	
	public double getPrice () {
		return price ;
	}
	
	public void setBrand(String brand) { //
		this.brand = brand ;
	}
	
	public void setPrice(double price) {
		if(price>0) {
			this.price = price ;
		}else {
			System.out.println("請確認售價");
		}
	}
	public abstract void write() ;
		
	
	

}
