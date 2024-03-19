import java.time.LocalDate;
import java.util.ArrayList;

public class Posudba {

    static int rd_broj = 0;
    boolean active = false;
    Ucenik posudioc;

    int id;

    ArrayList<Knjiga> knjige;

    LocalDate datum;

    Posudba(Ucenik posudioc, ArrayList<Knjiga> knjige) {

        this.id = Posudba.rd_broj++;
        this.posudioc = posudioc;
        this.knjige = knjige;
        this.datum = LocalDate.now();
        this.active = true;
    }

    public void deactivate() {
        this.active = false;
    }

    public String toString() {
        return String.format("%d %s %s %s",id,datum,posudioc,knjige);
    }
}
