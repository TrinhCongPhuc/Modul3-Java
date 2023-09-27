package MusicManage.service;

import MusicManage.model.Singer;

import java.util.Scanner;

public class SingerService {
    private static final int SO_LUONG_TOI_DA = 100;
    private Singer[] caSis;
    private int soLuongCaSi;

    public SingerService() {
        this.caSis = new Singer[SO_LUONG_TOI_DA];
        this.soLuongCaSi = 0;
    }

    public void themCaSi() {
        if (soLuongCaSi >= SO_LUONG_TOI_DA) {
            System.out.println("Đã đạt đến số lượng ca sĩ tối đa.");
            return;
        }

        Singer caSi = new Singer();
        caSi.nhapDuLieu();

        caSis[soLuongCaSi] = caSi;
        soLuongCaSi++;

        System.out.println("Thêm ca sĩ thành công.");
    }

    public void hienThiDanhSachCaSi() {
        if (soLuongCaSi == 0) {
            System.out.println("Chưa có ca sĩ nào được lưu trữ.");
            return;
        }

        System.out.println("Danh sách ca sĩ :");
        for (int i = 0; i < soLuongCaSi; i++) {
            System.out.println("--------------------");
            caSis[i].hienThiDuLieu();
            System.out.println("--------------------");
        }
    }

    public Singer timCaSiTheoId(int maCaSi) {
        for (int i = 0; i < soLuongCaSi; i++) {
            if (caSis[i].getMaCaSi() == maCaSi) {
                return caSis[i];
            }
        }
        return null; // Trả về null nếu không tìm thấy ca sĩ có mã tương ứng
    }

    public void capNhatCaSi(int maCaSi) {
        int viTriCaSi = timViTriCaSiTheoMa(maCaSi);

        if (viTriCaSi == -1) {
            System.out.println("Không tìm thấy ca sĩ có mã " + maCaSi);
            return;
        }

        System.out.println("Thông tin ca sĩ trước khi cập nhật :");
        caSis[viTriCaSi].hienThiDuLieu();

        System.out.println("Nhập thông tin cập nhật :");
        caSis[viTriCaSi].nhapDuLieu();

        System.out.println("Cập nhật thông tin ca sĩ thành công.");
    }

    public void xoaCaSi(int maCaSi) {
        int viTriCaSi = timViTriCaSiTheoMa(maCaSi);

        if (viTriCaSi == -1) {
            System.out.println("Không tìm thấy ca sĩ có mã " + maCaSi);
            return;
        }

        for (int i = viTriCaSi; i < soLuongCaSi - 1; i++) {
            caSis[i] = caSis[i + 1];
        }

        soLuongCaSi--;

        System.out.println("Xóa ca sĩ thành công.");
    }

    private int timViTriCaSiTheoMa(int maCaSi) {
        for (int i = 0; i < soLuongCaSi; i++) {
            if (caSis[i].getMaCaSi() == maCaSi) {
                return i;
            }
        }
        return -1;
    }
}