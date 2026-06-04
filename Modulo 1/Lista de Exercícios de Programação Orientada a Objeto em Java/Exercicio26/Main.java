package Exercicio26;

import java.util.*;

/*Crie uma classe Produto com os atributos privados nome, preco e quantidade. Como
os atributos devem ser privados, eles não devem ser acessados diretamente pela classe
principal.
Crie métodos get e set para cada atributo. O método setPreco deve aceitar apenas
valores maiores ou iguais a zero. Se o usuário tentar definir um preço negativo, o programa
deve mostrar uma mensagem de erro e não deve alterar o preço. O método setQuantidade
também deve aceitar apenas valores maiores ou iguais a zero.
Na classe principal, leia os dados de um produto usando Scanner, crie um objeto da
classe Produto, use os métodos set para preencher os dados e depois exiba as informações
usando os métodos get. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto p1 = new Produto();

        System.out.println("Digite o nome do produto: ");
        String name = input.nextLine();
        p1.setName(name);

        System.out.println("Digite o preço:");
        double price = input.nextDouble();
        input.nextLine();
        p1.setPrice(price);

        System.out.println("Digite a quantidade:");
        int qtd = input.nextInt();
        input.nextLine();
        p1.setQtd(qtd);

        System.out.println("Nome do produto: " + p1.getName());
        System.out.println("Preço: R$" + p1.getPrice());
        System.out.println("Quantidade: " + p1.getQtd());

        input.close();
    }
}
