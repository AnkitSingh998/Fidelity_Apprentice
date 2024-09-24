import java.util.Scanner;

public class Question5 {
    public static void check(int age)
    {
        if(age>=18)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        check(age);

    }
}
