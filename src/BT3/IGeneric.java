package BT_SS11.BT3;

public interface IGeneric<T> {
    void enQueue(T data);
    T deQueue();
    void displayQueue();
}
