package Exercicio23;

import java.util.*;

/*Crie uma classe Produto com os atributos nome, preco e quantidade. A classe deve
possuir dois construtores.
O primeiro construtor deve receber apenas nome e preco. Nesse caso, a quantidade do
produto deve começar com valor zero. O segundo construtor deve receber nome, preco
e quantidade. Nesse caso, todos os atributos devem ser inicializados com os valores
recebidos.
Na classe principal, crie dois produtos. O primeiro deve ser criado usando o construtor
que recebe apenas nome e preço. O segundo deve ser criado usando o construtor que
recebe nome, preço e quantidade. Depois, exiba os dados dos dois produtos. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String name = input.nextLine();

        System.out.println("Digite o preço do produto:");
        double price = input.nextDouble();
        input.nextLine();

        Produto p1 = new Produto(name, price);

        System.out.println("Digite o nome do produto:");
        name = input.nextLine();

        System.out.println("Digite o preço do produto:");
        price = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a quantidade do produto:");
        int qtd = input.nextInt();
        input.nextLine();

        Produto p2 = new Produto(name, price, qtd);

        System.out.print("\033[H\033[2J");

        System.out.println("--- P1 ---");
        p1.showDetails();
        System.out.println("\n--- P2 ---");
        p2.showDetails();

        input.close();
    }

}
