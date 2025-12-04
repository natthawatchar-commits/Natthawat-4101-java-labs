package charoensuk.natthawat.lab2;

public class moneyprocessor {
    public static void main(String[]args){
        if(args.length == 6){
            double num1 = Double.parseDouble(args[0]) * 100;
            double num2 = Double.parseDouble(args[1]) * 20;
            double num3 = Double.parseDouble(args[2]) * 10;
            double num4 = Double.parseDouble(args[3]) * 1;
            double num5 = Double.parseDouble(args[4]) * 0.5;
            double num6 = Double.parseDouble(args[5]) * 0.25;

            double sum = num1 + num2 + num3 + num4 + num5 + num6;
            System.out.println("Total money : " + sum);
        } else {
            System.err.println("Error: Invalid number of arguments. Please provide exactly six arguments");
        }
    }
}