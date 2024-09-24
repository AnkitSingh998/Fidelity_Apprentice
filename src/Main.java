import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter student's marks");
        int marks=sc.nextInt();
        String grade;
        if(marks>90)
        {
            System.out.println("Grade is A");
            grade="A";
        }
        else if(marks>80 && marks<90)
        {
            System.out.println("B Grade");
            grade="B";
        }
        else if(marks>70 && marks<80)
        {
            System.out.println("C Grade");
            grade="C";
        }
        else {
            System.out.println("D Grade");
           grade="D";
        }
        switch(grade)
        {
            case "A":
                System.out.println("Excellent");
                break;
             case "B":
                 System.out.println("Good");
                 break;
                 case "C":
                     System.out.println("Average");
                     break;
            default:
                System.out.println("Not good");
        }


    }
}