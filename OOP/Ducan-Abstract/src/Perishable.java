import java.time.LocalDate;

public interface Perishable {
    public LocalDate getBestBefore();
    public void setBestBefore(LocalDate bestBefore);
}
