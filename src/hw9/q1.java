package hw9;


import static java.lang.Thread.sleep;

public class q1 implements Runnable{
    String name ;
    public q1(String playerName) {
       name = playerName ;
    }

    public void run() {
        int n = 1;
        int randomNum = 0 ;

        while (n <= 10) {

            System.out.println(name+"吃第 " + n + " 碗飯");
            try {
                randomNum = (int) (Math.random()*2501)+500;
                sleep(randomNum);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            n++;
        }
        System.out.println(name + "吃完了！");
    }
    public static void main(String arg[]) {
        q1 player1 = new q1("饅頭人");
        Thread t1 = new Thread(player1);

        q1 player2 = new q1("詹姆士");
        Thread t2 = new Thread(player2);

        System.out.println("-----大胃王快食比賽開始！-----");

        t1.start(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
        t2.start();

        try {
            t1.join(); // 裁判：我要等 t1 (饅頭人) 吃完才離開這行
            t2.join(); // 裁判：我也要等 t2 (詹姆士) 吃完才離開這行
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("-----大胃王快食比賽結束！-----");
    }
}
