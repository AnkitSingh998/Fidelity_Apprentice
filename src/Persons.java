import java.util.Scanner;

public class Persons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person");
        String name = sc.nextLine();
        System.out.println("Enter the age of the person");
        int age = sc.nextInt();
        System.out.println("Enter the gender of the person");
        String gender = sc.next();
        Person p= new Person(name,age,gender);
        p.Display();
    }
}
