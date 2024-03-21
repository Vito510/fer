public class Beverage extends Item{
    private double volume;

    public Beverage(String SKU, String name, double volume) {
        super(SKU, name);
        this.volume = volume;
    }

    public Beverage(String SKU, String name, double netSalePrice, double volume) {
        super(SKU, name, netSalePrice);
        this.volume = volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public final String getItemType() {
        return "Beverage";
    }

    @Override
    public String toString() {
        return super.toString() + ", vol: " +this.volume;
    }
}
