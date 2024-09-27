import java.util.Scanner;

public class BoolRes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number");
        int a = sc.nextInt();
        System.out.println("second number");
        int b = sc.nextInt();

        boolean result=a<b;
        if(result)
        {
            System.out.println("a (" + a + ") is less than b ("+b+")." );
        }
        else {
            System.out.println("b (" + b + ") is less than a ("+a+").");
        }



    }
}
