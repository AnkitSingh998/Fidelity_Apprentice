import java.util.Scanner;

public class SquareCube {

    public static void FindSquare (double a)
    {
        double area=a*a;
        System.out.println("Square of the number is"+area);
    }
    public static void FindCube(double a)
    {
        double area=a*a*a;
        System.out.println("Cube of the number is"+area);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double a = sc.nextDouble();
        SquareCube.FindSquare(a);
        SquareCube.FindCube(a);
    }
}
