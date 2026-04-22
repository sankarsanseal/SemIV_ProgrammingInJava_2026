import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[5];

        Scanner scn = new Scanner(System.in);
        System.out.println("\nArray 1\n");
        for(int i = 0; i < array1.length; i++){
            System.out.println("Enter the " + (i+1) + " element's value:  ");
            array1[i] = scn.nextInt();
        }

        System.out.println("\nArray 2\n");
        for(int j = 0; j < array2.length; j++){
            System.out.println("Enter the " + (j+1) + " element's value:  ");
            array2[j] = scn.nextInt();
        }

        System.out.println("\nResaultant Array\n");
        for(int k = 0; k < array1.length; k++){
            System.out.print("Resultant array's " + (k+1) + " elements value: ");
            array3[k] = array1[k] + array2[k];
            System.out.println(array3[k]);
        }
    }
    
}
