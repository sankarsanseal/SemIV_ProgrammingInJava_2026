import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int a;
        int fact=1;
        Scanner  scaninput=new Scanner(System.in);
         System.out.println("Enter the value of a");
        a=scaninput.nextInt();
        for(int i=1;i<=a;i++)
            fact *=i;
            System.out.println(fact);
    }
    
}
