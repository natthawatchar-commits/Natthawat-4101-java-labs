package charoensuk.natthawat.lab3;

import java.util.Scanner;

public class PatternMaker {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int input;

        // วนลูปทำงานไปเรื่อยๆ จนกว่า User จะพิมพ์ -1
        do{
            System.out.print("Enter an odd integer between 1 and 19 (-1 to quit): ");
            input = sc.nextInt();

            // ตรวจสอบเงื่อนไข Input
            if(input == -1){
                System.out.println("Thank you for using Pattern Maker. Bye!");
                break;
            }else if(input < 1 || input > 19){
                System.out.println("The number must be between 1 and 19");
            }else if(input % 2 == 0){
                System.out.println("The number must be an odd integer.");
            }else{
                // i คือจำนวนดอกจันในแต่ละแถว เริ่มที่ 1 และเพิ่มทีละ 2
                for(int i = 1 ; i <= input ; i +=2 ){
                    // คำนวณช่องว่างข้างหน้าเพื่อให้ดอกจันอยู่ตรงกลาง
                    int spaces = (input-i)/2;
                    for(int j = 0 ; j<spaces ; j++){
                        System.out.print("  ");
                    }   
                    // ลูปสำหรับพิมพ์ดอกจัน
                    for(int j = 0 ; j< i; j++){
                        System.out.print("*");
                        // พิมพ์ช่องว่างคั่นระหว่างดอกจัน ยกเว้นตัวสุดท้ายของแถว
                        if(j < i-1){
                            System.out.print(" ");
                        }
                    }
                    System.out.println(); // จบแถวแล้วขึ้นบรรทัดใหม่
                }
            }
        }while(input != -1);
        
        sc.close();
    }
}
