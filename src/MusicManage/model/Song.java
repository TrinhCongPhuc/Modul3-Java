package MusicManage.model;

import MusicManage.service.SingerService;

import java.util.Date;
import java.util.Scanner;

public class Song {
    private String maBaiHat;
    private String tenBaiHat;
    private String moTa;
    private Singer caSi;
    private String nguoiVietBaiHat;
    private Date ngayTao;
    private boolean trangThaiBaiHat;

    public Song() {
        this.maBaiHat = taoMaBaiHat();
        this.ngayTao = new Date();
    }

    public String getMaBaiHat() {
        return maBaiHat;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Singer getCaSi() {
        return caSi;
    }

    public void setCaSi(Singer caSi) {
        this.caSi = caSi;
    }

    public String getNguoiVietBaiHat() {
        return nguoiVietBaiHat;
    }

    public void setNguoiVietBaiHat(String nguoiVietBaiHat) {
        this.nguoiVietBaiHat = nguoiVietBaiHat;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public boolean isTrangThaiBaiHat() {
        return trangThaiBaiHat;
    }

    public void setTrangThaiBaiHat(boolean trangThaiBaiHat) {
        this.trangThaiBaiHat = trangThaiBaiHat;
    }

    private String taoMaBaiHat() {
        String prefix = "B";
        String kiTu = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int viTri = (int) (Math.random() * kiTu.length());
            sb.append(kiTu.charAt(viTri));
        }

        return prefix + sb.toString();
    }

    public void nhapBaihat(SingerService singerService) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập tên bài hát: ");
        tenBaiHat = scanner.nextLine();

        System.out.print("Mời nhập mô tả bài hát: ");
        moTa = scanner.nextLine();

        System.out.print("Mời nhập tên người sáng tác: ");
        nguoiVietBaiHat = scanner.nextLine();

        System.out.println("Danh sách ca sĩ:");
        // Hiển thị danh sách ca sĩ để người dùng chọn
        singerService.hienThiDanhSachCaSi(); // Sử dụng phương thức hienThiDanhSachCaSi() từ SingerService

        // Lấy id của ca sĩ từ người dùng
        System.out.print("Mời nhập id ca sĩ: ");
        int maCaSi = Integer.parseInt(scanner.nextLine());

        // Tìm ca sĩ trong danh sách ca sĩ dựa trên id và gán vào thuộc tính caSi
        caSi = singerService.timCaSiTheoId(maCaSi); // Sử dụng phương thức timCaSiTheoId() từ SingerService

        // Nếu không tìm thấy ca sĩ, yêu cầu người dùng thêm ca sĩ trước
        if (caSi == null) {
            System.out.println("Không tìm thấy ca sĩ có mã " + maCaSi + ". Vui lòng thêm ca sĩ trước.");
            // Thêm mã logic để yêu cầu người dùng thêm ca sĩ ở đây nếu cần
        }
    }

    public void hienThiBaihat() {
        System.out.println("Mã bài hát: " + maBaiHat);
        System.out.println("Tên bài hát: " + tenBaiHat);
        System.out.println("Mô tả: " + moTa);
        System.out.println("Ca sĩ: " + caSi.getTenCaSi());
        System.out.println("Người sáng tác: " + nguoiVietBaiHat);
        System.out.println("Ngày tạo: " + ngayTao);
        System.out.println("Trạng thái: " + (trangThaiBaiHat ? "Hoạt động" : "Không hoạt động"));
    }
}