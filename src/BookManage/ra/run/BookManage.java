package BookManage.ra.run;

import BookManage.ra.bussiness.Book;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BookManage {
    private static final int SO_SACH_TOI_DA = 20;
    private static Book[] sach = new Book[SO_SACH_TOI_DA];
    private static int soLuongSach = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println(" ");
            System.out.println("****************MENU QUẢN LÝ SÁCH***************");
            System.out.println(" ");
            System.out.println("1. Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách");
            System.out.println("2. Hiển thị thông tin tất cả sách trong thư viện");
            System.out.println("3. Sắp xếp sách theo lợi nhuận tăng dần");
            System.out.println("4. Xóa sách theo mã sách");
            System.out.println("5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả");
            System.out.println("6. Thay đổi thông tin sách theo mã sách");
            System.out.println("7. Thoát");
            System.out.println("Mời nhập lựa chọn (nhập số nguyên từ 1-7 : ");
            try {
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    themSachMoi(scanner);
                    break;
                case 2:
                    hienThiTatCaSach();
                    break;
                case 3:
                    sapXepSach();
                    break;
                case 4:
                    xoaSach(scanner);
                    break;
                case 5:
                    timKiemSach(scanner);
                    break;
                case 6:
                    chinhSuaSach(scanner);
                    break;
                case 7:
                    System.out.println("Thoát khỏi chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ. Vui lòng chọn lại.");
            }
            }catch (Exception e) {
                    System.out.println("Lỗi lựa chọn chức năng: " + e.getMessage());

                    luaChon = 7; // Đặt lựa chọn thành 0 để tạo vòng lặp tiếp theo
                }

        } while (luaChon != 7);
    }

    private static void themSachMoi(Scanner scanner) {
        System.out.print("Nhập số lượng sách cần thêm: ");
        int soLuongSachMoi = scanner.nextInt();
        scanner.nextLine();

        if (soLuongSach + soLuongSachMoi > SO_SACH_TOI_DA) {
            System.out.println("Không thể thêm nhiều sách hơn. Đã đạt công suất tối đa.");
            return;
        }

        for (int i = 0; i < soLuongSachMoi; i++) {
            Book sachMoi = new Book();
            System.out.println("Nhập thông tin cho Sách " + "0"+(i + 1) + ":");
            sachMoi.nhapThongTin();
            sach[soLuongSach] = sachMoi;
            soLuongSach++;
        }

        System.out.println("Thêm " + soLuongSachMoi + " sách thành công");
    }

    private static void hienThiTatCaSach() {
        if (soLuongSach == 0) {
            System.out.println("Không có sách trong thư viện.");
            return;
        }

        System.out.println("Danh sách sách trong thư viện:");
        for (int i = 0; i < soLuongSach; i++) {
            System.out.println("------------------");
            sach[i].hienThiThongTin();
        }
    }

    private static void sapXepSach() {
        if (soLuongSach == 0) {
            System.out.println("Không có sách trong thư viện.");
            return;
        }

        Arrays.sort(sach, 0, soLuongSach, (sach1, sach2) -> Float.compare(sach1.layLoiNhuan(), sach2.layLoiNhuan()));

        System.out.println("Sách được sắp xếp theo lợi nhuận tăng dần:");
        for (int i = 0; i < soLuongSach; i++) {
            System.out.println("------------------");
            sach[i].hienThiThongTin();
        }
    }

    private static void xoaSach(Scanner scanner) {
        if (soLuongSach == 0) {
            System.out.println("Không có sách trong thư viện.");
            return;
        }

        System.out.print("Nhập mã sách cần xoá: ");
        int maSach = scanner.nextInt();
        scanner.nextLine();

        int viTriSach = timViTriSachTheoMa(maSach);
        if (viTriSach == -1) {
            System.out.println("Không tìm thấy sách trong thư viện.");
            return;
        }

        for (int i = viTriSach; i < soLuongSach - 1; i++) {
            sach[i] = sach[i + 1];
        }

        soLuongSach--;
        System.out.println("Sách có mã " + maSach + " đã xoá thành công.");
    }

    private static void timKiemSach(Scanner scanner) {
        if (soLuongSach == 0) {
            System.out.println("Không có sách trong thư viện.");
            return;
        }

        String truyVan = "";
        while (truyVan.isEmpty()) {
            System.out.print("Nhập truy vấn tìm kiếm (tên hoặc mô tả): ");
            truyVan = scanner.nextLine().trim(); // Xóa các khoảng trắng thừa và tránh tìm kiếm chuỗi rỗng

            if (truyVan.isEmpty()) {
                System.out.println("Truy vấn tìm kiếm không được để trống. Vui lòng nhập lại.");
            }
        }

        System.out.println("Kết quả tìm kiếm:\n");
        boolean timThay = false;
        for (int i = 0; i < soLuongSach; i++) {
            String tenSach = sach[i].layTenSach().toLowerCase();
            String moTa = sach[i].layMoTa().toLowerCase();

            // Sử dụng biểu thức chính quy để kiểm tra nếu tên hoặc mô tả chứa truyVan
            if (tenSach.contains(truyVan) || moTa.contains(truyVan)) {
                timThay = true;
                System.out.println("------------------");
                sach[i].hienThiThongTin();
            }
        }

        if (!timThay) {
            System.out.println("Không có sách phù hợp với truy vấn tìm kiếm.");
        }
    }

    private static void chinhSuaSach(Scanner scanner) {
        if (soLuongSach == 0) {
            System.out.println("Không có sách trong thư viện.");
            return;
        }

        System.out.print("Nhập mã sách để sửa đổi: ");
        int maSach = scanner.nextInt();
        scanner.nextLine();

        int viTriSach = timViTriSachTheoMa(maSach);
        if (viTriSach == -1) {
            System.out.println("Sách không tồn tại.");
            return;
        }

        System.out.println("Sửa đổi cuốn sách với mã " + maSach + ":");
        sach[viTriSach].hienThiThongTin();
        System.out.println("Nhập thông tin mới:");

        sach[viTriSach].nhapThongTin();

        System.out.println("Thông tin sách sửa đổi thành công.");
    }

    private static int timViTriSachTheoMa(int maSach) {
        for (int i = 0; i < soLuongSach; i++) {
            if (sach[i].layMaSach() == maSach) {
                return i;
            }
        }
        return -1;
    }
}

