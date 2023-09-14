import java.util.Scanner;

public class MenuDieukhien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soNguyen;

        do {
            System.out.print("Nhập vào một số nguyên (hoặc nhập 0 để thoát): ");
            soNguyen = scanner.nextInt();

            if (soNguyen == 0) {
                break;
            }

            // Hiển thị menu lựa chọn
            System.out.println("*****************MENU******************");
            System.out.println("1. Kiểm tra số chẵn/lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra số hoàn hảo");
            System.out.println("4. In ra các số chia hết cho 3 và 5 trong khoảng 1-" + soNguyen);
            System.out.println("5. Tính tổng các ước số của " + soNguyen);
            System.out.println("6. Tính tổng các số nguyên tố trong khoảng 1-" + soNguyen);
            System.out.println("7. Nhập 2 số nguyên (number1, number2), kiểm tra " + soNguyen + " có trong khoảng (number1, number2)");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng (1-8): ");
            int luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    // Kiểm tra và hiển thị kết quả số chẵn/lẻ
                    if (soNguyen % 2 == 0) {
                        System.out.println(soNguyen + " là số chẵn.");
                    } else {
                        System.out.println(soNguyen + " là số lẻ.");
                    }
                    break;
                case 2:
                    // Kiểm tra và hiển thị kết quả số nguyên tố

                    // Khai báo và khởi tạo một biến boolean 'laSoNguyenTo' và đặt giá trị ban đầu là true.
                    boolean laSoNguyenTo = true;

                    // Kiểm tra nếu 'soNguyen' là nhỏ hơn hoặc bằng 1, thì đánh dấu 'laSoNguyenTo' là false
                    if (soNguyen <= 1) {
                        laSoNguyenTo = false;
                    } else {
                        // Nếu 'soNguyen' lớn hơn 1, thực hiện kiểm tra xem nó có phải là số nguyên tố không.

                        // Sử dụng vòng lặp for để kiểm tra từ 2 đến căn bậc hai của 'soNguyen'
                        for (int i = 2; i <= Math.sqrt(soNguyen); i++) {
                            // Kiểm tra nếu 'soNguyen' chia hết cho 'i' (không dư), thì đánh dấu 'laSoNguyenTo' là false
                            if (soNguyen % i == 0) {
                                laSoNguyenTo = false;
                                // Thoát khỏi vòng lặp ngay lập tức, vì đã xác định 'soNguyen' không phải là số nguyên tố.
                                break;
                            }
                        }
                    }

                    // Sau khi hoàn thành kiểm tra, hiển thị kết quả dựa trên giá trị của 'laSoNguyenTo'
                    if (laSoNguyenTo) {
                        System.out.println(soNguyen + " là số nguyên tố.");
                    } else {
                        System.out.println(soNguyen + " không là số nguyên tố.");
                    }
                    break;
                case 3:
                    // Kiểm tra và hiển thị kết quả số hoàn hảo

                    // Khởi tạo biến "tong" để tính tổng các ước số của số "soNguyen"
                    int tong = 1;

                    // Sử dụng vòng lặp để duyệt qua các số từ 2 đến căn bậc hai của "soNguyen"
                    for (int i = 2; i * i <= soNguyen; i++) {

                        // Kiểm tra nếu "i" là một ước của "soNguyen"
                        if (soNguyen % i == 0) {

                            // Cộng "i" vào biến "tong" vì "i" là ước số của "soNguyen"
                            tong += i;

                            // Kiểm tra nếu "i" không phải là một ước số duy nhất
                            if (i != soNguyen / i) {

                                // Cộng "soNguyen / i" vào biến "tong" vì "soNguyen / i" cũng là ước số của "soNguyen"
                                tong += soNguyen / i;
                            }
                        }
                    }

                    // Kiểm tra nếu tổng các ước số bằng chính số "soNguyen" và "soNguyen" không phải là số 1
                    if (tong == soNguyen && soNguyen != 1) {

                        // In ra màn hình kết quả là "soNguyen" là số hoàn hảo
                        System.out.println(soNguyen + " là số hoàn hảo.");
                    } else {

                        // In ra màn hình kết quả là "soNguyen" không phải là số hoàn hảo
                        System.out.println(soNguyen + " không là số hoàn hảo.");
                    }
                    // Kết thúc lệnh "case 3"
                    break;
                case 4:
                    // In ra các số chia hết cho 3 và 5 trong khoảng 1- soNguyen
                    System.out.print("Các số chia hết cho 3 và 5 trong khoảng 1-" + soNguyen + ": ");
                    for (int i = 1; i <= soNguyen; i++) {
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    // Tính và hiển thị tổng các ước số của soNguyen
                    int tongUocSo = 0; // Khởi tạo biến tongUocSo để lưu tổng các ước số
                    for (int i = 1; i <= soNguyen; i++) { // Lặp qua các số từ 1 đến soNguyen
                        if (soNguyen % i == 0) { // Kiểm tra nếu i là ước số của soNguyen (chia hết)
                            tongUocSo += i; // Nếu i là ước số, thì cộng i vào tổngUocSo
                        }
                    }
                    System.out.println("Tổng các ước số của " + soNguyen + " là " + tongUocSo); // In ra tổng các ước số
                    break;
                case 6:
                    // Tính và hiển thị tổng các số nguyên tố trong khoảng 1- soNguyen
                    int tongSoNguyenTo = 0; // Khởi tạo biến tổng số nguyên tố với giá trị ban đầu là 0.
                    for (int i = 2; i <= soNguyen; i++) { // Vòng lặp chạy qua tất cả các số từ 2 đến soNguyen.
                        boolean laSoNguyenTo2 = true; // Mặc định, giả sử i là số nguyên tố.
                        if (i <= 1) {
                            laSoNguyenTo2 = false; // Nếu i nhỏ hơn hoặc bằng 1, thì i không phải số nguyên tố.
                        } else {
                            for (int j = 2; j * j <= i; j++) { // Vòng lặp này kiểm tra i có phải là số nguyên tố không.
                                if (i % j == 0) { // Nếu i chia hết cho một số nào đó từ 2 đến căn bậc hai của i, thì i không phải số nguyên tố.
                                    laSoNguyenTo2 = false;
                                    break;
                                }
                            }
                        }
                        if (laSoNguyenTo2) { // Nếu i là số nguyên tố, thì cộng i vào tổng số nguyên tố.
                            tongSoNguyenTo += i;
                        }
                    }
                    System.out.println("Tổng các số nguyên tố trong khoảng 1-" + soNguyen + " là " + tongSoNguyenTo); // In ra tổng các số nguyên tố trong khoảng.
                    break;
                case 7:
                    // Case 7: Đây là một phần của câu lệnh switch-case. Nếu giá trị của biến chọn là 7, chương trình sẽ vào đây.

                    // Nhập và kiểm tra sốNguyen trong khoảng sốNguyen1 và sốNguyen2
                    System.out.print("Nhập số nguyên đầu tiên: "); // Hiển thị thông báo để yêu cầu người dùng nhập số nguyên đầu tiên.
                    int soNguyen1 = scanner.nextInt(); // Đọc giá trị nguyên đầu tiên từ bàn phím và lưu vào biến soNguyen1.

                    System.out.print("Nhập số nguyên thứ hai: "); // Hiển thị thông báo để yêu cầu người dùng nhập số nguyên thứ hai.
                    int soNguyen2 = scanner.nextInt(); // Đọc giá trị nguyên thứ hai từ bàn phím và lưu vào biến soNguyen2.

                    if (soNguyen >= soNguyen1 && soNguyen <= soNguyen2) {
                        // Kiểm tra nếu giá trị soNguyen nằm trong khoảng [soNguyen1, soNguyen2].
                        System.out.println(soNguyen + " nằm trong khoảng (" + soNguyen1 + ", " + soNguyen2 + ").");
                        // In ra màn hình thông báo cho biết giá trị soNguyen nằm trong khoảng đã nhập.
                    } else {
                        System.out.println(soNguyen + " không nằm trong khoảng (" + soNguyen1 + ", " + soNguyen2 + ").");
                        // In ra màn hình thông báo cho biết giá trị soNguyen không nằm trong khoảng đã nhập.
                    }
                    break;

                case 8:
                    // Case 8: Đây là một phần của câu lệnh switch-case. Nếu giá trị của biến chọn là 8, chương trình sẽ vào đây.
                    System.out.println("Thoát ứng dụng."); // In ra màn hình thông báo cho biết chương trình sẽ thoát.
                    break; // Kết thúc case 8 và thoát khỏi switch-case.

                default:
                    // Trường hợp mặc định: Nếu giá trị của biến chọn không phù hợp với bất kỳ case nào ở trên, chương trình sẽ vào đây.
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại."); // In ra màn hình thông báo cho biết lựa chọn không hợp lệ.
                    break; // Kết thúc trường hợp mặc định và thoát khỏi switch-case.
            }

        } while (true); // Lặp lại vòng lặp do-while vô hạn để cho phép người dùng tiếp tục chọn lựa đối với menu.

        scanner.close(); // Đóng luồng nhập từ bàn phím sau khi hoàn thành công việc.
    }
}
