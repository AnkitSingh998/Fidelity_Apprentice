public class Bank {
    int acno;
    String name;
    int balance;

    Bank(int acno, String name, int balance) {
        this.acno = acno;
        this.name = name;
        this.balance = balance;
    }
    void deposit(int amount) {
        balance += amount;
    }
    void withdraw(int amount) {
        if(balance >= amount) {
            balance-=amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void display() {
        System.out.println("Name: " + name + "\nBalance: " + balance + "\nAcno: " + acno);
    }
}
