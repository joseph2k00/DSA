package arrays.sort_algorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};
        sort(myArray);

        System.out.print("Sorted array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }

    public static void sort(int[] array) {
        quickSort(array,0, array.length - 1);
    }

    /**
     * Quicksort algorithm
     * 
     * @param array Original Array to be sorted
     * @param low Lower index of current partition
     * @param high Higher index of current partition
     */
    public static void quickSort(int[] array, int low, int high)
    {
        if (low < high)
        {
            int pivotIndex = quickSortHelper(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    /**
     * Helper for quicksort to sort a specific partition and return the final pivot index
     * 
     * @param array Original Array to be sorted
     * @param low Lower index of current partition
     * @param high Higher index of current partition
     * 
     * @return Position of pivot
     */
    public static int quickSortHelper(int[] array, int low, int high)
    {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) 
        {
            if (array[j] <= pivot) 
            {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    /**
     * Swapping algorithm
     * 
     * @param array Original array
     * @param i Index of element to be swapped
     * @param j Index of element to be swapped
     */
    public static void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
