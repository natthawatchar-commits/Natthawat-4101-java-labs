package charoensuk.natthawat.lab3;

import java.util.Scanner;

public class PatternMaker {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.print("Enter an odd integer between 1 and 19 (-1 to quit): ");
            input = sc.nextInt();
            if(input == -1){
                System.out.println("Thank you for using Pattern Maker. Bye!");
                break;
            }else if(input < 1 || input > 19){
                System.out.println("The number must be between 1 and 19");
            }else if(input % 2 == 0){
                System.out.println("The number must be an odd integer.");
            }else{
                for(int i = 1 ; i <= input ; i +=2 ){
                    int spaces = (input-i)/2;
                    for(int j = 0 ; j<spaces ; j++){
                        System.out.print("  ");
                    }
                    for(int j = 0 ; j< i; j++){
                        System.out.print("*");
                        if(j < i-1){
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                
            }
        }while(input != -1);
        
        sc.close();

    }
}
