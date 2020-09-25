package Task7;

public class Corgi extends Dog{
    String name;
    int age;
    int humanAge;

    public Corgi(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void calcAge() {
        humanAge = age * 7;
        System.out.println("Age of my corgi is " + humanAge);
    }

    public void voice() {
        System.out.println("woof - woof - woof");
    }
}
