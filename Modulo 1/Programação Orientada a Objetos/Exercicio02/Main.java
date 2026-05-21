public class Main {
    public static void main(String[] args) {

        Account account = new Account();
        account.holder = "Lucas";

        account.description();

        account.deposit(500.0);
        account.description();

        account.withdraw(300.0);
        account.description();

        account.withdraw(300.0);
        account.description();
    }
}
