package Task16;

import java.util.Random;

public class ATM implements Runnable{
    private Account account;
    int count = 0;

    public ATM (Account account) {
        this.account = account;
    }

    public void withdraw(int money) {
        if (account.getBalance() < 0) {
            System.out.println("Отрицаельный баланс");
        } else if (account.getBalance() - money < 0) {
            System.out.println("Недостаточно средств для снятия");
        } else {
            account.setBalance(account.getBalance() - money);
            System.out.println("Ваш баланс: " + account.getBalance());
        }
    }

    public void deposit(int money) {
        account.setBalance(account.getBalance() +  money);
        System.out.println("Ваш баланс: " + account.getBalance());
    }




    @Override
    public synchronized void run() {
        while (count < 10) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random rand = new Random();
            int operation = 0;
            operation = rand.nextInt(2) + 1;
            if (operation == 1) {
                withdraw(rand.nextInt(99999) + 1);
                count++;
            } else {
                deposit(rand.nextInt(99999) + 1);
                count++;
            }
        }
    }
}
