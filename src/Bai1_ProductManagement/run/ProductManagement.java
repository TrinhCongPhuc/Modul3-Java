package Bai1_ProductManagement.run;

import Bai1_ProductManagement.bussinessImp.Catalog;
import Bai1_ProductManagement.bussinessImp.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static List<Catalog> listCatalog = new ArrayList<>();
    public static List<Product> listProduct = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************\n" +
                        "1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục\n" +
                        "2. Nhập số sản phẩm và nhập thông tin các sản phẩm\n" +
                        "3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator)\n" +
                        "4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm\n" +
                        "5. Thoát");
                System.out.println("Mời nhập lựa chọn chức năng (vui lòng chọn số nguyên dương từ 1 - 5: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        createCatalog();
                        break;
                    case 2:
                        createProduct();
                        break;
                    case 3:
                        sortProductWithPrice();
                        break;
                    case 4:
                        searchByProductName();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập một số nguyên dương từ 1 đến 5.");
            } catch (Exception e) {
                System.out.println("Đã xảy ra lỗi: " + e.getMessage());
            }
        }
    }

    private static void searchByProductName() {
        System.out.println("------------------------------");
        System.out.println("Mời nhập tên danh mục muốn tìm kiếm: ");
        String search = scanner.nextLine();
        List<Product> listSearch = new ArrayList<>();

        for (Product product : listProduct) {
            if (product.getCatalogName().equalsIgnoreCase(search)) {
                listSearch.add(product);
            }
        }

        if (listSearch.isEmpty()) {
            System.out.println("Không tìm thấy sản phẩm trong danh mục bạn muốn tìm kiếm.");
        } else {
            System.out.println("Sản phẩm trong danh mục '" + search + "':");
            for (Product product : listSearch) {
                product.displayData();
            }
        }
    }

    private static void sortProductWithPrice() {
        Collections.sort(listProduct, (product1, product2) -> Float.compare(product1.getExportPrice(), product2.getExportPrice()));
        System.out.println("Danh sách sản phẩm sau khi sắp xếp theo giá tăng dần:");
        for (Product product : listProduct) {
            product.displayData();
        }
    }


    private static void createProduct() {
        System.out.println("----------------------");
        System.out.print("Mời nhập số sản phẩm muốn thêm: ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            Product product = new Product();
            product.inputData();
            if (listProduct.size()==0){
                product.setProductId(1);
            }else {
                product.setProductId(listProduct.get(listProduct.size()-1).getProductId()+1);
            }
            listProduct.add(product);

        }
    }

    private static void createCatalog() {
        System.out.println("----------------------------------");
        System.out.println("Mời nhập số danh mục muốn thêm: ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            Catalog catalog = new Catalog();
            catalog.inputData();
            if (listCatalog.size()==0){
                catalog.setCatalogId(1);
            }else {
                catalog.setCatalogId(listCatalog.get(listCatalog.size()-1).getCatalogId()+1);
            }
            listCatalog.add(catalog);
        }
    }
}
