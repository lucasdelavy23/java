package Exercicio28;

public class ContaBancaria {

    private String owner;
    private double balance;

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public double withdraw(double withdraw) {
        if (withdraw <= balance) {
            balance -= withdraw;
            return balance;
        }
        System.out.println("Saldo insuficiente.");
        return balance;
    }

    public double deposit(double deposit) {
        if (deposit > 0) {
            balance += deposit;
            return balance;
        } else {
            System.out.println("Valor de depósito inválido!");
            return balance;
        }
    }

    public void balance() {
        System.out.println("Titular da Conta: " + this.owner);
        System.out.println("O saldo da conta é: R$" + this.balance);
    }

}
