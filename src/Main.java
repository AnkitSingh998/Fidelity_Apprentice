import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary=sc.nextInt();
      Employee emp = new Employee();
      emp.EmpId=111;
      emp.EmpName="Rushi";
      emp.Dept="Tester";
      emp.Initialize(salary);
      emp.Display();
      Employee.show();
    }
}