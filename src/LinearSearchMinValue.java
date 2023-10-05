public class LinearSearchMinValue {
    public static void main(String[] args) {
        int[] arr = getArr();

        System.out.println("Mảng số nguyên:");
        printArray(arr);

        int minValue = linearSearchMin(arr);
        System.out.println("Số nhỏ nhất trong mảng: " + minValue);
    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 300);
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static int linearSearchMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
