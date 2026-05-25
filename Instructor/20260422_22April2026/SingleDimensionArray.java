import java.util.Scanner;

public class SingleDimensionArray {
    public static void main(String[] args) {
        // int [] array1
        int array1[] = new int[5];
        int array2[] = new int[5];

        int array_1_dup[] = array1;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter the " + (i + 1) +
                    " element's value:");
            array1[i] = scanner.nextInt();
        }

        for (int j = 0; j < array_1_dup.length; j++) {
            System.out.println(array_1_dup[j]);
        }
    }

}
