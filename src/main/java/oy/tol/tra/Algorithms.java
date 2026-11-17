
package oy.tol.tra;

/**
 * A class containing generic algorithms for sorting,
 * reversing and swapping elements in arrays.
 */
public class Algorithms {

    /**
     * Sorts an array into ascending order using insertion sort.
     *
     * @param <T> The type of elements in the array.
     * @param array The array to sort.
     */
    public static <T extends Comparable<T>> void sort(T[] array) {

        // Start from the second element.
        for (int i = 1; i < array.length; i++) {

            // Store the current element.
            T key = array[i];

            // Start comparing with the previous element.
            int j = i - 1;

            // Move larger elements one position to the right.
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }

            // Insert the current element into its correct position.
            array[j + 1] = key;
        }
    }

    /**
     * Reverses the elements of an array in-place.
     *
     * @param <T> The type of elements in the array.
     * @param array The array to reverse.
     */
    public static <T> void reverse(T[] array) {

        // Set pointers at the beginning and end of the array.
        int left = 0;
        int right = array.length - 1;

        // Swap elements until the pointers meet.
        while (left < right) {

            swap(array, left, right);

            left++;
            right--;
        }
    }

    /**
     * Swaps two elements in an array.
     *
     * @param <T> The type of elements in the array.
     * @param array The array containing the elements.
     * @param first The index of the first element.
     * @param second The index of the second element.
     */
    public static <T> void swap(T[] array, int first, int second) {

        // Temporarily store the first element.
        T temp = array[first];

        // Exchange the two elements.
        array[first] = array[second];
        array[second] = temp;
    }
}
