import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        // Khai báo mảng 2 chiều và nhận giá trị từ hàm getArr()
        int[][] arr = getArr();
        // Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        // Đọc số cần tìm từ bàn phím và lưu vào biến "target"
        int target = scanner.nextInt();
        // Gọi hàm searchInArray() để tìm số trong mảng
        boolean found = searchInArray(arr, target);
        if (found) {
            // Nếu số được tìm thấy, in ra thông báo và vị trí
            System.out.println("Số " + target + " xuất hiện tại các vị trí sau:");
        } else {
            // Nếu số không được tìm thấy, in ra thông báo
            System.out.println("Số " + target + " không xuất hiện trong mảng.");
        }
    }

    // Hàm này tạo và trả về một mảng 2 chiều 20x20 với giá trị ngẫu nhiên từ 0 đến 99
    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Gán giá trị ngẫu nhiên từ 0 đến 99 cho mỗi phần tử trong mảng
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        // Trả về mảng đã tạo
        return arr;
    }

    // Hàm này tìm kiếm số target trong mảng và trả về true nếu tìm thấy
    private static boolean searchInArray(int[][] arr, int target) {
        // Danh sách để lưu các chỉ số của hàng (row) và cột (column) mà số target xuất hiện
        List<Integer> rowIndexes = new ArrayList<>();
        List<Integer> colIndexes = new ArrayList<>();
        // Biến kiểm tra xem số có được tìm thấy hay không
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    // Nếu số được tìm thấy, thêm chỉ số hàng và cột vào danh sách và đánh dấu là đã tìm thấy
                    rowIndexes.add(i);
                    colIndexes.add(j);
                    found = true;
                }
            }
        }

        if (found) {
            // Nếu số được tìm thấy, in ra các vị trí
            for (int k = 0; k < rowIndexes.size(); k++) {
                int row = rowIndexes.get(k);
                int col = colIndexes.get(k);
                System.out.println("Vị trí [" + row + "][" + col + "]");
            }
        }

        // Trả về kết quả tìm kiếm (true nếu tìm thấy, false nếu không tìm thấy)
        return found;
    }
}
