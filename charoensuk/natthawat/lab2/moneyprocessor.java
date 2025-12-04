package charoensuk.natthawat.lab2;

/**
 * This program calculates the total amount of money based on
 * the number of each type of coin provided as arguments.
 */

public class MoneyProcessor {
    public static void main(String[]args){
        // Check if exactly six arguments are provided
        if(args.length == 6){
            // Convert each argument to number and multiply value
            double num1 = Double.parseDouble(args[0]) * 100;
            double num2 = Double.parseDouble(args[1]) * 20;
            double num3 = Double.parseDouble(args[2]) * 10;
            double num4 = Double.parseDouble(args[3]) * 1;
            double num5 = Double.parseDouble(args[4]) * 0.5;
            double num6 = Double.parseDouble(args[5]) * 0.25;

            double total = num1 + num2 + num3 + num4 + num5 + num6;  // Calculate the total amount
            System.out.println("Total money : " + total + " Baht");  // Display the result

        } else {
            System.err.println("Error: Invalid number of arguments. Please provide exactly six arguments");
        }
    }
}