package Exercicio12;

import java.util.*;

/*Crie uma classe chamada Produto com os atributos nome, preco e quantidade. A classe
deve possuir um método chamado mostrarDados, responsável por exibir as informações
do produto.
Na classe principal, pergunte ao usuário quantos produtos serão cadastrados. Use uma
estrutura for para ler os dados de todos os produtos. Durante a leitura, o programa deve
identificar qual produto possui o maior preço unitário.
Ao final, o programa deve exibir o nome e o preço do produto mais caro cadastrado. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int registrationAmount = 0;
        double price = Double.MIN_VALUE;
        double maxPrice = 0;
        String maxName = " ";
        Produto produto1 = new Produto();

        System.out.println("Quantos produtos você deseja cadastrar?");
        registrationAmount = input.nextInt();
        input.nextLine();

        for (int i = 0; i < registrationAmount; i++) {
            System.out.println("Digite o nome do produto: ");
            String productName = input.nextLine();
            produto1.setName(productName);

            System.out.println("Digite o preço do produto: ");
            double productPrice = input.nextDouble();
            input.nextLine();
            produto1.setPrice(productPrice);

            System.out.println("Digite a quantidade: ");
            int productQtd = input.nextInt();
            input.nextLine();
            produto1.setQtd(productQtd);

            // limparTela();
            produto1.showDetails();

            if (productPrice > price) {
                maxPrice = produto1.getPrice();
                maxName = produto1.getName();
            } else {
                continue;
            }

        }
        System.out.println(
                "O produto com maior preço é o " + maxName + " com o valor de R$" + maxPrice);
        input.close();
    }

    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // fallback: imprime várias linhas em branco
            for (int i = 0; i < 50; i++)
                System.out.println();
        }
    }
}
