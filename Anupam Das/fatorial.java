import java.util.Scanner;
public class fatorial {
    public static void main(String[] args){
        int k=1;
        Scanner scaninput = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int a = scaninput.nextInt();
        for (int i=1 ; i<=a ; i++){
            k = k*i;
        }
        System.out.println("Factorial is : " + k);


    }
}
