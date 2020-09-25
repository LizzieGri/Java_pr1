package Task7;

public class Beagle extends Dog {
    String name;
    int age;
    int humanAge;

    public Beagle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void calcAge() {
        humanAge = age * 7;
        System.out.println("Age of my beagle is " + humanAge);
    }

    public void call() {
        System.out.println(name + "!!!!!!");
    }
}
