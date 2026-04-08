import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        int a,b;
        Scanner scaninput=new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=scaninput.nextInt();
        System.out.println("Enter the value of b");
        b=scaninput.nextInt();
        for(int i=a;i<b;i++)
            System.out.println(i);       
    }
}
