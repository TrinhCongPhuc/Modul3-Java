package String;
import java.util.Scanner;
public class Class_Equal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi thứ nhất từ người dùng
        System.out.print("Nhập chuỗi thứ nhất: ");
        String chuoi1 = scanner.nextLine();

        // Nhập chuỗi thứ hai từ người dùng
        System.out.print("Nhập chuỗi thứ hai: ");
        String chuoi2 = scanner.nextLine();

        // So sánh 2 chuỗi bằng nhau
        if (chuoi1.equals(chuoi2)) {
            System.out.println("Hai chuỗi giống nhau.");
        } else {
            System.out.println("Hai chuỗi khác nhau.");
        }

        // So sánh 2 chuỗi bằng nhau không phân biệt hoa thường
        if (chuoi1.equalsIgnoreCase(chuoi2)) {
            System.out.println("Hai chuỗi giống nhau (không phân biệt hoa thường).");
        } else {
            System.out.println("Hai chuỗi khác nhau (không phân biệt hoa thường).");
        }
        scanner.close();
    }
}


