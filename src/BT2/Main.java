package BT_SS12.BT2;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        manager.add(new Product(1, "Laptop", 1000.0));
        manager.add(new Product(2, "Phone", 500.0));
        manager.add(new Product(3, "Tablet", 300.0));

        System.out.println("Danh sách sản phẩm ban đầu:");
        manager.display();
        System.out.println(" ");

        System.out.println("Sửa thông tin sản phẩm theo id:");
        manager.update(2, new Product(2, "New Phone", 600.0));
        manager.display();
        System.out.println(" ");

        System.out.println("Xoá sản phẩm theo id:");
        manager.delete(1);
        manager.display();
        System.out.println(" ");

        System.out.println("Tìm kiếm sản phẩm theo tên:");
        manager.searchProductByName("Tablet");
        System.out.println(" ");

        System.out.println("Sắp xếp sản phẩm tăng dần theo giá:");
        manager.sortProductsAscending();
        manager.display();
        System.out.println(" ");

        System.out.println("Sắp xếp sản phẩm giảm dần theo giá:");
        manager.sortProductsDescending();
        manager.display();
        System.out.println(" ");
    }
}
