package enkapsulasi;

public class bankAccount {
    private double balance;

    public bankAccount(final double balance) {
        this.balance = balance;
    }

    public void deposit(double jumlah) {
        if (jumlah > 0) {
            balance += jumlah;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double jumlah) {
        if (jumlah > 0 && balance >= jumlah) {
            balance -= jumlah;
        }
    }
}
