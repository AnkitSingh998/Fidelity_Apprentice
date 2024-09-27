import java.util.Scanner;

public class Account2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        System.out.print("Enter account name: ");
        String name = sc.next();
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();
        Account ac= new Account(account, name, balance);
        System.out.println("enter amount to withdraw: ");
        double amount = sc.nextDouble();
        ac.Withdraw(amount);
        System.out.println(ac.GetDetails());


    }
}
