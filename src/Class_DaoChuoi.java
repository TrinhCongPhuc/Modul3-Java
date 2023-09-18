package String;
import java.util.Scanner;
public class Class_DaoChuoi {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();

        // Tạo đối tượng StringBuffer và thêm chuỗi đầu vào vào nó
        StringBuffer stringBuffer = new StringBuffer(inputString);

        // Sử dụng phương thức reverse để đảo ngược chuỗi
        stringBuffer.reverse();

        // In ra chuỗi đảo ngược
        System.out.println("Chuỗi đảo ngược: " + stringBuffer.toString());

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
