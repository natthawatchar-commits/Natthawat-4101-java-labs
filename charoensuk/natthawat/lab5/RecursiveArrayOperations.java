/**
 * RecursiveArrayOperations demonstrates basic recursive operations
 * on an integer array such as calculating the sum, finding the maximum value,
 * counting occurrences, and printing the array in reverse order.
 *
 * @author Natthawat Charoensuk
 * @version 1.0, 09/01/2026
 * @Student_ID 683040410-1
 * @Section 2
 */

package charoensuk.natthawat.lab5;

public class RecursiveArrayOperations {
    public static void main(String[] args) {
        // Create a sample array for testing recursive methods
        int[] sampleArray = { 3, 5, 2, 8, 6, 2, 9 };

        // Display the sample array
        System.out.println("Sample Array: ");
        for (int num : sampleArray) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Test arraySum
        System.out.println("=== Testing calculateSum ===");
        int sum = calculateSum(sampleArray, sampleArray.length);
        System.out.println("Sum: " + sum);
        System.out.println("Expected: 35\n");

        // Test findMaximum
        System.out.println("=== Testing findMaximum ===");
        int max = findMaximum(sampleArray, sampleArray.length);
        System.out.println("Maximum: " + max);
        System.out.println("Expected: 9\n");

        // Test countOccurrences
        System.out.println("=== Testing countOccurrences ===");
        int target = 2;
        int count = countOccurrences(sampleArray, target, 0);
        System.out.println("Occurrences of " + target + ": " + count);
        System.out.println("Expected: 2\n");

        // Test printArrayReverse
        System.out.println("=== Testing printArrayReverse ===");
        System.out.print("Array in reverse: ");
        printArrayReverse(sampleArray, 0);
        System.out.println("\nExpected: 9 2 6 8 2 5 3");
    }

    /**
     * Calculates the sum of elements in an array using recursion.
     *
     * @param arr the integer array
     * @param n   the number of elements to include in the sum
     * @return the sum of the array elements
     */
    public static int calculateSum(int[] arr, int n) {
        if (n <= 0)
            return 0;
        return arr[n - 1] + calculateSum(arr, n - 1);
    }

    /**
     * Finds the maximum value in an array using recursion.
     *
     * @param arr the integer array
     * @param n   the number of elements to examine
     * @return the maximum value in the array
     */
    public static int findMaximum(int[] arr, int n) {
        if (n == 1)
            return arr[n];
        return Math.max(arr[n - 1], findMaximum(arr, n - 1));
    }

    /**
     * Counts how many times a target value appears in an array using recursion.
     *
     * @param arr    the integer array
     * @param target the value to count
     * @param index  the current index being checked
     * @return the number of occurrences of the target value
     */
    public static int countOccurrences(int[] arr, int target, int index) {
        // Base case: all elements have been checked
        if (index >= arr.length)
            return 0;
        int match = (arr[index] == target) ? 1 : 0; // Check if the current element matches the target value
        return match + countOccurrences(arr, target, index + 1); // Add result and continue with the next index
    }

    /**
     * Prints the elements of an array in reverse order using recursion.
     *
     * @param arr   the integer array
     * @param index the current index
     */
    public static void printArrayReverse(int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }

        printArrayReverse(arr, index + 1); // Recursively move to the end of the array
        System.out.print(arr[index] + " ");
    }
}
