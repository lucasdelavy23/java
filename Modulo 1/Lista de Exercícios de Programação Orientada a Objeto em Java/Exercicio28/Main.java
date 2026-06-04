package Exercicio28;

import java.util.*;

/*Crie uma classe ContaBancaria com os atributos privados titular e saldo. O atributo
titular pode possuir métodos get e set. O atributo saldo deve possuir apenas método
get, pois o saldo não deve ser alterado diretamente pela classe principal.
A alteração do saldo deve acontecer somente por meio dos métodos depositar e sacar. O
método depositar deve aceitar apenas valores positivos. O método sacar deve permitir
o saque apenas se o valor for positivo e se houver saldo suficiente.
Na classe principal, crie uma conta bancária e permita que o usuário realize depósitos,
saques e consultas de saldo por meio de um menu. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();

        System.out.println("Digite o nome do Titular da conta: ");
        String owner = input.nextLine();
        conta1.setOwner(owner);

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
                    System.out.println("Saldo: R$" + conta1.getBalance());
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
