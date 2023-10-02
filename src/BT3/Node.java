package BT_SS11.BT3;

public class Node<T> {
    T data;
    Node<T> link;

    public Node(T data) {
        this.data = data;
        this.link = null;
    }
}
