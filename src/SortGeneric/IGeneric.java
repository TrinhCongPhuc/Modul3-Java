package SortGeneric;

public interface IGeneric<T extends Comparable<T>> {
    void selectionSort(T[] arr);

    void insertionSort(T[] arr);

    void bubbleSort(T[] arr);
}
