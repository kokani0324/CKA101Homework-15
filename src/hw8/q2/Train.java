package hw8.q2;

import java.util.Objects;

//請設計一個Train類別,並包含以下屬性:
//- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//- 目的地 dest,型別為String - 票價 price,型別為double
public class Train implements Comparable<Train>{
	
	private int number;
	private String type;
	private String  start ;
	private String dest ;
	private double price ;
		
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
		
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setStart(String start) {
		this.start = start;
	}
	
	public String getStart() {
		return start;
	}
	
	public void setDest(String dest) {
		this.dest = dest;
	}
	
	public String getDest() {
		return dest;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Train(int number, String type, String start, String dest , double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	@Override
	public int compareTo(Train other) {
		if (this.number < other.number) {
	        return 1;
	    } else if (this.number > other.number) {
	        return -1;
	    } else {
	        return 0;
	    }
	}

	@Override
	public String toString() { //有人跟我的 Train 物件要字串時，救回傳以下
	    return String.format("班次:%d, 車種:%s, 起點:%s, 終點:%s, 票價:%.1f", 
	                          number, type, start, dest, price);
	
	}
	

}
