import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String firstName = sc.next();
        System.out.println("Enter your Last Name: ");
        String lastName = sc.next();
        System.out.println("Full Name is: " + firstName + " " + lastName);

    }
}
