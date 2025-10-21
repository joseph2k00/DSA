package arrays.sort_algorithms;

public class MergeSort 
{   
    /**
     * Function that performs merge sort algorithm on array
     * 
     * @param arr
     * @return int[]
     */
    public static int[] mergeSort (int[] arr)
    {
        // Recursion end case
        if (arr.length == 1) {
            return arr;
        }

        int length = arr.length;
        int left = length / 2;      // Array size for left array
        int right = length - left;  // Array size for right array

        // Declare left and right split arrays
        int[] leftArr = new int[left];
        int[] rightArr = new int[right];

        // Split array into two
        for (int i = 0; i < length; i++)
        {
            if (i < left)
                leftArr[i] = arr[i];
            else
                rightArr[i - left] = arr[i];
        }

        // Recursively split left and right array
        int[] leftMergeSorted = mergeSort(leftArr);
        int[] rightMergeSorted = mergeSort(rightArr);

        // Sort previously merge-sorted array and return to previous mergeSort function
        return sortedArray(leftMergeSorted, rightMergeSorted);
    }

    /**
     * Function that merges left and right array in sorted way
     * 
     * @param leftArr
     * @param rightArr
     * @return
     */
    public static int[] sortedArray(int[] leftArr, int[] rightArr)
    {
        // Resultant array declaration
        int[] mergedArray = new int[leftArr.length + rightArr.length];

        // Pick smallest element from each array one by one and place it in mergedArray array
        int i = 0, j = 0, k = 0;
        while (i < leftArr.length && j < rightArr.length)
        {
            if (leftArr[i] < rightArr[j])
                mergedArray[k++] = leftArr[i++];
            else
                mergedArray[k++] = rightArr[j++];
        }

        // Put remaining elements in one of the left or right array in the mergedArray
        while (i < leftArr.length)
            mergedArray[k++] = leftArr[i++];

        while (j < rightArr.length)
            mergedArray[k++] = rightArr[j++];
                
        return mergedArray;
    }

    public static void main(String args[])
    {
        int[] arr = {12, 8, 9, 3, 11, 5, 4};

        // Merge sort algorithm
        arr = mergeSort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + ", ");
        }
    }
}
