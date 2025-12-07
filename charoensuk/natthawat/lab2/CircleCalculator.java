package charoensuk.natthawat.lab2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CircleCalculator {
    public static void main(String[]args){
        // Check if exactly one argument is provided
        if(args.length == 1 ){
            // Parse the input argument into a double
            double r = Double.parseDouble(args[0]);
            double pi = Math.PI;
            double area = pi * (r*r); // Calculate the area
            double circumference = 2 * pi * r; // Calculate the circumference
            
            //Round all values to 2 decimal places using BigDecimal.
            BigDecimal bdr = new BigDecimal(r).setScale(2, RoundingMode.HALF_UP);
            BigDecimal bdArea = new BigDecimal(area).setScale(2, RoundingMode.HALF_UP);
            BigDecimal bdCircumference = new BigDecimal(circumference).setScale(2, RoundingMode.HALF_UP);
            
            // Check if the radius is negative
            if(r < 0){
                System.err.println("Error: Radius cannot be negative");
                return;
            }
            
            // Output the results
            System.out.println("Radius: " + bdr);
            System.out.println("Area: " + bdArea);
            System.out.println("Circumference: " + bdCircumference);
        
        } else {
            System.err.println("Error: Please provide exactly one non-negative argument for the radius.");
        }
    }
}
