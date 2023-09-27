package BookManage.ra.bussiness;

import java.util.Scanner;

public class Book {
    private static int nextBookId = 1;
    private int bookId;
    private String tenSach;
    private String tacGia;
    private String moTa;
    private double giaNhap;
    private double giaXuat;
    private float loiNhuan;
    private boolean tinhTrangSach;

    public Book() {
        this.bookId = nextBookId++;
        this.tinhTrangSach = true;
    }

    public int layMaSach() {
        return bookId;
    }

    public String layTenSach() {
        return tenSach;
    }

    public void ganTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String layTacGia() {
        return tacGia;
    }

    public void ganTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String layMoTa() {
        return moTa;
    }

    public void ganMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double layGiaNhap() {
        return giaNhap;
    }

    public void ganGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double layGiaXuat() {
        return giaXuat;
    }

    public void ganGiaXuat(double giaXuat) {
        this.giaXuat = giaXuat;
    }

    public float layLoiNhuan() {
        return loiNhuan;
    }

    public boolean layTinhTrangSach() {
        return tinhTrangSach;
    }

    public void ganTinhTrangSach(boolean tinhTrangSach) {
        this.tinhTrangSach = tinhTrangSach;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Mời nhập tên sách (Chuỗi - String) :");
            this.tenSach = scanner.nextLine();
            System.out.println("Mời nhập tên tác giả (Chuỗi - String): ");
            this.tacGia = scanner.nextLine();
            System.out.println("Mời nhập mô tả sách từ 6 ký tự trở lên (Chuỗi - String) : ");
            this.moTa = scanner.nextLine();
            while (this.moTa.length() < 6) {
                System.out.println("Mô tả phải có từ 6 ký tự trở lên. Mời nhập lại mô tả (Chuỗi - String) : ");
                this.moTa = scanner.nextLine();
            }
            System.out.println("Mời nhập giá nhập sách là số nguyên lớn hơn 0 (số nguyên - number): ");
            this.giaNhap = scanner.nextDouble();
            while (this.giaNhap <= 0) {
                System.out.println("Giá nhập sách phải lớn hơn 0. Mời nhập lại giá nhập (số nguyên - number) :");
                this.giaNhap = scanner.nextDouble();
            }
            System.out.println("Mời nhập giá bán sách với giá lớn hơn 1.2 lần giá nhập (số nguyên - number) :");
            this.giaXuat = scanner.nextDouble();
            while (this.giaXuat <= 1.2 * this.giaNhap) {
                System.out.println("Giá bán sách phải lớn hơn 1.2 lần giá nhập. Mời nhập lại giá xuất (số nguyên - number):");
                this.giaXuat = scanner.nextDouble();
            }
            this.loiNhuan = (float) (this.giaXuat - this.giaNhap);
        } catch (Exception e) {
            System.out.println("Lỗi nhập thông tin sách: " + e.getMessage());
            scanner.nextLine();
        }
    }

    public void hienThiThongTin() {
        System.out.printf("-Mã sách : %d\t -Tên sách : %s\t -Tác giả : %s\t -Mô tả : %s\n", + bookId, tenSach, tacGia, moTa );
        System.out.printf("-Giá nhập : %f\t -Giá xuất : %f\t -Lợi nhuận : %f\t -Trạng thái : %b\n", + giaNhap, giaXuat, loiNhuan, (tinhTrangSach ? "Còn hàng" : "Hết hàng"));
        System.out.println();
    }
}

