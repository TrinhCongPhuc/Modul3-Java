package BT_SS12.BT2;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager implements IGeneric<Product> {
    private List<Product> products = new LinkedList<>(); // Thay ArrayList bằng LinkedList

    // Thêm sản phẩm
    @Override
    public void add(Product product) {
        products.add(product);
    }

    // Sửa thông tin sản phẩm theo id
    @Override
    public void update(int id, Product newItem) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(newItem.getName());
                product.setPrice(newItem.getPrice());
                break;
            }
        }
    }

    // Xoá sản phẩm theo id
    @Override
    public void delete(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    // Hiển thị danh sách sản phẩm
    @Override
    public void display() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Tìm kiếm sản phẩm theo tên
    public void searchProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
            }
        }
    }

    // Sắp xếp sản phẩm tăng dần theo giá
    public void sortProductsAscending() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
    }

    // Sắp xếp sản phẩm giảm dần theo giá
    public void sortProductsDescending() {
        Collections.sort(products, (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
    }
}
