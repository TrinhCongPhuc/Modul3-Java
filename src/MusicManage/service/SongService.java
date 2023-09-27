package MusicManage.service;

import MusicManage.model.Singer;
import MusicManage.model.Song;

public class SongService {
    private static final int SO_BAI_HAT_TOI_DA = 100;
    private Song[] danhSachBaiHat;
    private Singer[] singers;
    private int soLuongBaiHat;
    private SingerService singerService;

    public SongService(SingerService singerService) {
        this.danhSachBaiHat = new Song[SO_BAI_HAT_TOI_DA];
        this.soLuongBaiHat = 0;
        this.singerService = singerService; // Truyền đối tượng SingerService từ bên ngoài
    }

    public void themBaiHat() {
        if (soLuongBaiHat >= SO_BAI_HAT_TOI_DA) {
            System.out.println("Đã đạt đến số lượng bài hát tối đa.");
            return;
        }

        Song baiHat = new Song();
        baiHat.nhapBaihat(singerService);

        danhSachBaiHat[soLuongBaiHat] = baiHat;
        soLuongBaiHat++;

        System.out.println("Thêm bài hát thành công.");
    }

    public void hienThiDanhSachBaiHat() {
        if (soLuongBaiHat == 0) {
            System.out.println("Chưa có bài hát nào được lưu trữ.");
            return;
        }

        System.out.println("Danh sách bài hát :");
        for (int i = 0; i < soLuongBaiHat; i++) {
            System.out.println("--------------------");
            danhSachBaiHat[i].hienThiBaihat();
            System.out.println("--------------------");
        }
    }

    public void capNhatBaiHat(String maBaiHat) {
        int viTriBaiHat = timViTriBaiHatTheoMa(maBaiHat);

        if (viTriBaiHat == -1) {
            System.out.println("Không tìm thấy bài hát có mã " + maBaiHat);
            return;
        }

        System.out.println("Thông tin bài hát trước khi cập nhật :");
        danhSachBaiHat[viTriBaiHat].hienThiBaihat();

        System.out.println("Nhập thông tin cập nhật:");
        danhSachBaiHat[viTriBaiHat].nhapBaihat(singerService);

        System.out.println("Cập nhật thông tin bài hát thành công.");
    }

    public void xoaBaiHat(String maBaiHat) {
        int viTriBaiHat = timViTriBaiHatTheoMa(maBaiHat);

        if (viTriBaiHat == -1) {
            System.out.println("Không tìm thấy bài hát có mã " + maBaiHat);
            return;
        }

        for (int i = viTriBaiHat; i < soLuongBaiHat - 1; i++) {
            danhSachBaiHat[i] = danhSachBaiHat[i + 1];
        }

        soLuongBaiHat--;

        System.out.println("Xóa bài hát thành công.");
    }

    private int timViTriBaiHatTheoMa(String maBaiHat) {
        for (int i = 0; i < soLuongBaiHat; i++) {
            if (danhSachBaiHat[i].getMaBaiHat().equals(maBaiHat)) {
                return i;
            }
        }
        return -1;
    }
}