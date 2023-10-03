package BT_SS12;

class Node1 {
    int element;
    Node left;
    Node right;

    public Node1(int element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }
}

public class MyBinarySearchTree {
    Node root;

    public MyBinarySearchTree() {
        root = null;
    }

    public boolean search(int element) {
        return searchRecursive(root, element);
    }

    private boolean searchRecursive(Node current, int element) {
        if (current == null) {
            return false;
        }

        if (element == current.element) {
            return true;
        }

        if (element < current.element) {
            return searchRecursive(current.left, element);
        } else {
            return searchRecursive(current.right, element);
        }
    }

    public void insert(int element) {
        root = insertRecursive(root, element);
    }

    private Node insertRecursive(Node current, int element) {
        if (current == null) {
            return new Node(element);
        }

        if (element < current.element) {
            current.left = insertRecursive(current.left, element);
        } else if (element > current.element) {
            current.right = insertRecursive(current.right, element);
        }

        return current;
    }

    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();

        // Thêm các phần tử vào cây
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Tìm kiếm các phần tử trong cây
        System.out.println(bst.search(50)); // true
        System.out.println(bst.search(20)); // true
        System.out.println(bst.search(45)); // false
    }
}
