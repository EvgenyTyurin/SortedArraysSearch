/**
 * Find common elements in two sorted arrays
 * For every element in array1 linear search in array2 but
 * start from last search position, not from beginning
 * O(n) runtime, O(1) space
 */

public class SortedArraysSearch {

    public static void main(String[] args) {
        // Sorted arrays
        int[] array1 = {1,2,4,6,7};
        int[] array2 = {1,3,4,7,9};
        // The position where previous search in array2 stopped
        int idx2old = 0;
        // Cycle array1
        for (int idx1 = 0; idx1 < array1.length; idx1++) {
            // Start search in array2 from old position
            for (int idx2 = idx2old; idx2 < array2.length; idx2++) {
                // We found same element or grater then
                if (array2[idx2] >= array1[idx1]) {
                    // Remember old position
                    idx2old = idx2;
                    // If elements equals print it, move old position forward by 1
                    if (array2[idx2] == array1[idx1]) {
                        System.out.println(array2[idx2]);
                        idx2old++;
                    };
                    // Time to move to next element in array1
                    break;
                }
            }
        }
    }

}
