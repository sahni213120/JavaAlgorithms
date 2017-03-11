package org.himanshu.test;

/**
 * Created by himanshu on 3/7/2017.
 * Algorithm Space Time Complexity - O(n log n)
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 2, 8, 9, 7};

        merge(array);


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * This function will keep breaking/ splitting the input array till its size is equal to 1.
     * If size of an array equals 1, it is already sorted.
     * @param array
     */
    private static void merge(int[] array) {

        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;

        int[] left = new int[mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        int[] right = new int[array.length - mid];
        int j = 0;
        for (int i = mid; i < array.length; i++) {
            right[j] = array[i];
            j++;
        }


        merge(left);


        merge(right);


        mergeArray(left, right, array);
    }

    /**
     * This function merges two given arrays left and right into a larger array which is sorted accross left and right.
     * left and right arrays should internally be sorted.
     * @param left - Sorted left array
     * @param right - Sorted right array
     * @param array - Main array
     */
    private static void mergeArray(int[] left, int[] right, int[] array) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
                k++;
            } else {
                array[k] = right[j];
                j++;
                k++;
            }
        }

        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            array[k] = right[j];
            k++;
            j++;
        }

    }
}
