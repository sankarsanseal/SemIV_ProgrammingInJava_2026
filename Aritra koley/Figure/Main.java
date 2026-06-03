import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        
        System.out.println("...Triangle....");;
        Triangle t = new Triangle();
        System.out.print("Enter 3 Sides");
        t.calculate(A.nextInt(),A.nextInt(), A.nextInt());
        t.display();

        System.out.println("...Sphere.....");
        Sphere s =new Sphere();
        System.out.print("Enter radius:");
        s.calculate(A.nextDouble());
        s.display();

        A.close();
    }
    
}
