import java.util.Scanner;

public class cond2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your number:");
        int n = input.nextInt();

        if (n<0) {
            System.out.println("The number is negative.");
        }
        else
            System.out.println("The number is positive.");
    }
}
