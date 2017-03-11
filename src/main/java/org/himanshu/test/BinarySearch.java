package org.himanshu.test;

/**
 * Created by himanshu on 1/28/2017.
 * Algorithm Space Time Complexity - log n
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[10];

        int a = 10;
        for (int i = 0; i < 10; i++) {
            arr[i] = a;
            a = a + 10;
        }
        int search = 15;
        System.out.println("Element " + search + " exists or not " + binarySearch(arr, 0, arr.length - 1, search));

    }

    private static boolean binarySearch(int[] arr, int left, int right, int search) {

        //find the middle element
        int median = (left + right) / 2;

        //if search equals the middle element return true
        if (arr[median] == search) {
            return true;
        }
        //if left == right implies we have exhausted the array search and element was not found
        else if (left == right) {
            return false;
        }
        //if medial element is greater than search element, search in lower half of the array
        else if (arr[median] > search) {
            return binarySearch(arr, 0, median - 1, search);
        }
        //if middle element is less than search element, search in later half of the array
        else if (arr[median] < search) {
            return binarySearch(arr, median + 1, right, search);
        } else {
            return true;
        }


    }

}
