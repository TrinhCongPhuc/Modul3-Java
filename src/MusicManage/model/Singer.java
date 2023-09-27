package MusicManage.model;

import java.util.Scanner;

public class Singer {
    private static int maCaSiTiepTheo = 1;

    private int maCaSi;
    private String tenCaSi;
    private int tuoi;
    private String quocTich;
    private boolean gioiTinh;
    private String theLoai;

    public Singer() {
        this.maCaSi = maCaSiTiepTheo++;
    }

    public int getMaCaSi() {
        return maCaSi;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên ca sĩ: ");
        tenCaSi = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập quốc tịch: ");
        quocTich = scanner.nextLine();

        System.out.print("Nhập giới tính (Nam: true, Nữ: false): ");
        gioiTinh = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Nhập thể loại: ");
        theLoai = scanner.nextLine();
    }

    public void hienThiDuLieu() {
        System.out.printf("Mã ca sĩ : %d\t Tên ca sĩ : %s\t Tuổi : %d\t Quốc tịch : %s\t Giới tính : %b\t Thể loại : %s\t", +maCaSi, tenCaSi, tuoi, quocTich, (gioiTinh? "Nam" : "Nữ"), theLoai);
    }
}