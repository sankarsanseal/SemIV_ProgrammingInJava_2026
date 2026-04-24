/*This is a sum of 2D matrix.
first we declare the row and column number of matrix , then 
we create two individual matrix with element value input.
then we sum the two matrices according to their elements.*/
import java.util.Scanner;

public class Addition2Darray {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int row = scanner.nextInt();
    System.out.println("Enter the number of columns:");
    int column = scanner.nextInt();

    int array1 [][] = new int[row][column];
    int array2 [][] = new int[row][column];

 
    System.out.println("Enter the first matrix value:");
    System.out.println("Enter the " + (row*column) + " element's value:");
    for (int i = 0 ; i < row; i++)
    {
        for (int j = 0 ; j < column; j++)
        {
        int count = (i*column)+j+1;    
        System.out.println("Enter the " + count + "th element's value:");
        array1[i][j] = scanner.nextInt();
        }
        
    }
    
    System.out.println(" the first matrix is:");
    for (int i = 0 ; i < row; i++)
    {
        for (int j = 0 ; j < column; j++)
        {
        System.out.print(array1[i][j] + " ");
        }
        System.out.println();
    }

    System.out.println("Enter the second matrix value:");
    System.out.println("Enter the " + (row*column) + " element's value:");
    for (int i = 0 ; i < row; i++)
    {
        for (int j = 0 ; j < column; j++)
        {
        int count = (i*column)+j+1;    
        System.out.println("Enter the " + count + "th element's value:");
        array2[i][j] = scanner.nextInt();
        }
    }
    
    System.out.println(" the second matrix is:");
    for (int i = 0 ; i < row; i++)
    {
        for (int j = 0 ; j < column; j++)
        {
        System.out.print(array2[i][j] + " ");
        }
        System.out.println();
    }

    int array3 [][] = new int[row][column];

    for (int i = 0 ; i < row; i++)
    {
        for (int j = 0 ; j < column; j++)
        {
        array3[i][j] = array1[i][j] + array2[i][j];
        }
    }

    System.out.println("the resultent matrix is:");
    for (int i = 0 ; i < row; i++)
    {
        for (int j = 0 ; j < column; j++)
        {
        System.out.print(array3[i][j] + " ");
        }
        System.out.print("\n");
    }
    
}

}
