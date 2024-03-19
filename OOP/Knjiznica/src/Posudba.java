import java.time.LocalDate;
import java.util.ArrayList;

public class Posudba {

    static int rd_broj;
    Ucenik posudioc;

    int id;

    ArrayList<Knjiga> knjige;

    LocalDate datum;

    Posudba(Ucenik posudioc, ArrayList<Knjiga> knjige) {
        id = rd_broj++;
        this.posudioc = posudioc;
        this.knjige = knjige;
    }

    public String toString() {
        
    }
}
