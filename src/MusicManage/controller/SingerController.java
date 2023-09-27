package MusicManage.controller;

import MusicManage.model.Song;
import MusicManage.service.SingerService;

import java.util.Scanner;

public class SingerController {
    private SingerService singerService;

    public SingerController(SingerService singerService) {
        this.singerService = singerService;
    }

    public void hienThiMenuQuanLyCaSi() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("**********************MENU QUẢN LÝ CA SĨ*************************");
            System.out.println("1. Nhập thông tin ca sĩ mới.");
            System.out.println("2. Hiển thị danh sách tất cả ca sĩ đã lưu trữ.");
            System.out.println("3. Cập nhật thông tin ca sĩ theo mã.");
            System.out.println("4. Xóa ca sĩ theo mã.");
            System.out.println("5. Thoát");
            System.out.print("Mời nhập lựa chọn (số nguyên từ 1-5) : ");
            int luaChon = 0;

            try {
                luaChon = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                scanner.nextLine(); // Đọc bỏ dòng không hợp lệ
                continue;
            }

            switch (luaChon) {
                case 1:
                    themCaSi();
                    break;
                case 2:
                    hienThiDanhSachCaSi();
                    break;
                case 3:
                    capNhatCaSi();
                    break;
                case 4:
                    xoaCaSi();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private void themCaSi() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập số lượng ca sĩ cần thêm (số nguyên - number) : ");
        int soLuong = 0;

        try {
            soLuong = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Số lượng không hợp lệ. Nhập số nguyên.");
            scanner.nextLine(); // Đọc bỏ dòng không hợp lệ
            return;
        }

        scanner.nextLine();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Mời nhập thông tin ca sĩ thứ " + (i + 1) + ":");
            singerService.themCaSi();
        }
    }

    private void hienThiDanhSachCaSi() {
        singerService.hienThiDanhSachCaSi();
    }

    private void capNhatCaSi() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập mã ca sĩ cần cập nhật (số nguyên - number): ");
        int maCaSi = 0;

        try {
            maCaSi = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Mã ca sĩ không hợp lệ. Nhập số nguyên.");
            scanner.nextLine(); // Đọc bỏ dòng không hợp lệ
            return;
        }

        singerService.capNhatCaSi(maCaSi);
    }

    private void xoaCaSi() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập mã ca sĩ cần xóa (số nguyên - number): ");
        int maCaSi = 0;

        try {
            maCaSi = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Mã ca sĩ không hợp lệ. Nhập số nguyên.");
            scanner.nextLine(); // Đọc bỏ dòng không hợp lệ
            return;
        }

        singerService.xoaCaSi(maCaSi);
    }
}