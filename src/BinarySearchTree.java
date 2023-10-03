package BT_SS12;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Hàm duyệt theo thứ tự preorder và hiển thị từng bước
    public void preorderTraversalWithSteps(TreeNode node) {
        if (node != null) {
            // Bước 1: Duyệt cây con bên trái đệ qui
            System.out.println("Bước 1: Duyệt cây con bên trái đệ qui");
            preorderTraversalWithSteps(node.left);

            // Bước 2: Duyệt cây con bên phải đệ qui
            System.out.println("Bước 2: Duyệt cây con bên phải đệ qui");
            preorderTraversalWithSteps(node.right);

            // Bước 3: Truy cập nút gốc
            System.out.println("Bước 3: Truy cập nút gốc: " + node.data);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Thêm các phần tử vào BST
        tree.root = new TreeNode(27);
        tree.root.left = new TreeNode(14);
        tree.root.left.left = new TreeNode(10);
        tree.root.left.right = new TreeNode(19);
        tree.root.right = new TreeNode(35);
        tree.root.right.left = new TreeNode(31);
        tree.root.right.right = new TreeNode(42);

        System.out.println("Duyệt theo thứ tự preorder từ nút gốc (27): ");
        tree.preorderTraversalWithSteps(tree.root);
    }
}