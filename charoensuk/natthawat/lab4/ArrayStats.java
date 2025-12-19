package charoensuk.natthawat.lab4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayStats {
    public static void main(String[]args){
        int[] numbers = getInput();
        System.out.println("Statistic Results:");
        System.out.println("Sum: " + calculateSum(numbers));
        System.out.println("Minimum: " + findMinimum(numbers));
        System.out.println("Maximum: " + findMaximum(numbers));
        System.out.printf("Average: %.2f%n" , calculateAverage(numbers));
        System.out.printf("Median: %.2f%n" , calculateMedian(numbers));
    }
    public static int[] getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        if(size <=0 ){
            System.out.print("Error: Size must be a positive integer.");
            System.exit(1);
        }
        int[] arr = new int[size];
        for(int i = 0; i < size ; i++ ){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static int calculateSum(int[] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int num = arr[i];
            sum += num;
        }
        return sum;
    }
    public static int findMinimum(int[]arr){
        int min = arr[0];
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMaximum(int[]arr){
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static double calculateAverage(int[]arr){
        double Average = (double)calculateSum(arr)/arr.length;
        return Average;
    }
    public static double calculateMedian(int[]arr){
        int[] copy = arr.clone();
        Arrays.sort(copy);
        int n = copy.length;
        double med = arr[0];
        if(n % 2 != 0){
            med = copy[n/2];
        } else {
            med = (copy[(n/2)] + copy[(n/2)-1])/2;
        }
        return med;
    }
}
