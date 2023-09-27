package MusicManage.controller;

import MusicManage.service.SongService;

import java.util.Scanner;

public class SongController {
    private SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    public void hienThiMenuQuanLyBaiHat() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("**********************MENU QUẢN LÝ BÀI HÁT*************************");
            System.out.println("1. Nhập số lượng bài hát cần thêm và nhập thông tin cần thêm mới.");
            System.out.println("2. Hiển thị danh sách tất cả bài hát đã lưu trữ.");
            System.out.println("3. Cập nhật thông tin bài hát theo mã.");
            System.out.println("4. Xóa bài hát theo mã.");
            System.out.println("5. Thoát");
            System.out.print("Mời nhập sự lựa chọn của bạn (số nguyên từ 1-5) : ");

            try {
                int luaChon = scanner.nextInt();
                scanner.nextLine(); // Đọc ký tự newline sau khi đọc số

                switch (luaChon) {
                    case 1:
                        themBaiHat();
                        break;
                    case 2:
                        hienThiDanhSachBaiHat();
                        break;
                    case 3:
                        capNhatBaiHat();
                        break;
                    case 4:
                        xoaBaiHat();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                scanner.nextLine(); // Đọc ký tự newline để tránh lặp vô hạn
            }
        }
    }

    private void themBaiHat() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập số lượng bài hát cần thêm (số nguyên - number) : ");

        try {
            int soLuong = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự newline sau khi đọc số

            for (int i = 0; i < soLuong; i++) {
                System.out.println("Mời nhập thông tin bài hát thứ " + (i + 1) + ":");
                songService.themBaiHat();
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
            scanner.nextLine(); // Đọc ký tự newline để tránh lặp vô hạn
        }
    }

    private void hienThiDanhSachBaiHat() {
        songService.hienThiDanhSachBaiHat();
    }

    private void capNhatBaiHat() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập mã bài hát cần cập nhật (số nguyên - number) : ");
        String maBaiHat = scanner.nextLine();

        try {
            songService.capNhatBaiHat(maBaiHat);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    private void xoaBaiHat() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập mã bài hát cần xóa : ");
        String maBaiHat = scanner.nextLine();

        try {
            songService.xoaBaiHat(maBaiHat);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}