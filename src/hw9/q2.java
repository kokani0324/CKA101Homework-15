package hw9;

class Bank {
    private  int BankMoney = 0 ;

    synchronized public void saveMoney(int money) { //synchronized 讓執行緒一次只能有一個在執行
        while(BankMoney>3000) {
            try {
                System.out.println("媽媽看到餘額在3000以上，暫停匯款");
                wait();
                System.out.println("媽媽被熊大要求匯款");
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        BankMoney += money;
        System.out.println("媽媽存了" + money + " 帳戶餘額：" + BankMoney);
        notify();
    }

    synchronized public void noMoney (int money) {
        while (BankMoney<money) {
            System.out.println("雄大看到沒錢，暫停提款");
            try {
                wait();
                System.out.println("雄大被老媽告知帳戶已經有錢了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        BankMoney -= money;

        if (BankMoney < 2000) {
                System.out.println("熊大看到餘額在2000以下，要求匯款");
                System.out.println("熊大領了：" + money + "；帳戶餘額" + BankMoney);

        }else {
                System.out.println("熊大領了：" + money + "；帳戶餘額" + BankMoney);
        }
            notify(); // 隨機叫醒在相同物件上某一個正在waiting的執行緒

    }
}
class Bear extends Thread {
Bank bank ;

    public Bear (Bank bank){
        this.bank= bank ;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            bank.noMoney(1000); // 提款1000元
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
class Mom extends Thread {
    Bank bank ;

    public Mom(Bank bank){
        this.bank= bank ;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            bank.saveMoney(2000); // 匯款2000元
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class q2 {
    public static void main(String[] args) {
        Bank bank = new Bank() ;
        Bear bear = new Bear(bank) ;
        Mom mom = new Mom(bank);
        bear.start();
        mom.start();
    }
}