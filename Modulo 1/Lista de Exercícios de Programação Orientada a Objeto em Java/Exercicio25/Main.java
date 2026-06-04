package Exercicio25;

import java.util.*;

/*Crie uma classe ContaBancaria com os atributos titular e saldo. A classe deve possuir
dois construtores.
O primeiro construtor deve receber apenas o nome do titular. Nesse caso, o saldo da
conta deve começar em zero. O segundo construtor deve receber o nome do titular e o
saldo inicial.
A classe deve possuir os métodos depositar, sacar e mostrarSaldo. Na classe principal,
crie uma conta usando apenas o nome do titular e outra conta usando nome e saldo inicial.
Depois, realize pelo menos um depósito e um saque em cada conta. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do Titular da Conta: ");
        String owner = input.nextLine();

        ContaBancaria conta1 = new ContaBancaria(owner);
        conta1.balance();
        System.out.println("Digite o valor para sacar:");
        double withdraw = input.nextDouble();
        input.nextLine();

        System.out.println("Digite o valor para depósito:");
        double deposit = input.nextDouble();
        input.nextLine();
        conta1.deposit(deposit);
        conta1.balance();
        System.out.print("\033[H\033[2J");

        conta1.withdraw(withdraw);
        conta1.balance();
        System.out.print("\033[H\033[2J");

        System.out.println("Digite o nome do Titular da Conta:");
        owner = input.nextLine();

        System.out.println("Digite o saldo inicial da conta: ");
        double balance = input.nextDouble();
        input.nextLine();

        ContaBancaria conta2 = new ContaBancaria(owner, balance);
        conta2.balance();

        System.out.println("Digite o valor para depósito:");
        deposit = input.nextDouble();
        input.nextLine();
        conta1.deposit(deposit);
        conta1.balance();
        System.out.print("\033[H\033[2J");

        input.close();
    }
}
