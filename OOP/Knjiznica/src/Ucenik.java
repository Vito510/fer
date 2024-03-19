import java.util.ArrayList;

public class Ucenik {

    private final String ime, prezime, oib;
    private String razred;
    private int razredBroj;

    private int maxKnjiga;
    private int brojKnjiga;

    Ucenik(String oib, String ime, String prezime, int razredBroj, String razred, int maxKnjiga) {
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
        this.razred = razred;
        this.maxKnjiga = maxKnjiga;
        this.razredBroj = razredBroj;
        this.brojKnjiga = 0;
    }

    public String toString() {
        return String.format("%20s %20s %5s %5s (%d/%d)",ime,prezime,oib, razred, brojKnjiga, maxKnjiga);
    }

    public void setMaxKnjiga(int maxKnjiga) {
        this.maxKnjiga = maxKnjiga;
    }

    public int getMaxKnjiga() {
        return maxKnjiga;
    }

    public int getBrojKnjiga() {
        return brojKnjiga;
    }

    public void incrementBrojKnjiga() {
        this.brojKnjiga++;
    }

    public void decrementBrojKnjiga() {
        this.brojKnjiga--;
    }

    public String getOib() {
        return oib;
    }

    public static Ucenik findUcenik(ArrayList<Ucenik> ucenici, String ISBN) {

        for (Ucenik u : ucenici) {
            if (u.oib.equals(ISBN)) {
                return u;
            }
        }

        return null;

    }
}
