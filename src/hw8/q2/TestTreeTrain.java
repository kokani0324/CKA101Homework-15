package hw8.q2;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeTrain {

    public static void main(String[] args) {
        // 1. 宣告變數建議小寫，且型別宣告為父介面 Set
        Set<Train> set = new TreeSet<>();

        // 2. 直接呼叫 add 方法，不需要接收它的 boolean 回傳值
        set.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        set.add(new Train(1254, "區間", "屏東", "基隆", 700));
        set.add(new Train(118, "自強", "高雄", "台北", 500));
        set.add(new Train(1288, "區間", "新竹", "基隆", 400));
        set.add(new Train(122, "自強", "台中", "花蓮", 600));
        set.add(new Train(1222, "區間", "樹林", "七堵", 300));
        set.add(new Train(1254, "區間", "屏東", "基隆", 700)); // 這筆會因為 compareTo 回傳 0 而被擋掉

        // foreach 
        for (Train t : set) {
            System.out.println(t);
        }
    }
}