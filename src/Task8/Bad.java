package Task8;

public class Bad extends FurnitureShop {
    public Bad(String name, int furnitureCost) {
        super(name, furnitureCost);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getFurnitureCost() {
        return super.getFurnitureCost();
    }
}
