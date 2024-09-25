import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter type of Employee :\n 1 for permanent and 2 for temporary");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if(type==1)
        {
            System.out.println("Enter employee ID");
            int id=sc.nextInt();
            System.out.println("Enter employee name");
            String name=sc.next();
            System.out.println("Enter Basic Salary");
            float basicsalary=sc.nextFloat();

            System.out.println("PF");
            float pf=sc.nextFloat();

            Permanent permanent=new Permanent(pf,id,name,basicsalary);
            permanent.calculate();
            permanent.display();
        }
        if(type==2)
        {
            System.out.println("Enter employee ID");
            int id=sc.nextInt();
            System.out.println("Enter employee name");
            String name=sc.next();
            System.out.println("Enter No. Of days worked");
            int noofdays=sc.nextInt();

            System.out.println("Enter Daily Wages");
            int dailywages=sc.nextInt();
            Temporary temporary=new Temporary(dailywages,noofdays,id,name,0);
            temporary.calculate();
            temporary.display();

        }
    }
}