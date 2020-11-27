package Task21.Task2;

public class MagicByFactory implements ChairFactory {
    @Override
    public Chair makeNewChair() {
        return new MagicChair();
    }
}
