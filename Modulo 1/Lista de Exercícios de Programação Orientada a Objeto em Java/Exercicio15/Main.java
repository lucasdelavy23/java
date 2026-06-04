package Exercicio15;

import java.util.*;

/*Crie uma classe Produto com os atributos nome, preco e quantidade. A classe deve
possuir um método mostrarDados.
Na classe principal, crie um ArrayList<Produto> para armazenar os produtos cadastrados.
O programa deve permitir que o usuário cadastre produtos até decidir parar. Para
isso, utilize uma estrutura while.
A cada repetição, o programa deve pedir o nome, o preço e a quantidade de um produto,
criar um objeto da classe Produto e adicionar esse objeto ao ArrayList. Depois de cada
cadastro, pergunte ao usuário se ele deseja cadastrar outro produto. Quando o usuário
responder que não deseja continuar, o programa deve listar todos os produtos cadastrados. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        boolean run = true;

        while (run) {
            Produto produto1 = new Produto();
            System.out.println("--- CADASTRO DE PRODUTOS ---");
            System.out.println("Para Cadastradar um produto digite Y ou N para sair do cadastro.");
            String yesOrNo = input.nextLine();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            if (yesOrNo.equalsIgnoreCase("Y")) {

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

                produtos.add(produto1);
            } else {
                run = false;
                System.out.println("Programa finalizado.");
                System.out.println("\n --- Lista de Produtos Cadastrados ---");
                for (int i = 0; i < produtos.size(); i++) {
                    produtos.get(i).showDetails();
                }
            }
        }
        input.close();
    }
}
