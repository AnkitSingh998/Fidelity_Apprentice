public class Account {
    public static void main(String[] args) {
        Bank acc=new Bank(10,"Adil",40000);
        acc.display();
        acc.deposit(2000);
        acc.display();
        acc.withdraw(9000);
        acc.display();
    }
}
