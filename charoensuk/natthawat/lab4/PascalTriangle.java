package charoensuk.natthawat.lab4;

import java.util.Scanner;

/**
 * The PascalTriangle class generates and displays Pascal's Triangle.
 * It utilizes a jagged array structure where each row's length increases by
 * one,
 * and each element is calculated as the sum of two elements from the previous
 * row.
 * 
 * @author Natthawat Charoensuk
 * @version 1.0, 26/12/2025
 * @Student_ID 683040410-1
 * @Section 2
 */
public class PascalTriangle {
    /**
     * The main method prompts the user for the number of rows and prints
     * the generated Pascal's Triangle to the console.
     * * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Error: Rows must be positive.");
            sc.close();
            return;
        }

        // สร้าง Jagged Array ตามจำนวนแถวที่รับมา
        int[][] triangle = new int[rows][];

        for (int i = 0; i < rows; i++) {
            // กำหนดขนาดของคอลัมน์ในแต่ละแถว (แถวที่ i จะมี i+1 ตัว)
            triangle[i] = new int[i + 1];

            for (int j = 0; j <= i; j++) {
                // ขอบซ้ายสุดและขวาสุดของสามเหลี่ยมมีค่าเป็น 1 เสมอ
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    // ค่าตรงกลางคือผลรวมของตัวเลขสองตัวที่อยู่เหนือขึ้นไปในแถวก่อนหน้า
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        System.out.println("Pascal's Triangle: ");
        // แสดงผลข้อมูลในรูปแบบสามเหลี่ยม
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}