import java.util.Arrays;

public class SortingAlgorithms {

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array (Selection Sort): " + Arrays.toString(arr));
        System.out.println(" ");
        System.out.println("Unsorted Array: " + Arrays.toString(arr2));
        insertionSort(arr2);
        System.out.println("Sorted Array (Insertion Sort): " + Arrays.toString(arr2));
        System.out.println(" ");
        System.out.println("Unsorted Array: " + Arrays.toString(arr3));
        bubbleSort(arr3);
        System.out.println("Sorted Array (Bubble Sort): " + Arrays.toString(arr3));
    }
}