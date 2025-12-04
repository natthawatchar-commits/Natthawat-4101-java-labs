package charoensuk.natthawat.lab2;

/**
 * This program checks whether the given school name
 * contains the word "university" or "college".
 * It prints the corresponding result.
 */

public class schoolnamechecker {
    public static void main(String[]args){
        // Check if exactly one argument is provided
        if(args.length == 1){
            String schoolName = args[0];  // Read the input school name
            String lowerCaseName = schoolName.toLowerCase();  // Convert to lowercase for case-insensitive checking
            
            // Check for keywords
            if(lowerCaseName.contains("university")){
                System.out.println(schoolName + " is a university");

            } else if(lowerCaseName.contains("college")){
                System.out.println(schoolName + " is a college");

            } else {
                System.out.println(schoolName + " is neither a university nor a college");
                
            }
        }else{
            System.err.println("Error: Invalid number of arguments. Please provide exactly one arguments");
        }
    }
}
