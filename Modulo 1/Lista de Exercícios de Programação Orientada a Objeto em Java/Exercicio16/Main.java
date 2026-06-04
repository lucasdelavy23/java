package Exercicio16;

import java.util.*;

/*Crie uma classe Produto com os atributos nome, preco e quantidade. A classe deve
possuir um método mostrarDados.
Na classe principal, crie um ArrayList<Produto> chamado estoque. Depois, crie um
menu utilizando while e switch. O menu deve possuir as seguintes opções:
1 - Cadastrar produto
2 - Listar produtos
3 - Sair
Na opção 1, o programa deve pedir os dados de um produto, criar um objeto e adicioná-lo
ao ArrayList. Na opção 2, o programa deve percorrer o ArrayList e mostrar os dados
de todos os produtos cadastrados. Na opção 3, o programa deve encerrar a execução.
O menu deve continuar aparecendo enquanto o usuário não escolher a opção de sair. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Produto> stock = new ArrayList<>();
        boolean run = true;

        while (run) {
            System.out.println("--- MENU ESTOQUE ---");
            System.out.println("1 - Cadastrar Produtos");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Sair\n");
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