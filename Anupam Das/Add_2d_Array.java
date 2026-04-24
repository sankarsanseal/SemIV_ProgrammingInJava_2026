/*This programme takes values of two matrices from user and 
   displays them and calculates the result of addition of 
   the two matrices.*/
import java.util.Scanner;
public class Add_2d_Array {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the no. of Rows:  ");
        int row = scn.nextInt();

        System.out.print("Enter the no. of Columns:  ");
        int column = scn.nextInt();

        int array1 [][] = new int [row][column];
        int array2 [][] = new int [row][column];
        int array3 [][] = new int [row][column];

        System.out.println("\nM A T R I X  01");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                System.out.print("\nElement at index " + i+j + " :  ");
                array1 [i][j] = scn.nextInt();
            }
        }

        System.out.println("\nYour Matrix_01 is: \n");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                System.out.print( array1 [i][j] + "   ");
            }
            System.out.println("\n");
        }

        System.out.println("M A T R I X  02");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                System.out.print("\nElement at index " + i+j + " :  ");
                array2 [i][j] = scn.nextInt();
            } 
        } 
        
       System.out.println("\nYour Matrix_02 is: \n");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                System.out.print( array2 [i][j] + "   ");
            }
            System.out.println("\n");
        }

        System.out.println("\nResultant Matrix is: ");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
               array3[i][j] = array1[i][j] + array2[i][j];
               System.out.print(array3[i][j] + "   ");
            }
            System.out.println("\n");
        }
    }
}
