package Task21.Task2;

public class MultyfunctionByFactory implements ChairFactory {
    @Override
    public Chair makeNewChair() {
        return new MultyfunctionChair();
    }
}
