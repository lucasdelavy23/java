package Exercicio17;

import java.util.*;

/*Adapte o sistema de estoque do exercício anterior. A classe Produto deve possuir um
método chamado calcularValorTotal, que retorna o preço multiplicado pela quantidade.
No menu principal, acrescente a seguinte opção:
4 - Mostrar valor total do estoque
Quando o usuário escolher essa opção, o programa deve percorrer todos os produtos do
ArrayList, calcular o valor total de cada produto e somar todos esses valores em uma
variável acumuladora. Ao final, o programa deve exibir o valor total de todos os produtos
armazenados no estoque. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Produto> stock = new ArrayList<>();
        boolean run = true;

        while (run) {
            System.out.println("--- MENU ESTOQUE ---");
            System.out.println("1 - Cadastrar Produtos");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Mostrar valor total do estoque");
            System.out.println("4 - Sair\n");
            System.out.println("Digite a opção desejada: ");
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    Produto produto1 = new Produto();
                    System.out.println("--- CADASTRO DE PRODUTOS ---");

                    System.out.println("Digite o nome do produto: ");
                    String name = input.nextLine();
                    produto1.setName(name);

                    System.out.println("Digite o preço do produto: ");
                    double price = input.nextDouble();
                    input.nextLine();
                    produto1.setPrice(price);

                    System.out.println("Digite a quantidade do produto: ");
                    int qtd = input.nextInt();
                    input.nextLine();
                    produto1.setQtd(qtd);

                    stock.add(produto1);
                    break;

                case 2:
                    System.out.println("--- Lista de Produtos Cadastrados --- ");
                    for (int i = 0; i < stock.size(); i++) {
                        stock.get(i).showDetails();
                    }
                    break;

                case 3:
                    System.out.println("--- Valor total do estoque ---");
                    double stockValue = 0;
                    for (int i = 0; i < stock.size(); i++) {
                        stockValue += stock.get(i).calculateTotalValue();
                    }

                    System.out.println("O valor total do estoque é: R$" + stockValue);
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    run = false;
                    break;
                default:
                    System.out.println("Opção digitada inválida.");
                    break;
            }
        }
        input.close();
    }
}