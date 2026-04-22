import java.util.Scanner;
public class forLoop{
    public static void main(String[] args){
        Scanner scaninput = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int n1 = scaninput.nextInt();
        System.out.println("Enter the upper limit: ");
        int n2 = scaninput.nextInt();
        for(int i = n1 ; i <= n2 ; i++){
            System.out.println(i);
        }
    }
}