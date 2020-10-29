package Task16;
import java.util.Random;

public class Person {
    private String name;
    private Account account;
    Random rand = new Random();

    public Person(String name) {
        this.name = name;
        account = new Account();
        this.account.setBalance(rand.nextInt(99999) + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return name;
    }
}
