package Bai1_ProductManagement.bussinessImp;

import Bai1_ProductManagement.bussiness.IShop;

import static Bai1_ProductManagement.run.ProductManagement.listCatalog;
import static Bai1_ProductManagement.run.ProductManagement.scanner;

public class Product implements IShop,Comparable<Product> {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;


    public Product() {
    }

    public Product(int productId, String productName, String title, String descriptions, Catalog catalog, float importPrice, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }
    public String getCatalogName() {
        return catalog.getCatalogName();
    }
    @Override
    public void inputData() {
        System.out.println("-------------------------------");
        System.out.println("Mời nhập tên sản phẩm: ");
        this.productName = scanner.nextLine();
        System.out.println("Mời nhập tiêu đề sản phẩm: ");
        this.title = scanner.nextLine();
        System.out.println("Mời nhập mô tả sản phẩm: ");
        this.descriptions = scanner.nextLine();
        for (Catalog catalog:listCatalog) {
            catalog.displayData();
        }
        System.out.println("Mời chọn danh mục theo id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Catalog catalog:listCatalog) {
            if (catalog.getCatalogId()==id){
                setCatalog(catalog);
            }
        }
        System.out.println("Mời nhập giá nhâp: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        this.exportPrice= importPrice*RATE;
        System.out.println("Mời nhập trạng thái sản phẩm: ");
        this.productStatus= Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("=============================================================================");
        System.out.printf("Mã sản phẩm : %s, Tên sản phẩm: %s, Danh mục sản phẩm : %s\n",productId, productName, catalog.getCatalogName());
        System.out.printf("Giá bán : %.1f, Trạng thái sản phẩm : %s%s , ", exportPrice, (productStatus ? "đang bán" : "không bán"), System.lineSeparator());
        System.out.println("============================================================================="); }

    @Override
    public int compareTo(Product o) {
        return Float.compare(this.getExportPrice(), o.getExportPrice());
    }
}
