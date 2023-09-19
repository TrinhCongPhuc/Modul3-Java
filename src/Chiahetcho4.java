import java.util.Scanner;
public class Chiahetcho4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        if (number % 4 == 0) {
            System.out.println(number + " chia hết cho 4.");
        } else {
            System.out.println(number + " không chia hết cho 4.");
        }

        int remainder = number % 4;
        System.out.println("Số dư khi chia cho 4 là: " + remainder);

        scanner.close();
    }
}

