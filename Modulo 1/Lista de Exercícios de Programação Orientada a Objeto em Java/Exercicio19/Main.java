package Exercicio19;

import java.util.*;

/*Modifique a classe Produto para que ela possua um construtor. Esse construtor deve
receber três parâmetros: nome, preco e quantidade. Dentro do construtor, os valores
recebidos por parâmetro devem ser atribuídos aos atributos do objeto.
Na classe principal, leia os dados de um produto usando Scanner. Depois, crie o objeto
da classe Produto já passando os valores lidos para o construtor.
Neste exercício, o aluno não deve criar o objeto vazio para depois preencher os atributos.
O objeto deve ser inicializado diretamente pelo construtor. */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String name = input.nextLine();

        System.out.println("Digite o preço do produto: ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a quantidade do produto: ");
        int qtd = input.nextInt();
        input.nextLine();

        Produto produto1 = new Produto(name, price, qtd);

        System.out.println("Nome do Produto: " + produto1.getName() + "\nPreço do Produto: R$" + produto1.getPrice()
                + "\nQuantidade: " + produto1.getQtd());

        input.close();
    }
}
