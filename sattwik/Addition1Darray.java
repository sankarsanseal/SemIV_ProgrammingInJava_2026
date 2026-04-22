import java.util.Scanner;

public class Addition1Darray {
 public static void main(String[] args) {

 int array1 [] = new int[5];
 int array2 [] = new int[5];

 Scanner scanner = new Scanner(System.in);

 for (int i = 0 ; i < array1.length; i++)
 {
    System.out.println("Enter the " + (i+1) + " element's value:");
    array1[i] = scanner.nextInt();
 }
 for (int i = 0 ; i < array1.length; i++)
 {
 System.out.println(array1[i]);
 }
 for (int i = 0 ; i < array2.length; i++)
 {
 System.out.println("Enter the " + (i+1) + " element's value:");
 array2[i] = scanner.nextInt();
 }
 for (int i = 0 ; i < array2.length; i++)
 {
 System.out.println(array2[i]);
 }
 int array3 [] = new int[array1.length];
 for (int i = 0 ; i < array1.length; i++)
 {
    array3[i] = array1[i] +  array2[i];
 }
 int array_3_dup [] = array3;
 System.out.print("the result is " );
 for (int i = 0 ; i < array_3_dup.length; i++)
 {
 System.out.print(array_3_dup[i] + " " );
 }
 System.out.println();
 }
}