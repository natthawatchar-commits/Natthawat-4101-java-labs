package charoensuk.natthawat.lab4;

import java.util.Scanner;

/**
 * DisplayMatrix provides various ways to traverse and display a 2D array
 * (matrix).
 * It includes row-major, column-major, diagonal, and zigzag traversal patterns.
 * 
 * @author Natthawat Charoensuk
 * @version 1.0, 26/12/2025
 * @Student_ID 683040410-1
 * @Section 2
 */
public class DisplayMatrix {
    static int[][] matrix;
    static int rowDim;
    static int colDim;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inputMatrix();
        System.out.println("Show Matrix: ");
        showMatrix();

        System.out.print("By Row: ");
        showMatrixByRow();
        System.out.print("By Column: ");
        showMatrixByColumn();
        System.out.print("By Row Backward: ");
        showMatrixByRowBackward();
        System.out.print("By Column Backward: ");
        showMatrixByColumnBackward();
        System.out.print("Diagonal Top-Left to Bottom-Right: ");
        showMatrixByDiagonalTopLeftBottomRight();
        System.out.print("Diagonal Top-Right to Bottom-Left: ");
        showMatrixByDiagonalTopRightBottomLeft();
        System.out.print("By Row Zigzag: ");
        showMatrixByRowZigzag();
    }

    /**
     * Prompts the user to enter matrix dimensions and elements.
     */
    public static void inputMatrix() {
        System.out.print("Enter number of rows: ");
        rowDim = sc.nextInt();
        System.out.print("Enter number of columns: ");
        colDim = sc.nextInt();
        matrix = new int[rowDim][colDim];

        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    /**
     * Displays the matrix in a standard grid format.
     */
    public static void showMatrix() {
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Displays matrix elements row by row (left to right, top to bottom).
     */
    public static void showMatrixByRow() {
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Displays matrix elements column by column (top to bottom, left to right).
     */
    public static void showMatrixByColumn() {
        for (int j = 0; j < colDim; j++) {
            for (int i = 0; i < rowDim; i++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Displays matrix elements row by row, but backward within each row.
     */
    public static void showMatrixByRowBackward() {
        for (int i = 0; i < rowDim; i++) {
            for (int j = colDim - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Displays matrix elements column by column, but backward (bottom up).
     */
    public static void showMatrixByColumnBackward() {
        for (int j = 0; j < colDim; j++) {
            for (int i = rowDim - 1; i >= 0; i--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Displays the diagonal elements from the top-left to the bottom-right.
     */
    public static void showMatrixByDiagonalTopLeftBottomRight() {
        int minDim = Math.min(rowDim, colDim);
        for (int i = 0; i < minDim; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    /**
     * Displays the diagonal elements from the top-right to the bottom-left.
     */
    public static void showMatrixByDiagonalTopRightBottomLeft() {
        int minDim = Math.min(rowDim, colDim);
        for (int i = 0; i < minDim; i++) {
            System.out.print(matrix[i][colDim - 1 - i] + " ");
        }
        System.out.println();
    }

    /**
     * Displays matrix elements in a zigzag pattern (forward for even rows, backward
     * for odd rows).
     */
    public static void showMatrixByRowZigzag() {
        for (int i = 0; i < rowDim; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < colDim; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = colDim - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}