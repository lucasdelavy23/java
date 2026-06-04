package Exercicio30;

import java.util.*;

/* Crie uma classe chamada Funcionario. Essa classe deve possuir os atributos privados
nome e salario. Crie métodos get e set para esses atributos. A classe também deve
possuir um método chamado calcularSalarioFinal, que retorna o salário do funcionário.
Depois, crie uma classe Gerente que herda de Funcionario. O gerente deve possuir um
bônus fixo de R$ 1000,00. Na classe Gerente, crie um método calcularSalarioFinal
que retorna o salário do gerente somado ao bônus.
Em seguida, crie uma classe Vendedor que herda de Funcionario. O vendedor deve
possuir um atributo privado chamado quantidadeVendas. Cada venda deve gerar uma
comissão de R$ 50,00. Na classe Vendedor, crie um método calcularSalarioFinal que
retorna o salário do vendedor somado à comissão total.
Na classe principal, crie um ArrayList<Funcionario>. Depois, crie um menu com as
seguintes opções:
 1 - Cadastrar gerente
 2 - Cadastrar vendedor
 3 - Listar funcionarios
 4 - Sair
Na opção 1, o programa deve cadastrar um gerente. Na opção 2, o programa deve cadastrar
um vendedor. Na opção 3, o programa deve percorrer o ArrayList e mostrar o
nome e o salário final de cada funcionário. Na opção 4, o programa deve encerrar.
Este exercício deve utilizar herança, encapsulamento, sobrescrita de método, ArrayList,
while, switch e entrada de dados com Scanner. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Funcionario> ListaFuncionarios = new ArrayList<>();

        boolean run = true;
        while (run) {
            System.out.println("--- MENU ---");
            System.out.println("1 - Cadastrar Gerente");
            System.out.println("2 - Cadastrar Vendedor");
            System.out.println("3 - Listar Funcionários");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção desejada:");
            int option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    Gerente gerente1 = new Gerente();
                    System.out.println("--- CADASTRO DE GERENTES ---");
                    System.out.println("Digite o nome do Gerente:");
                    String name = input.nextLine();
                    gerente1.setName(name);

                    System.out.println("Digite o salário do Gerente:");
                    double salary = input.nextDouble();
                    input.nextLine();
                    gerente1.setSalary(salary);

                    ListaFuncionarios.add(gerente1);
                    break;

                case 2:
                    Vendedor vendedor1 = new Vendedor();
                    System.out.println("--- CADASTRO DE VENDEDORES ---");
                    System.out.println("Digite o nome do Vendedor:");
                    name = input.nextLine();
                    vendedor1.setName(name);

                    System.out.println("Digite o salário do Vendedor:");
                    salary = input.nextDouble();
                    input.nextLine();
                    vendedor1.setSalary(salary);

                    System.out.println("Digite a quantidade de vendas:");
                    int qtdVendas = input.nextInt();
                    input.nextLine();
                    vendedor1.setSalesQuantity(qtdVendas);
                    ListaFuncionarios.add(vendedor1);
                    break;

                case 3:
                    System.out.println("--- LISTA DE FUNCIONARIOS ---");
                    for (int i = 0; i < ListaFuncionarios.size(); i++) {
                        Funcionario f = ListaFuncionarios.get(i);
                        System.out.println("Funcionário: " + f.getName());
                        System.out.println("Salário Final: R$" + f.calculateFinalSalary() + "\n");
                    }
                    break;

                case 4:
                    System.out.println("Sistema finalizado!");
                    run = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        input.close();
    }
}
