package Task7;

public class Main {
    public static void main(String[] args) {
        Dog corgi = new Corgi("Korzhik", 5);
        corgi.calcAge();
        ((Corgi)corgi).voice();

        System.out.println("");

        Dog beagle = new Beagle("Diggy", 3);
        beagle.calcAge();
        ((Beagle)beagle).call();
    }
}
