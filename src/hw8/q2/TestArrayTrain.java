package hw8.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections; // 排序工具

//請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
public class TestArrayTrain {
	public static void main(String[] args) {
		
		List<Train> list = new ArrayList<Train>(); //建立ArrayList 底下新增物件
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		
		Collections.sort(list); //排序
		
		for (int i = 0; i < list.size(); i++) {
		    Train train = list.get(i);
		    System.out.println(train); // 呼叫 Train物件的字串，就回傳toString的內容，toString預設是 類別名稱 + 記憶體位址
		}
	}
}
