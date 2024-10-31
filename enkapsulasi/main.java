package enkapsulasi;

public class main {
    public static void main(String[] args) {
        bankAccount jeshuaMatthew = new bankAccount(100);

        jeshuaMatthew.withdraw(10);
        System.out.println("Current balance is : " + jeshuaMatthew.getBalance());
    }
}
