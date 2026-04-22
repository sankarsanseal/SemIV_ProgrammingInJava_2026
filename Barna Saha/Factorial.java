import java.util.Scanner;
public class Factorial{
    
    public static void main(String[]args){
      int n,i;
      long k=1;
        Scanner scaninput=new Scanner(System.in);
        System.out.println("Enter value of n:");
        n=scaninput.nextInt(); 
        for(i=1;i<=n;i++){
            k=k*i;
        }
         System.out.println(k);
    }
}

