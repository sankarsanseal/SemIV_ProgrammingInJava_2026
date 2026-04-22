import java.util.Scanner;

public class SingleDimensionArray {
    public static void main(String[] args) {
        int array1[] = new int[5];
        int array2[] = new int[5];
        int array_1_dup [] = array1;
        Scanner input = new Scanner(System.in);

        for(int i=0; i<array1.length; i++){
            System.out.println("Enter the value"+(i+1));
            array1[i] = input.nextInt();
        }
        for(int j=0; j<array_1_dup.length;j++){
            System.out.print(array_1_dup[j]);

        }
    }
}
