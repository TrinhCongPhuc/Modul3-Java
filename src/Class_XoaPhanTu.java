package Class;
import java.util.Arrays;
import java.util.Scanner;
public class Class_XoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.println("Nhập số lượng phần tử: ");
        int size = scanner.nextInt();
        int[] arrNum = new int[size];

        // Nhập giá trị cho từng phần tử
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
            arrNum[i] = scanner.nextInt();
        }

        // In ra mảng vừa nhập
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(arrNum));

        // Nhập giá trị cần tìm và tìm kiếm trong mảng
        System.out.println("Nhập giá trị cần tìm: ");
        int findValue = scanner.nextInt();
        int delIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arrNum[i] == findValue) {
                delIndex = i;
                break;
            }
        }

        // Kiểm tra xem giá trị cần xóa có tồn tại trong mảng hay không
        if (delIndex != -1) {
            // Xóa phần tử và cập nhật mảng
            for (int i = delIndex; i < size - 1; i++) {
                arrNum[i] = arrNum[i + 1];
            }
            size--;
            arrNum = Arrays.copyOf(arrNum, size);
            System.out.println("Mảng sau khi xóa: " + Arrays.toString(arrNum));
        } else {
            System.out.println("Không tìm thấy giá trị cần xóa trong mảng");
        }
    }

}
