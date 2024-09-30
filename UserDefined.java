import java.util.Scanner;

public class UserDefined extends Exception{
    public UserDefined(String message){
        super(message);
    }

}

   class Employee{
    public static void main(String args[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Present or absent /n 1. Present 2. Absent");
            int choice=sc.nextInt();
            if(choice==1)
                throw new UserDefined("The mentioned employee is present");
            else
                System.out.println("The mentioned employee is not present");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
