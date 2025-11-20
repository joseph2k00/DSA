package arrays.search_algorithms;

public class BinarySearch {
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 4;

        int searchIndex = binarySearch(arr, target);

        System.out.print("Element found at index " + searchIndex);
    }

    public static int binarySearch(int[] array, int target)
    {
        return binarySearchHelper(array, 0, array.length - 1, target);
    }

    public static int binarySearchHelper(int[] arr, int start, int end, int target)
    {
        if (start > end)
            return -1;

        int mid = (start + end) / 2;
        
        if (arr[mid] == target)
            return mid;

        if (target > arr[mid])
            start = mid + 1;
        else
            end = mid - 1;

        return binarySearchHelper(arr, start, end, target);
    }
}
