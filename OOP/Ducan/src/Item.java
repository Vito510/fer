public class Item {

    private final String SKU;
    private String name;
    private double netSalePrice;

    public Item(String SKU, String name) {
        this.SKU = SKU;
        this.name = name;
    }

    public Item(String SKU, String name, double netSalePrice) {
        this(SKU, name);
        this.netSalePrice = netSalePrice;
    }

    public String getSKU() {
        return SKU;
    }

    public double getNetSalePrice() {
        return netSalePrice;
    }

    public void setNetSalePrice(double netSalePrice) {
        this.netSalePrice = netSalePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVAT() {
        return 0.25;
    }

    public String getItemType() {
        return "";
    }

    public double getPrice(int n) {
        return n*netSalePrice*(1+getVAT());
    }

    @Override
    public String toString() {
        return String.format("%-10s : %-20s",SKU,name);
    }


}
