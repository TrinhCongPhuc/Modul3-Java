package BT_SS12.BT2;

public interface IGeneric<T> {
    void add(T item);
    void update(int id, T newItem);
    void delete(int id);
    void display();
}
