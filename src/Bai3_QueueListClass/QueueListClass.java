package Bai3_QueueListClass;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueListClass {
    public static Queue<String> queue = new LinkedList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05 - ADVANCE - QUEUE LIST CLASS***************");
            System.out.println("1. Nhập tên phụ huynh nộp hồ sơ");
            System.out.println("2. Phụ huynh tiếp theo");
            System.out.println("3. Thoát");
            System.out.println("Mời nhập lựa chọn chức năng (vui lòng chọn số nguyên dương từ 1 - 3): ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Mời nhập tên phụ huynh vào hàng chờ: ");
                        queue.add(scanner.nextLine());
                        break;
                    case 2:
                        if (queue.isEmpty()) {
                            System.out.println("Không có phụ huynh tiếp theo");
                        } else {
                            String nextParent = queue.poll();
                            System.out.println("Mời phụ huynh: " + nextParent + " liên hệ làm việc với chúng tôi");
                            if (!queue.isEmpty()) {
                                System.out.println("Mời phụ huynh chuẩn bị tiếp theo là: " + queue.peek());
                            }
                        }
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập một số nguyên dương từ 1 đến 3.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập một số nguyên dương từ 1 đến 3.");
            }
        }
    }
}
