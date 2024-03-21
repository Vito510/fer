import java.time.LocalDate;

public class Food extends Item {

    private double weight;
    private LocalDate bestBefore;

    public Food(String SKU, String name, double weight, LocalDate bestBefore) {
        super(SKU, name);
        this.weight = weight;
        this.bestBefore = bestBefore;
    }

    public Food(String SKU, String name, double netSalePrice, double weight, LocalDate bestBefore) {
        super(SKU, name, netSalePrice);
        this.weight = weight;
        this.bestBefore = bestBefore;
    }

    @Override
    public String getItemType() {
        return "Food";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(",weight: %s, bestBefore %s",weight,bestBefore);
    }

    @Override
    public double getVAT() {
        return 0.13;
    }
}
