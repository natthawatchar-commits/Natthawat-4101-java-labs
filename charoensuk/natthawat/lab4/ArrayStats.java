package charoensuk.natthawat.lab4;

import java.util.Scanner;
import java.util.Arrays;

/**
 * ArrayStats is a program that calculates basic statistical measures
 * from user-provided data including sum, min, max, average, and median.
 * 
 * @author Natthawat Charoensuk
 * @version 1.0, 26/12/2025
 * @Student_ID 683040410-1
 * @Section 2
 */
public class ArrayStats {

    public static void main(String[] args) {
        int[] numbers = getInput();
        System.out.println("Statistic Results:");
        System.out.println("Sum: " + calculateSum(numbers));
        System.out.println("Minimum: " + findMinimum(numbers));
        System.out.println("Maximum: " + findMaximum(numbers));
        System.out.printf("Average: %.2f%n", calculateAverage(numbers));
        System.out.printf("Median: %.2f%n", calculateMedian(numbers));
    }

    /**
     * Gets integer input from the user via console.
     * * @return an array of integers provided by the user.
     */
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.print("Error: Size must be a positive integer.");
            System.exit(1);
        }

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    /**
     * Calculates the sum of all elements in the array.
     * * @param arr the array of integers.
     * 
     * @return the total sum of the elements.
     */
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * Finds the minimum value in the array.
     * * @param arr the array of integers.
     * 
     * @return the smallest value in the array.
     */
    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min)
                min = val;
        }
        return min;
    }

    /**
     * Finds the maximum value in the array.
     * * @param arr the array of integers.
     * 
     * @return the largest value in the array.
     */
    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max)
                max = val;
        }
        return max;
    }

    /**
     * Calculates the average value of the array elements.
     * * @param arr the array of integers.
     * 
     * @return the average value as a double.
     */
    public static double calculateAverage(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }

    /**
     * Calculates the median value of the array elements.
     * * @param arr the array of integers.
     * 
     * @return the median value as a double.
     */
    public static double calculateMedian(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        int n = copy.length;
        if (n % 2 != 0) {
            return copy[n / 2];
        } else {
            return (copy[n / 2] + copy[(n / 2) - 1]) / 2.0;
        }
    }
}