package Exercicio18;

import java.util.*;

/*Adapte o sistema de estoque do exercício anterior. Acrescente ao menu a seguinte opção:
5 - Buscar produto por nome
Quando o usuário escolher essa opção, o programa deve pedir o nome do produto que
será buscado. Em seguida, deve percorrer o ArrayList e comparar o nome digitado com
o nome de cada produto cadastrado.
Se o produto for encontrado, o programa deve exibir os dados desse produto. Se o produto
não for encontrado, o programa deve exibir a mensagem "Produto nao encontrado".
Neste exercício, também deve ser usada uma variável booleana para controlar se a busca
encontrou algum produto. */
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
            System.out.println("4 - Sair");
            System.out.println("5 - Buscar produto por nome");
            System.out.println("Digite a opção desejada: \n");
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
                    System.out.println("--- LISTA DE PRODUTOS CADASTRADOS --- ");
                    for (int i = 0; i < stock.size(); i++) {
                        stock.get(i).showDetails();
                    }
                    break;

                case 3:
                    System.out.println("--- VALOR TOTAL DO ESTOQUE ---");
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

                case 5:
                    System.out.println("--- BUSCA DE PRODUTOS ---");
                    System.out.println("Digite o nome do produto a ser buscado: ");
                    String search = input.nextLine();
                    boolean find = Produto.stockSearch(stock, search);
                    if (!find) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                default:
                    System.out.println("Opção digitada inválida.");
                    break;
            }
        }
        input.close();
    }
}