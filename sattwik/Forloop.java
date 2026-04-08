import java.util.Scanner;
public class Forloop {
    public static void main(String[] args) {
        int a,b,i;
        Scanner scaninput=new Scanner(System.in);
        System.out.println("Enter the value of starting input:");
        a=scaninput.nextInt();
        System.out.println("Enter the value of ending input:");
        b=scaninput.nextInt();
        for(i=a;i<=b;i++)
            System.out.println(i);
    }
}
