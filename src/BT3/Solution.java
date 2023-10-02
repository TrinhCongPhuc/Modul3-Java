package BT_SS11.BT3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("*****************MENU QUEUE************");
            System.out.println("1. Thêm số vào hàng đợi");
            System.out.println("2. Lấy số ra khỏi hàng đợi");
            System.out.println("3. Hiển thị hàng đợi");
            System.out.println("0. Thoát");
            System.out.println("Chọn một tùy chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số để thêm vào hàng đợi: ");
                    int numberToAdd = scanner.nextInt();
                    queue.enQueue(numberToAdd);
                    break;
                case 2:
                    Integer removedNumber = queue.deQueue();
                    if (removedNumber != null) {
                        System.out.println("Số " + removedNumber + " đã được lấy ra khỏi hàng đợi.");
                    }
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
