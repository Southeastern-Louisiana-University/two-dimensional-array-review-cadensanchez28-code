// 2D Array Review
import java.util.Scanner;
public class startPractice2 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        randomelements(matrix);
        userelements(matrix);
        sumofallelements(matrix);
        sumofcolumn(matrix);
        sumoflargestcolumn(matrix);






    }
    public static void randomelements (int[][] array) {
        // random elements
        for (int row = 0; row < array.length; row++ ) {
            for (int column = 0; column < array[row].length; column++){
                array[row][column] = (int)(Math.random() * 100);
            }
        }
        for (int row = 0; row < array.length; row++ ){
            for (int column = 0; column < array[row].length; column++){
                System.out.print (array[row][column] + " ");
            }
        }
        System.out.println();
    }
    public static int[][] userelements (int[][] matrix) {
        // user inputted elements
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++ ){
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextInt();
            }
        }
        return matrix;
    }
    public static void sumofallelements (int[][] matrix) {
        // sum of all elements
        int total = 0;
        for (int row = 0; row < matrix.length; row++ ){
            for (int column = 0; column < matrix[row].length; column++){
                total += matrix[row][column];
            }
        }
        System.out.println("The total of your matrix is: " + total);
    }

        public static void sumofcolumn ( int[][] matrix){
            // sum of column
            for (int column = 0; column < matrix[0].length; column++){
                int totalcolumn = 0;
                for (int row = 0; row < matrix.length; row++) {
                    totalcolumn += matrix[row][column];
                }
                System.out.println("Sum for column " + column + " is " + totalcolumn);
            }
        }
    public static void sumoflargestcolumn ( int[][] matrix){
        //which row has the largest sum column
        int maxrow=0;
        int indexofmaxrow=0;
        for (int column = 0; column < matrix[0].length; column++) {
            maxrow += matrix[0][column];
        }
        for (int row = 0; row < matrix.length; row++) {
            int totalofthisrow=0;
            for (int column = 0; column < matrix[row].length; column++) {
                totalofthisrow += matrix[row][column];
            }
            if (totalofthisrow > maxrow) {
                maxrow = totalofthisrow;
                indexofmaxrow = row;
            }

        }
        System.out.println("Row " + indexofmaxrow + " has maximum sum of " + maxrow);

    }
    }