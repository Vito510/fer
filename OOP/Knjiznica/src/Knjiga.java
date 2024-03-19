import java.util.ArrayList;

public class Knjiga {


    private final String naslov, autor, ISBN;

    private int count;

    public String toString() {
        return String.format("%s %s %s",naslov,autor,ISBN);
    }

    public String toString(boolean pretty) {
        if (pretty) {
            return String.format("%50s %40s %s",naslov,autor,ISBN);
        } else {
            return this.toString();
        }
    }

    Knjiga(String naslov, String autor, String ISBN, int count) {
        this.naslov = naslov;
        this.autor = autor;
        this.ISBN = ISBN;
        this.count = count;
    }

    public void decrementCount() {
        this.count -= 1;
    }

    public void incrementCount() {
        this.count += 1;
    }

    public int getCount() {
        return count;
    }

    public String getISBN() {
        return ISBN;
    }

    public static Knjiga findKnjiga(ArrayList<Knjiga> knjige, String ISBN) {

        for (Knjiga k : knjige) {
            if (k.ISBN.equals(ISBN)) {
                return k;
            }
        }

        return null;

    }

}
