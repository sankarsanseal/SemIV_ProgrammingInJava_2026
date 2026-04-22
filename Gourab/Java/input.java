import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your p:");
        int p = input.nextInt();

        System.out.println("Enter your r:" );
        int r = input.nextInt();

        System.out.println("Enter your t:");
        int t = input.nextInt();

         int i = p * r * t / 100;
         
        System.out.println("The interest is: " + i);
    }
    
}
