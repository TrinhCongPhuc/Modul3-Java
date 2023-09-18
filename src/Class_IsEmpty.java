import java.util.Scanner;
public class Class_IsEmpty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");

        // Sử dụng biến tiếng Việt để lưu chuỗi
        String chuoi = scanner.nextLine();

        // Kiểm tra xem chuỗi có rỗng không
        if (chuoi.isEmpty()) {
            System.out.println("Chuỗi bạn vừa nhập là chuỗi rỗng.");
        } else {
            System.out.println("Chuỗi bạn vừa nhập không rỗng.");
        }
        scanner.close();
    }
}