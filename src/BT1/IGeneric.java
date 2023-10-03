package BT_SS12.BT1;
import java.util.List;
public interface IGeneric<T> {
    T getById(int id);
    void add(T item);
    void update(int id, T item);
    void delete(int id);
    void displayAll();
    List<T> searchByName(String name);
    void sortByPriceAscending();
    void sortByPriceDescending();
}
