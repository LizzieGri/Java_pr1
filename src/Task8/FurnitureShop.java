package Task8;

public abstract class FurnitureShop {
    private String name;
    private int furnitureCost;

    public FurnitureShop(String name, int furnitureCost) {
        this.name = name;
        this.furnitureCost = furnitureCost;
    }

    public String getName() {
        return name;
    }

    public int getFurnitureCost() {
        return furnitureCost;
    }
}
