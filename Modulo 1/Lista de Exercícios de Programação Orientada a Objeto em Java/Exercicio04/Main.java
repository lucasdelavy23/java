package Exercicio04;

import java.util.*;

/*Utilize a classe Produto do exercício anterior. Acrescente um método chamado calcularValorTotal.
Esse método deve retornar o valor total do produto em estoque, calculado pela multiplicação
entre o preço e a quantidade.
A classe deve continuar possuindo o método mostrarDados. Na classe principal, o usuário
deve digitar o nome, o preço e a quantidade de um produto. Depois disso, o programa
deve exibir os dados do produto e também o valor total em estoque.
O cálculo deve ser feito dentro da classe Produto, e não diretamente no método main. O
método main deve apenas chamar o método calcularValorTotal e exibir o resultado. */
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
        produto1.calculateTotalValue();
    }

}