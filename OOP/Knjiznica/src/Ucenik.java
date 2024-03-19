import java.util.ArrayList;

public class Ucenik {

    private String ime, prezime, oib, razred;

    private int max_posudba;

    Ucenik(String ime, String prezime, String oib, String razred, int max_posudba) {
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
        this.razred = razred;
        this.max_posudba = max_posudba;
    }

    public String toString() {
        return String.format("%s %s %s %s",ime,prezime,oib, razred);
    }

    public void setMax_posudba(int max_posudba) {
        this.max_posudba = max_posudba;
    }

    public int getMax_posudba() {
        return max_posudba;
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
