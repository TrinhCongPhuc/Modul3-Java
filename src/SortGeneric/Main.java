package SortGeneric;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Double[] arr2 = {3.14, 2.71, 1.61, 0.0, 1.41};
        String[] arr3 = {"apple", "banana", "cherry", "date", "fig"};

        SortGeneric<Integer> sorter1 = new SortGeneric<Integer>();
        SortGeneric<Double> sorter2 = new SortGeneric<Double>();
        SortGeneric<String> sorter3 = new SortGeneric<String>();

        sorter1.selectionSort(arr1);
        sorter2.insertionSort(arr2);
        sorter3.bubbleSort(arr3);

        System.out.println("Mảng đã sắp xếp arr1 theo selectionSort: " + Arrays.toString(arr1));
        System.out.println("Mảng đã sắp xếp arr2 theo insertionSort: " + Arrays.toString(arr2));
        System.out.println("Mảng đã sắp xếp arr3 theo bubbleSort: " + Arrays.toString(arr3));
    }
}







