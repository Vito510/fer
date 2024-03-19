import java.util.ArrayList;
import java.util.Scanner;

public class Knjiznica {

    static ArrayList<Knjiga> knjige;
    static ArrayList<Posudba> posudbe;
    static ArrayList<Ucenik> ucenici

    public static void main(String[] args) {

        ucenici = new ArrayList<>();
        knjige = new ArrayList<>();

        ucenici.add(new Ucenik("Ivan", "Horvat", "123", "4e", 5));


        knjige.add(new Knjiga("Zlocin i kazna", "Fjodor Mihajlovič Dostojevski","001",10));

        System.out.println("""
                1 - Posudba
                2 - Vracanje
                3 - Pregled svih ucenika
                4 - Pregled svih knjiga
                5 - Pregled aktivnih posudbi
                6 - Pregled svih posudbi
                7 - Kraj""");

        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();


        switch (option) {
            case 1:
                Posudba p = Posudba();

                if (p != null) {
                    posudbe.add(p);
                }

                break;
            case 3:
                for (Ucenik u : ucenici) {
                    System.out.println(u.toString());
                }
                break;
            case 4:
                System.out.println("WIP");
                break;
            case 4:
                for (Posudba p : posudbe) {
                    posudbe.toString();
                }
            case 7:
                break;

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

            if (k != null) {
                posudeneKnjige.add(k);
            } else {
                System.out.println("Nije pronadena knjiga sa ISBN: "+input[i]);
                return null;
            }
        }

        return new Posudba(u, posudeneKnjige);


    }

}
