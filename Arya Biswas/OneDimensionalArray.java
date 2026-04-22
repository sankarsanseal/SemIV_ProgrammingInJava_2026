import java.util.Scanner;
public class OneDimensionalArray {
    public static void main(String[] args) {
        int array1 [] = new int[5];
        int array2 [] = new int[5];
        Scanner scan = new Scanner(System.in);
         for (int i = 0 ; i < array1.length; i++)
         {
            System.out.println("Enter the " +   (i+1)   +  "element's value:");
            array1[i] = scan.nextInt();
         }
         
         for (int i = 0 ; i < array2.length; i++)
         {
            System.out.println("Enter the 2nd Array" +  (i+1)  + "element's value:");
            array2[i] = scan.nextInt();
         }
         int array3 [] = new int[5];
         int array3_dup[] = array3;
         for (int i = 0 ; i < array3.length; i++)
         {
            array3[i] = array1[i] + array2[i];
         }
        for (int i=0 ; i< array3_dup.length; i++)
        {
             System.out.println(array3_dup[i]);
        }

    }
}
