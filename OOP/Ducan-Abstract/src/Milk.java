import java.time.LocalDate;

public class Milk extends Beverage implements Perishable {
    private MilkType type;
    private LocalDate bestBefore;

    public Milk(String SKU, String name, double volume, MilkType type) {
        super(SKU, name, volume);
        this.type = type;
    }

    public Milk(String SKU, String name, double netSalePrice, double volume, MilkType type, LocalDate bestBefore) {
        super(SKU, name, netSalePrice, volume);
        this.type = type;
        this.bestBefore = bestBefore;
    }


    @Override
    public String toString() {
        return super.toString() + ", Type: " + this.type;
    }


    @Override
    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }
}
