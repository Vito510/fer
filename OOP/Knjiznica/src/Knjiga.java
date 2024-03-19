import java.util.ArrayList;

public class Knjiga {


    private final String naslov, autor, ISBN;

    private int count;

    public String toString() {
        return String.format("%s %s %s (%d)",naslov,autor,ISBN,count);
    }

    Knjiga(String ime, String autor, String ISBN, int count) {
        this.naslov = ime;
        this.autor = autor;
        this.ISBN = ISBN;
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;
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
