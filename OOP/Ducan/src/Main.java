import java.time.LocalDate;

public class Main {

    public static double checkout(Item[] items) {
        double suma = 0;

        for (Item i : items) {
            suma += i.getPrice(1);
        }

        return suma;
    }

    public static void main(String[] args) {
        Item i1 = new Item("12ff45","Domacica", 5);
        Item i2 = new Item("1234ff4","Bananko", 5);

        Beverage b1 = new Beverage("78545376","Coca cola", 1, 2);

        System.out.println(i1.toString());
        System.out.println(b1.toString());


        Cloth c1 = new Cloth("43756347","Hlace",32);
        System.out.println(c1);

        Food f1 = new Food("2322332","prsut",2, LocalDate.of(2024,7,31));
        System.out.println(f1);

        System.out.println(f1.getVAT());

        Item pi = f1;
        System.out.println(pi.getVAT());

        AlcoholicBeverage a1 = new AlcoholicBeverage("12463334","Landsky",0.5,4.9);

        System.out.println(a1);

        Object o1 = a1;
        System.out.println(o1);

        Item[] items = new Item[4];

        items[0] = i1;
        items[1] = f1;
        items[2] = a1;
        items[3] = c1;

        System.out.println("Kosara:");
        for (Item i : items) {
            System.out.println(i.toString() + " " + i.getVAT());
        }

        System.out.println("Checkout: " + checkout(items));


    }

}
