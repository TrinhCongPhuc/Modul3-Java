package run;
import Java_HKT_BookMenu.bussiness.Book;
import java.util.List;
import java.util.Scanner;
public class BookManagement {
    public static Book book = new Book();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("**************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                    "1. Nhập số sách và thông tin sách \n" +
                    "2. Hiển thị thông tin sách \n" +
                    "3. Sắp xếp theo lợi nhuận giảm dần \n" +
                    "4. Xoá sách theo mã sách \n" +
                    "5. Tìm kiếm theo tên sách \n" +
                    "6. Thay đổi trạng thái theo mã sách \n" +
                    "7. Thoát");
            System.out.println("Lựa chọn của bạn (vui lòng chọn từ 1-7): ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                continue; // Quay lại vòng lặp để yêu cầu lựa chọn lại.
            }

            switch (choice) {
                case 1:
                    book.inputBook();
                    break;
                case 2:
                    book.displayBook();
                    break;
                case 3:
                    book.sortBookByInterist();
                    break;
                case 4:
                    book.deleteBookById();
                    break;
                case 5:
                    book.searchBookByName();
                    break;
                case 6:
                    book.changeBookStatus();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }
}
