package BT_SS12.BT1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager implements IGeneric<Product> {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    @Override
    public Product getById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void add(Product item) {
        products.add(item);
    }

    @Override
    public void update(int id, Product item) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, item);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    @Override
    public void displayAll() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public void sortByPriceAscending() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
    }

    @Override
    public void sortByPriceDescending() {
        Collections.sort(products, (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
    }
}
