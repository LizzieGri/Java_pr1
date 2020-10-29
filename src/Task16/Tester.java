package Task16;

public class Tester {
    public static void main(String[] args) {
        Person person=new Person("Paul");
        ATM firstATM=new ATM(person.getAccount());
        ATM secondATM=new ATM(person.getAccount());
        ATM thirdATM=new ATM(person.getAccount());
        Thread fATM = new Thread(firstATM,"First ATM");
        Thread sATM = new Thread(secondATM,"Second ATM");
        Thread tATM = new Thread(thirdATM,"Third ATM");
        fATM.start();
        sATM.start();
        tATM.start();
    }
}
