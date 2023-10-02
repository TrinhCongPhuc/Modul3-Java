package BT_SS11.BT3;

public class Queue<T> implements IGeneric<T> {
    Node<T> front;
    Node<T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    @Override
    public void enQueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            rear.link = front;
        } else {
            rear.link = newNode;
            rear = newNode;
            rear.link = front;
        }
        System.out.println(data + " được thêm vào hàng đợi.");
    }

    @Override
    public T deQueue() {
        if (isEmpty()) {
            System.out.println("Hàng đợi trống.");
            return null;
        } else {
            T data = front.data;
            if (front == rear) {
                front = null;
                rear = null;
            } else {
                front = front.link;
                rear.link = front;
            }
            System.out.println(data + " được lấy ra khỏi hàng đợi.");
            return data;
        }
    }

    @Override
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Hàng đợi trống.");
        } else {
            Node<T> current = front;
            System.out.print("Hàng đợi: ");
            do {
                System.out.print(current.data + " ");
                current = current.link;
            } while (current != front);
            System.out.println();
        }
    }

    private boolean isEmpty() {
        return (front == null && rear == null);
    }
}
