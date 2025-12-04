package charoensuk.natthawat.lab2;

/**
 * The Footballer Program
 * *Purpose:
 * This program accepts three command-line arguments:
 * 1. A football player's name
 * 2. Their nationality
 * 3.The football club they play for
 * *It than processes these inputs and displays them in a specifitc sentence format.
 * *output Example:
 * My favorite football player is Lionel Messi
 * His nationality is Argentina
 * He plays for Inter Miami
 */

public class Footballer {
    public static void main(String[]args){
        if (args.length == 3) {
            String name = args[0];
            String nationality = args[1];
            String clab = args[2];

            System.out.println("My favorite football player is " + name);
            System.out.println("His nationality is " + nationality);
            System.out.println("He plays for " + clab);
        } else {
            System.err.println("Error: Invalid number of arguments. Please provide exactly three arguments");
        }
    }
}
