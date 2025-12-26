package charoensuk.natthawat.lab4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * InteractiveArrayStats is a menu-driven program that allows users to analyze
 * datasets, search for specific values, and retrieve elements by their index.
 * 
 * @author Natthawat Charoensuk
 * @version 1.0, 26/12/2025
 * @Student_ID 683040410-1
 * @Section 2
 */
public class InteractiveArrayStats {

    public static void main(String[] args) {
        boolean keepRunning = true;
        while (keepRunning) {
            int[] numbers = getInput();
            calculateStats(numbers);
            keepRunning = runProgram(numbers);
        }
        System.out.println("End of program.");
    }

    /**
     * Prompts the user to enter the size of the array and its elements.
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
     * Calculates the total sum of elements in the array.
     * * @param arr the array of integers to process.
     * 
     * @return the sum of all elements.
     */
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * Finds the minimum value within the array.
     * * @param arr the array of integers to process.
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
     * Finds the maximum value within the array.
     * * @param arr the array of integers to process.
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
     * Calculates the arithmetic mean of all elements in the given array.
     * * @param arr the array of integers to analyze.
     * 
     * @return the average value as a double.
     */
    public static double calculateAverage(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }

    /**
     * Calculates the median value of the array elements.
     * * @param arr the array of integers to analyze.
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

    /**
     * Displays all calculated statistics (Sum, Min, Max, Average, Median).
     * * @param numbers the array of integers to analyze.
     */
    public static void calculateStats(int[] numbers) {
        System.out.println("Statistic Results:");
        System.out.println("Sum: " + calculateSum(numbers));
        System.out.println("Minimum: " + findMinimum(numbers));
        System.out.println("Maximum: " + findMaximum(numbers));
        System.out.printf("Average: %.2f%n", calculateAverage(numbers));
        System.out.printf("Median: %.2f%n", calculateMedian(numbers));
    }

    /**
     * Manages the interactive menu for searching values and getting values at
     * indices.
     * * @param numbers the current dataset to be used in the interactive mode.
     * 
     * @return true if the user wants to enter a new dataset, false to exit.
     */
    public static boolean runProgram(int[] numbers) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n --- Interactive Mode ---");
            System.out.println("1. Search for a number");
            System.out.println("2. Get value at index");
            System.out.println("3. Enter a new set of numbers");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter number to search: ");
                int num_search = sc.nextInt();
                int count = 0;
                for (int num : numbers) {
                    if (num == num_search)
                        count++;
                }
                if (count > 0) {
                    System.out.println(num_search + " appears " + count + " time(s).");
                } else {
                    System.out.println(num_search + " is not in the array.");
                }
            } else if (choice == 2) {
                System.out.print("Enter index (0 to " + (numbers.length - 1) + "): ");
                int num_index = sc.nextInt();
                if (num_index >= numbers.length || num_index < 0) {
                    System.out.println("Error: Index out of bounds.");
                } else {
                    System.out.println("Value at index " + num_index + " is: " + numbers[num_index]);
                }
            } else if (choice == 3) {
                System.out.println("\n ---------------------------");
                return true;
            } else if (choice == 4) {
                System.out.println("Bye!");
                return false;
            } else {
                System.out.println("Invalid choice.");
            }

            System.out.print("Do you want to continue with this dataset? (y/n): ");
            char cout = sc.next().toLowerCase().charAt(0);
            if (cout == 'n') {
                System.out.println("Bye!");
                return false;
            }
        }
    }
}