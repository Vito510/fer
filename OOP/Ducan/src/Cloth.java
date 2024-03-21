public class Cloth extends Item {

    private final int size;

    public Cloth(String SKU, String name, int size) {
        super(SKU, name);
        this.size = size;
    }

    public Cloth(String SKU, String name, double netSalePrice, int size) {
        super(SKU, name, netSalePrice);
        this.size = size;
    }

    @Override
    public String getItemType() {
        return "Clothing";
    }

    @Override
    public String toString() {
        return super.toString() + ", size: " + size;
    }
}
