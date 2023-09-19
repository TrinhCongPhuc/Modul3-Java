import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số từ 0 - 9: ");

        int number = scanner.nextInt();
        String result;

        switch (number) {
            case 0:
                result = "Số Không";
                break;
            case 1:
                result = "Số Một";
                break;
            case 2:
                result = "Số Hai";
                break;
            case 3:
                result = "Số Ba";
                break;
            case 4:
                result = "Số Bốn";
                break;
            case 5:
                result = "Số Năm";
                break;
            case 6:
                result = "Số Sáu";
                break;
            case 7:
                result = "Số Bảy";
                break;
            case 8:
                result = "Số Tám";
                break;
            case 9:
                result = "Số Chín";
                break;
            default:
                result = "Số không hợp lệ";
                break;
        }

        System.out.println("Cách đọc của số " + number + " là: " + result);
    }
}
