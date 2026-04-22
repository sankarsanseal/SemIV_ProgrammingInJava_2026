import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your number:");
        int n = input.nextInt();

        if(n%2==0)
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }


        
    }   
    
}
