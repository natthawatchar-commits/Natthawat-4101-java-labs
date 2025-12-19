package charoensuk.natthawat.lab3;

import java.util.Scanner;

public class ConfigurableRPSGames {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        do {
            playGame();
        } while (wantToPlayAgain());
        sc.close();
    }
    public static void playGame(){
        System.out.print("Enter move (r/p/s or R/P/S or 0/1/2): ");
        String input = sc.next();
        //สร้างตัวแปรมาเก็บค่าที่ผู้เล่นเลือก
        
        String userchoiceStr = "";
        int userchoiceint = -1;
        //เปลี่ยนค่าให้ 0,r,R ออกมาเป็นค่าเดียวกัน
        switch (input) {
            case "0":
            case "r":
            case "R":
                userchoiceint = 0;
                userchoiceStr = "Rock";
                break;
            case "1":
            case "p":
            case "P":
                userchoiceint = 1;
                userchoiceStr = "Paper";
                break;
            case "2":
            case "s":
            case "S":
                userchoiceint = 2;
                userchoiceStr = "Scissors";
                break;
            default:
                System.out.println("Invalid move!");
                return;
        }
        //กำหนดค่า max,min เพื่อใช้คำนวณการสุ่มเลข
        System.out.println("User choose: " + userchoiceStr);
        int max = 2;
        int min = 0;
        int comchoiceint =min + (int)(Math.random()*((max-min)+1)); //สร้างค่ามาเก็บตัวแปรสุ่มเลข 0,1,2 ของบอท
        String comchoicestr = ""; //สร้างตัวแปรมาเก็บค่าที่เป็น String ของบอท
        //กำหนดค่าที่บอทเลือกว่าได้ ค้อน,กรรไกร,กระดาษ โดยเทียบกับค่าทึ่สุ่มได้ใน comchoiceint
        if(comchoiceint == 0){
            comchoicestr = "Rock";
        } else if(comchoiceint == 1){
            comchoicestr = "Paper";
        } else {
            comchoicestr = "Scissors";
        }
        System.out.println("Computer choose: " + comchoicestr);

        //เช็คว่าฝ่ายไหนจะชนะ
        if(comchoiceint == userchoiceint){
            System.out.println("It's a tie! Both chose " + userchoiceStr);
        } else if(comchoiceint > userchoiceint) {
            if(comchoiceint == 2 && userchoiceint == 0){
                System.out.println(userchoiceStr + " beats " + comchoicestr + ". You win!");
            } else {
                System.out.println(comchoicestr + " beats " + userchoiceStr + ". You lose!");
            }
        } else if(comchoiceint < userchoiceint){
            if(comchoiceint == 0 && userchoiceint == 2){
                System.out.println(comchoicestr + " beats " + userchoiceStr + ". You lose!");
            } else {
                System.out.println(userchoiceStr + " beats " + comchoicestr + ". You win!");
            }
        }
    }

    // Method ถามความสมัครใจว่าจะเล่นต่อไหม
    public static boolean wantToPlayAgain(){
        System.out.print("Do you want to play again? (y/n): ");
        String answer = sc.next();
        
        if (answer.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }
}
