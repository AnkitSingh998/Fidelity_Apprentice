import java.time.LocalDate;
import java.util.Scanner;
public class Age2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter date of birth: ");
        String dobInput=sc.nextLine();
        LocalDate dob = LocalDate.parse(dobInput);
        Age age = new Age(firstName, lastName, dob);
        age.displaydetails();
    }
}
