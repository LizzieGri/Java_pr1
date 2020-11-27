package Task21.Task2;

public class VictorianByFactory implements ChairFactory {
    @Override
    public Chair makeNewChair() {
        return new VictorianChair();
    }
}
