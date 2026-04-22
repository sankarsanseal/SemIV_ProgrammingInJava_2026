import java.util.Scanner;
public class Factorial2 {
    public static void main(String[] args) {
        int n,i;
        int r =1;
        Scanner scaninput=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=scaninput.nextInt();
        for(i=1;i<=n;i++)
        {
            r=r*i;
        }
            System.out.println("Factorial of "+ n +" is:"+ r);
    }
    
}
