package Exercicio21;

import java.util.*;

/*Crie uma classe chamada ContaBancaria. Essa classe deve possuir os atributos titular,
do tipo String, e saldo, do tipo double. Crie um construtor que receba o nome do
titular e o saldo inicial da conta.
A classe deve possuir os métodos depositar, sacar e mostrarSaldo. O método depositar
deve receber um valor como parâmetro e somar esse valor ao saldo. O método sacar deve
receber um valor como parâmetro e diminuir esse valor do saldo somente se houver saldo
suficiente. Caso o saldo seja insuficiente, o método deve exibir uma mensagem informando
que o saque não foi realizado.
Na classe principal, crie uma conta bancária com os dados informados pelo usuário. Depois,
crie um menu com as opções de depositar, sacar, mostrar saldo e sair. O menu deve
funcionar usando uma estrutura while. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do Titular da conta: ");
        String owner = input.nextLine();

        System.out.println("Digite o saldo inicial da conta: ");
        double balance = input.nextDouble();
        input.nextLine();

        ContaBancaria conta1 = new ContaBancaria(owner, balance);

        boolean run = true;
        while (run) {
            System.out.println("--- MENU ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Mostrar Saldo");
            System.out.println("4 - Sair");
            System.out.println("Digite a Opção Desejada: ");
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.println("DIgite o valor para depositar: ");
                    double deposit = input.nextDouble();
                    input.nextLine();
                    conta1.deposit(deposit);
                    break;

                case 2:
                    System.out.println("Digite o valor para sacar: ");
                    double withdraw = input.nextDouble();
                    input.nextLine();
                    conta1.withdraw(withdraw);
                    break;

                case 3:
                    conta1.showBalance();
                    break;

                case 4:
                    System.out.println("Programa finalizado!");
                    run = false;
                    break;

                default:
                    System.out.println("Opção digitada inválida!");
                    break;
            }

        }
        input.close();
    }
}
