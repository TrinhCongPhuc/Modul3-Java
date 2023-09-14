public class TimMinArray {
    public static void main(String[] args) {
        // Khởi tạo mảng
        int[] arr = {5, 12, 2, 8, 11, 6, 9};

        // Gọi hàm để tìm vị trí của giá trị nhỏ nhất trong mảng
        int index = minValue(arr);

        // In ra giá trị nhỏ nhất
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + arr[index]);
    }

    // Hàm để tìm vị trí của giá trị nhỏ nhất trong mảng
    public static int minValue(int[] array) {
        // Khởi tạo biến index để lưu vị trí của giá trị nhỏ nhất, ban đầu là phần tử đầu tiên (index 0)
        int index = 0;

        // Duyệt qua từng phần tử trong mảng để so sánh
        for (int i = 1; i < array.length; i++) {
            // Nếu phần tử tại vị trí i nhỏ hơn phần tử tại vị trí index
            if (array[i] < array[index]) {
                // Cập nhật index thành vị trí mới có giá trị nhỏ hơn
                index = i;
            }
        }

        // Trả về vị trí của giá trị nhỏ nhất trong mảng
        return index;
    }
}