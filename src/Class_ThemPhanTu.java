package Class;
import java.util.Scanner;
import java.util.Arrays;
public class Class_ThemPhanTu {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng từ người dùng
        System.out.println("Nhập số phần tử mảng: ");
        int size = scanner.nextInt();
        int[] arr = new int[size]; // Khởi tạo mảng với số phần tử đã nhập

        // Nhập giá trị cho từng phần tử của mảng
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // Hiển thị mảng đã nhập

        // Nhập giá trị mới và vị trí cần chèn
        System.out.println("Nhập giá trị phần tử mới: ");
        int newValue = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int newIndex = scanner.nextInt();

        // Kiểm tra vị trí chèn có hợp lệ không
        if (newIndex < 0 || newIndex > size - 1) {
            System.out.println("Vị trí chèn không hợp lệ. ");
        } else {
            int[] newArr = new int[size + 1]; // Tạo mảng mới có kích thước lớn hơn mảng ban đầu
            // Sao chép phần từ đầu đến vị trí chèn từ mảng cũ sang mảng mới
            System.arraycopy(arr, 0, newArr, 0, newIndex);
            System.out.println(Arrays.toString(newArr));
            newArr[newIndex] = newValue; // Chèn giá trị mới vào vị trí đã chọn
            // Sao chép phần từ phía sau vị trí chèn từ mảng cũ sang mảng mới
            System.arraycopy(arr, newIndex, newArr, newIndex + 1, arr.length - newIndex);
            System.out.println(Arrays.toString(newArr)); // Hiển thị mảng mới
        }
    }
}
