package Exercicio03;

import java.util.*;

/*Crie uma classe chamada Produto. Essa classe deve possuir os atributos nome, do tipo
String, preco, do tipo double, e quantidade, do tipo int. A classe também deve
possuir um método chamado mostrarDados, responsável por exibir o nome, o preço e a
quantidade do produto.
Na classe principal, utilize Scanner para pedir ao usuário que digite o nome, o preço e
a quantidade de um produto. Depois de ler os dados, crie um objeto da classe Produto,
atribua os valores digitados aos atributos do objeto e chame o método mostrarDados.
Neste exercício, o aluno deve usar obrigatoriamente uma classe para representar o produto
e deve usar Scanner para fazer a entrada de dados. */
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String name = input.nextLine();
        produto1.setName(name);

        System.out.println("Digite o preço do produto: ");
        Double price = input.nextDouble();
        produto1.setPrice(price);
        input.nextLine();

        System.out.println("Digite a quantidade do produto: ");
        int qtd = input.nextInt();
        produto1.setQtd(qtd);
        input.nextLine();

        input.close();

        System.out.print("\033[H\033[2J"); // Limpa Terminal;

        produto1.showDetails();

    }
}