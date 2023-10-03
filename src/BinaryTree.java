package BT_SS12;

class Node {
    public int element;
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

// Lớp chứa các phương thức cho việc duyệt theo thứ tự post-order
class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Phương thức đệ qui để thực hiện duyệt theo thứ tự post-order
    private void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        // Duyệt cây con bên trái
        postOrderTraversal(node.left);

        // Duyệt cây con bên phải
        postOrderTraversal(node.right);

        // Truy cập nút gốc
        System.out.print(node.data + " ");
    }

    public void postOrder() {
        postOrderTraversal(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(27);
        tree.root.left = new Node(14);
        tree.root.right = new Node(35);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(19);
        tree.root.right.left = new Node(31);
        tree.root.right.right = new Node(42);

        System.out.println("Duyệt theo thứ tự post-order:");
        tree.postOrder();
    }
}
