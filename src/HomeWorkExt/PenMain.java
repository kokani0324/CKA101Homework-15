package HomeWorkExt;

public class PenMain {
	
	public static void main(String[] args) {
	
		Pen[] pens = new Pen[3]; //繼承父類別的Pen型態
		
		pens[0] = new Pencil("SKB", 20.0); //鉛筆
	    pens[1] = new InkBrush("百樂", 100.0); //毛筆
	    pens[2] = new Pencil();
	    Pen pen3 = pens[2] ;
	    pen3.setBrand("雄獅");
	    pen3.setPrice(70);
	    for(int i = 0 ; i<pens.length ; i++ ) {
	    	Pen p = pens[i];
	    	
	    	p.write(); //會根據父類別
	    	System.out.println(p.getBrand()+"的售價是"+p.getPrice());
	    }
	}

}
