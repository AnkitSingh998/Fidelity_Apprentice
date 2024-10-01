import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     First first = new First();

     System.out.println("Enter the number of elements to add from front: ");
     int n = sc.nextInt();
     for(int i=0;i<n;i++)
     {
         int value = sc.nextInt();
         first.addf(value);
     }
     System.out.println("Enter the number of elements to add from back: ");
     int b = sc.nextInt();
     for(int i=0;i<b;i++)
     {
         int value = sc.nextInt();
         first.addl(value);
     }
     System.out.println("Enter the value to add: ");
     int c= sc.nextInt();
     int pos=sc.nextInt();
     first.addAt(pos,c);
     System.out.println("displaying the linked list");
     first.Display();

        System.out.println("displaying the linked list in reverse order");
        first.reverse();
     first.Display();

    }
}