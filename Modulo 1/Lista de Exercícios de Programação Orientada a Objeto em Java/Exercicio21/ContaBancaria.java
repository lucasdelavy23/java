package Exercicio21;

public class ContaBancaria {
    // Atributos
    String owner;
    double balance;

    // Metodos
    public ContaBancaria(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("Saldo da Conta: " + this.balance);
    }

    public double deposit(double deposit) {
        balance += deposit;
        return balance;
    }

    public double withdraw(double withdraw) {
        if (balance >= withdraw) {
            balance -= withdraw;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        return balance;
    }
}
