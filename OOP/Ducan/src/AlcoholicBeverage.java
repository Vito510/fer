public class AlcoholicBeverage extends Beverage {

    private double alcPercent;

    public AlcoholicBeverage(String SKU, String name, double volume, double alcPercent) {
        super(SKU, name, volume);
        this.alcPercent = alcPercent;
    }

    public AlcoholicBeverage(String SKU, String name, double netSalePrice, double volume, double alcPercent) {
        super(SKU, name, netSalePrice, volume);
        this.alcPercent = alcPercent;
    }

    @Override
    public String getItemType() {
        return "Aint gonna work";
    }

    @Override
    public String toString() {
        return super.toString() + ", alc%: " + alcPercent;
    }
}
