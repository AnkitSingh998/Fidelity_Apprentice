public class Account {
    private int id;
    private String name;
    private double balance;
    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public boolean Withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            return true;
        }
        else {
            return false;
        }

    }
    public String GetDetails() {
        return "ID: " + id + "\nName: " + name + "\nBalance: " + balance;
    }
}
