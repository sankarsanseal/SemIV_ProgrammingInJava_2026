import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int a;
        long fact=1;
        Scanner scaninput = new Scanner(System.in);
        System.out.println("Enter the number to get the factorial:");
        a=scaninput.nextInt();
        for(int i=1;i<=a;i++)
            fact*=i;
            System.out.println(fact);
}   
    
}
