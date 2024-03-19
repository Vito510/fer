import java.util.ArrayList;
import java.util.Scanner;

public class Knjiznica {

    static ArrayList<Knjiga> knjige;
    static ArrayList<Posudba> posudbe;
    static ArrayList<Ucenik> ucenici;

    public static void main(String[] args) {

        ucenici = new ArrayList<>();
        knjige = new ArrayList<>();
        posudbe = new ArrayList<>();

        ucenici.add(new Ucenik("Ivan", "Horvat", "123", "4e", 5));
        ucenici.add(new Ucenik("Ivan", "Cuic", "111", "4e", 1));


        knjige.add(new Knjiga("Zlocin i kazna", "Fjodor Mihajlovič Dostojevski","001",10));
        knjige.add(new Knjiga("1984", "George Orwell","002",1));
        knjige.add(new Knjiga("Zivotinjska farma", "George Orwell","003",0));


        Scanner sc = new Scanner(System.in);


        boolean loop = true;

        while (loop) {

            System.out.println("""
                1 - Posudba
                2 - Vracanje
                3 - Pregled svih ucenika
                4 - Pregled svih knjiga
                5 - Pregled aktivnih posudbi
                6 - Pregled svih posudbi
                7 - Kraj""");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    Posudba p = Posudba();

                    if (p != null) {
                        posudbe.add(p);
                    }

                    break;

                case 2:
                    Vrati(posudbe);
                    break;
                case 3:
                    for (Ucenik u : ucenici) {
                        System.out.println(u.toString());
                    }
                    break;
                case 4:
                    for (Knjiga k : knjige) {
                        System.out.println(k.toString(true) + " (" + k.getCount() + ") kom");
                    }
                    break;
                case 5:
                    for (Posudba po : posudbe) {

                        if (po.active) {
                            System.out.println(po.toString());
                        }

                    }
                    break;
                case 6:
                    for (Posudba po : posudbe) {

                        if (po.active) {
                            System.out.println("ACTIVE   "+po.toString());
                        } else {
                            System.out.println("INACTIVE "+po.toString());
                        }


                    }
                    break;
                case 7:
                    loop = false;
                    return;

            }

            System.out.print("Pritisni ENTER za povratak");
            sc = new Scanner(System.in);
            sc.nextLine();
        }




    }

    static Posudba Posudba() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite OIB ucenika te ISBN-ove knjiga odvojenih zarezom:");

        String[] input = sc.nextLine().split(" ");

        if (input.length < 2) {
            System.out.println("Neispravan upis");
            return null;
        }


        Ucenik u = Ucenik.findUcenik(ucenici, input[0]);

        if (u == null) {
            System.out.println("Ucenik nije pronaden!");
            return null;
        }


        ArrayList<Knjiga> posudeneKnjige = new ArrayList<>();

        for (int i = 1; i < input.length; i++) {
            Knjiga k = Knjiga.findKnjiga(knjige, input[i]);

            if (k == null) {
                System.out.println("Nije pronadena knjiga sa ISBN: "+input[i]);
                return null;
            } else if (u.getBrojKnjiga()+input.length-1 > u.getMaxKnjiga()) {
                System.out.println("Ucenik je posudio maksimalan broj knjiga, molimo vratite knjige ili posudite manje");
                return null;
            } else if (k.getCount() == 0) {
                System.out.println("Nema vise ove knjige na stazu: "+input[i]);
            } else {
                k.decrementCount();
                u.incrementBrojKnjiga();
                posudeneKnjige.add(k);
            }
        }

        System.out.println("Posudeno "+ posudeneKnjige.size()+ " knjiga");

        return new Posudba(u, posudeneKnjige);


    }

    static void Vrati(ArrayList<Posudba> posudbe) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi oib ucenika:");

        String oib = sc.nextLine();

        int count = 0;
        int bookCount = 0;

        ArrayList<Posudba> toRemove = new ArrayList<>();

        for (Posudba p : posudbe) {

            if (p.posudioc.getOib().equals(oib) && p.active) {
                toRemove.add(p);
                count++;
                bookCount += p.knjige.size();
            }

        }

        for (Posudba p : toRemove) {
            p.deactivate();
        }

        if (count == 0) {
            System.out.println("Ucenik s oibom nepostoji ili nema posudbi");
        } else {
            System.out.printf("Vraceno %d posudbi, koje se sastoje od %d knjiga\n",count, bookCount);
        }


    }

}
