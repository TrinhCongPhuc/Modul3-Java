public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = getArr(); // Bước 1: Tạo mảng số nguyên và gán giá trị từ hàm getArr()

        // Bước 2: In ra mảng số nguyên
        System.out.println("Mảng số nguyên ngẫu nhiên:");
        printArray(arr);

        // Bước 3: Tìm số lớn nhất bằng thuật toán tìm kiếm tuyến tính
        int max = linearSearchMax(arr);

        // Bước 4: In số lớn nhất ra màn hình
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 300);
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int linearSearchMax(int[] arr) {
        int max = arr[0]; // Giả sử phần tử đầu tiên là số lớn nhất

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
