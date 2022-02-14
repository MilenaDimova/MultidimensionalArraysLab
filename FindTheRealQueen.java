package MultidimensionalArraysLab;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 8;
        int cols = 8;
        char queen = 'q';
        char[][] matrix = readMatrix(rows, cols, scanner, "\\s+");

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == queen) {

                }

            }
        }


    }

    public static boolean isInBounds(int row, int col, int[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static char[][] readMatrix(int rows, int cols, Scanner scanner, String splitPattern) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] rowElements = scanner.nextLine().split("\\s+");
            for (int col = 0; col < rowElements.length; col++) {
                char currentElement = rowElements[col].charAt(0);
                matrix[row][col] =  currentElement;
            }
        }
        return matrix;
    }
}
