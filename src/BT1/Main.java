package BT_SS12.BT1;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        // Thêm sản phẩm
        productManager.add(new Product(1, "Laptop", 1000.0));
        productManager.add(new Product(2, "Smartphone", 500.0));
        productManager.add(new Product(3, "Tablet", 300.0));

        // Hiển thị danh sách sản phẩm
        System.out.println("Danh sách sản phẩm:");
        productManager.displayAll();

        // Sửa thông tin sản phẩm theo id
        productManager.update(2, new Product(2, "Updated Smartphone", 550.0));

        // Hiển thị danh sách sản phẩm sau khi sửa
        System.out.println("\nDanh sách sản phẩm sau khi sửa:");
        productManager.displayAll();

        // Xoá sản phẩm theo id
        productManager.delete(1);

        // Hiển thị danh sách sản phẩm sau khi xoá
        System.out.println("\nDanh sách sản phẩm sau khi xoá:");
        productManager.displayAll();

        // Tìm kiếm sản phẩm theo tên
        List<Product> searchResult = productManager.searchByName("Tablet");
        System.out.println("\nKết quả tìm kiếm:");
        for (Product product : searchResult) {
            System.out.println(product);
        }

        // Sắp xếp sản phẩm tăng dần theo giá
        productManager.sortByPriceAscending();
        System.out.println("\nDanh sách sản phẩm sau khi sắp xếp tăng dần theo giá:");
        productManager.displayAll();

        // Sắp xếp sản phẩm giảm dần theo giá
        productManager.sortByPriceDescending();
        System.out.println("\nDanh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
        productManager.displayAll();
    }
}
