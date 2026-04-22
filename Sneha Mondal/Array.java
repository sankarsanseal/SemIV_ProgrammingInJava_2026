
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        int array1[]=new int[5];
        int array2[]=new int[5];

        int array3[] = new int [5];

        int array_3_dup[] = array3;
        Scanner scanner =new Scanner(System.in);
        
        for(int i=0; i<array1.length;i++){
            System.out.println("Enter the" +  (i+1) + " element's value:");
            array1[i]=scanner.nextInt();
        }
        for(int j=0; j<array2.length;j++){
            System.out.println("Enter the"+  (j+1) + " element's value:");
            array2[j]=scanner.nextInt();
        }
        for(int k=0; k<array3.length; k++){
            array3 [k] = array1 [k] + array2 [k];  
        }
        System.out.println("Sum of the elements is:");
        for(int k=0 ; k<array3.length; k++){
            System.out.println(array3[k] + " ");
        }

    }
}
