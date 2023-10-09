package Bai1_ProductManagement.bussinessImp;

import Bai1_ProductManagement.bussiness.IShop;

import static Bai1_ProductManagement.run.ProductManagement.scanner;

public class Catalog implements IShop {
    private int catalogId;
    private String catalogName;
    private int priority;
    private String descriptions;
    private boolean catalogStatus;

    public Catalog() {
    }

    public Catalog(int catalogId, String catalogName, int priority, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData() {
        System.out.println("-------------------------------");
        System.out.println("Mời nhập tên danh mục sản phẩm: ");
        this.catalogName = scanner.nextLine();
        System.out.println("Mời nhập độ tên ưu tiên: ");
        this.priority = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập mô tả danh mục: ");
        this.descriptions = scanner.nextLine();
        System.out.println("Mời nhập trạng thái danh mục: ");
        this.catalogStatus = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.printf("Mã danh mục là: %d, Tên danh mục: %s%n", catalogId, catalogName);
    }
}
