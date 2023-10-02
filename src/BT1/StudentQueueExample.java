package BT_SS11.BT1;

import java.util.LinkedList;
import java.util.Queue;

public class StudentQueueExample {
    public static void main(String[] args) {
        // Tạo một Queue để lưu trữ danh sách sinh viên
        Queue<String> studentQueue = new LinkedList<>();

        // Thêm các sinh viên vào Queue
        studentQueue.add("Sinh viên 1");
        studentQueue.add("Sinh viên 2");
        studentQueue.add("Sinh viên 3");
        studentQueue.add("Sinh viên 4");
        studentQueue.add("Sinh viên 5");

        // In ra các sinh viên từ Queue
        System.out.println("Danh sách sinh viên:");
        while (!studentQueue.isEmpty()) {
            String student = studentQueue.poll(); // Lấy và loại bỏ phần tử đầu tiên
            System.out.println(student);
        }
    }
}