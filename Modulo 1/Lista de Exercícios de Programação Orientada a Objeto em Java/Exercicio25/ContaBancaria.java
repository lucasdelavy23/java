package Exercicio25;

public class ContaBancaria {
    // Atributos
    String owner;
    double balance;

    // Metodos

    public ContaBancaria(String owner) {
        this.owner = owner;
        this.balance = 0.0;
    }

    public ContaBancaria(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
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
