public class Home_DanhMucSanPham {
    public static class Category {
        // Thuộc tính của lớp Category
        private String maDanhMuc;
        private String tenDanhMuc;

        // Phương thức khởi tạo không tham số
        public Category() {
            this.maDanhMuc = "";
            this.tenDanhMuc = "";
        }

        // Phương thức khởi tạo với 2 tham số
        public Category(String maDanhMuc, String tenDanhMuc) {
            this.maDanhMuc = maDanhMuc;
            this.tenDanhMuc = tenDanhMuc;
        }

        // Phương thức hiển thị thông tin của danh mục
        public void display() {
            System.out.println("Mã danh mục: " + maDanhMuc);
            System.out.println("Tên danh mục: " + tenDanhMuc);
        }
    }

    public static class Product {
        // Thuộc tính của lớp Product
        private String maSanPham;
        private String tenSanPham;
        private double giaSanPham;
        private Category danhMucSanPham;

        // Phương thức khởi tạo không tham số
        public Product() {
            this.maSanPham = "";
            this.tenSanPham = "";
            this.giaSanPham = 0.0;
            this.danhMucSanPham = new Category();
        }

        // Phương thức khởi tạo với 4 tham số
        public Product(String maSanPham, String tenSanPham, double giaSanPham, Category danhMucSanPham) {
            this.maSanPham = maSanPham;
            this.tenSanPham = tenSanPham;
            this.giaSanPham = giaSanPham;
            this.danhMucSanPham = danhMucSanPham;
        }

        // Phương thức hiển thị thông tin của sản phẩm
        public void display() {
            System.out.println("Mã sản phẩm: " + maSanPham);
            System.out.println("Tên sản phẩm: " + tenSanPham);
            System.out.println("Giá sản phẩm: " + giaSanPham);
            System.out.println("Danh mục sản phẩm:");
            danhMucSanPham.display();
            System.out.println("");
        }

        public static void main(String[] args) {
            // Tạo một đối tượng Category
            Category danhMuc1 = new Category("DM001", "Hàng Bán Chạy");
            Category danhMuc2 = new Category("DM002", "Sản Phẩm Mới");


            // Tạo một đối tượng Product và liên kết với danh mục
            Product sanPham1 = new Product("SP001", "iPhone 12", 1000.0, danhMuc1);
            Product sanPham2 = new Product("SP002", "iPhone 12Pro", 1200.0, danhMuc1);
            Product sanPham3 = new Product("SP003", "iPhone 15", 1200.0, danhMuc2);
            Product sanPham4 = new Product("SP004", "iPhone 15Pro", 1200.0, danhMuc1);

            // Hiển thị thông tin của sản phẩm
            System.out.println("Tất cả các sản phẩm");
            System.out.println("");
            sanPham1.display();
            sanPham2.display();
            sanPham3.display();
            sanPham4.display();
        }
    }
}
