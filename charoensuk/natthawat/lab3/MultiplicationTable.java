package charoensuk.natthawat.lab3;

public class MultiplicationTable {
    // กำหนดค่าคงที่สำหรับขนาดเริ่มต้นและขนาดสูงสุด
    static final int default_size = 5;
    static final int max_size = 12;
    
    // ฟังก์ชันสำหรับเช็คว่าเป็น จำนวนเฉพาะ
    public static boolean isPrime(int number){
        // เลข 1 และเลขติดลบไม่ใช่จำนวนเฉพาะ
        if(number <= 1 ){
            return false;
        }
        // เอาเลข i ไปหารถ้าหารลงตัวแสดงว่าไม่ใช่จำนวนเฉพาะ
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int n = 0;
        if(args.length == 0){
            System.out.println("No size argument provided, using default size 5.");
            n = default_size;
        } else {
            int inputSize = Integer.parseInt(args[0]);// แปลงข้อความที่รับมาเป็นตัวเลข

            if(inputSize <= 0){
                System.out.println("Size must be a positive integer. Use default size 5");
                n = default_size;
            } else if(inputSize > 12){
                System.out.println("Size is too large, using maximum size 12");
                n = max_size;
            } else {
                n = inputSize;
                System.out.println("Multiplication Table of size " + n + ":");
            }
        }
        // วาดตารางสูตรคูณโดยใช้ Nested Loop
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.printf("%4d" , i * j);
            }
            System.out.println(); // จบแถวแล้วขึ้นบรรทัดใหม่
        }

        System.out.println("Prime Number:");
        System.out.print("[");

        boolean isFirst = true; // ตัวแปรช่วยจัดการเครื่องหมาย ,
        for (int i = 2; i <= n; i++){
            if(isPrime(i)){
                if(!isFirst){
                    // ถ้าไม่ใช่ตัวแรก ให้พิมพ์ ,
                    System.out.print(",");
                }
                
                System.out.print(i);
                isFirst = false;
            }
        }
        System.out.print("]");
    }
}
