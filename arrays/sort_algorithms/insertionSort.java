package arrays.sort_algorithms;

public class insertionSort {
    public static void main(String args[]) {
        int[] arr = {5, 2, 9, 1, 5, 6}; // Unsorted array
        
        // Insertion sort algorithm
        for (int i = 1; i < arr.length; i++)
        {
            int j = i - 1;
            while (j >= 0 && arr[j + 1] < arr[j]) 
            {
                // Elements are swapped
                int swap = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = swap;
                j--;
            }
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + ", ");
        }
    }
}
