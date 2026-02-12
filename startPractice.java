// 2D Array Review
import java.util.Scanner;
public class startPractice {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++ ){
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextInt();
            }
        }
        for (int row = 0; row < matrix.length; row++ ) {
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int)(Math.random() * 100);
            }
        }
        for (int row = 0; row < matrix.length; row++ ){
            for (int column = 0; column < matrix[row].length; column++){
                System.out.print (matrix[row][column] + "");
            }
        }
        System.out.println();
        // sum of all elements
        int total = 0;
        for (int row = 0; row < matrix.length; row++ ){
            for (int column = 0; column < matrix[row].length; column++){
                total += matrix[row][column];
            }
        }
        System.out.println("The total of your matrix is: " + total);
        // sum of column
        for (int column = 0; column < matrix[0].length; column++){
            int totalcolumn = 0;
            for (int row = 0; row < matrix.length; row++ ){
                total += matrix[row] [column];
            }
        }

    }
}