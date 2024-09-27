import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Enter your country");
        String country=sc.next();
        System.out.println("Welcome"+name+"Your age is"+age+"And you are from"+country);
    }
}
