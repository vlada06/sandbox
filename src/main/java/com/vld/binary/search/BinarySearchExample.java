package com.vld.binary.search;

/**
 * date: 07/04/2021
 * time: 22:30
 */

public class BinarySearchExample {

    /**
     *
     * @param array   Array pf Integers on whec we perform search.
     * @param startIndex
     * @param maxIndex
     * @param searchTerm
     * @return Index/position of the searched number
     */
    public int binarySearch(int array[], int startIndex, int maxIndex, int searchTerm)
    {
        if (maxIndex >= startIndex) {
            int middle = startIndex + (maxIndex - startIndex) / 2;

            // If the element is present at the middle index position
            if (array[middle] == searchTerm)
                return middle;

            // If element is smaller than middle, then it can only be present in left subarray
            if (array[middle] > searchTerm)
                return binarySearch(array, startIndex, middle - 1, searchTerm);

            // ... Else the element can only be present in the right subarray
            return binarySearch(array, middle + 1, maxIndex, searchTerm);
        }

        // If element is not present in the array
        return -1;
    }

}
