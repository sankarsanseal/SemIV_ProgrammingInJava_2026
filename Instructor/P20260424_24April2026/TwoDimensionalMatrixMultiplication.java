
/*
A Java Program for Matrix Multiplication of two 2D
matrices.
The number of rows and columns will be provided by
a user.
*/
import java.util.Scanner;

public class TwoDimensionalMatrixMultiplication {
   public static void main(String[] args) {
      int n_rows_1, n_cols_1, n_rows_2, n_cols_2;
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter the row and col of matrix 01:");
      n_rows_1 = scn.nextInt();
      n_cols_1 = scn.nextInt();
      System.out.println("Enter the row and col of matrix 02:");
      n_rows_2 = scn.nextInt();
      n_cols_2 = scn.nextInt();
      if (n_cols_1 == n_rows_2) {
         double matrix01[][] = new double[n_rows_1][n_cols_1];
         double matrix02[][] = new double[n_rows_2][n_cols_2];
         double matrix_result[][] = new double[n_rows_1][n_cols_2];

         System.out.println("Enter the values of matrix 01");
         for (int i = 0; i < matrix01.length; i++) {
            for (int j = 0; j < matrix01[i].length; j++) {
               System.out.println("There the value of ("
                     + i + ", " + j + ") location.");
               matrix01[i][j] = scn.nextDouble();
            }
         }
         System.out.println("Enter the values of matrix 02");
         for (int i = 0; i < matrix02.length; i++) {
            for (int j = 0; j < matrix02[i].length; j++) {
               System.out.println("There the value of ("
                     + i + ", " + j + ") location.");
               matrix02[i][j] = scn.nextDouble();
            }
         }
         for (int k = 0; k < n_cols_1; k++) {
            for (int i = 0; i < n_rows_1; i++) {
               for (int j = 0; j < n_cols_2; j++) {
                  matrix_result[i][j] += matrix01[i][k] * matrix02[k][j];
               }
            }
         }
         System.out.println("The result after multiplication:");
         for (int i = 0; i < matrix_result.length; i++) {
            for (int j = 0; j < matrix_result[i].length; j++) {
               System.out.print(matrix_result[i][j] + " ");
            }
            System.out.println();
         }
      } else {
         System.err.println("There is a mismatch between col of matrix 01"
               + " and row of matrix 02.");
      }
      scn.close();
   }
}