import java.util.*;

public class Pratica04 {
    public static void main(String[] args) {
        /* Crie um programa que utilize um Arraylist para armazenar nomes de produtos digitados pelo usuario. A leitura deve continuar até que o 
        usuário digite fim. Após a leitura, o programa deve exibir todos os produtos cadastrados e informar quantos produtos foram inseridos.*/

        Scanner input = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<>();

        int count = 0;

        while (true){
            System.out.println("Digite o nome do produto para adicionar a lista ou 'fim' para encerrar. ");
            String product = input.nextLine();
            if (product.equalsIgnoreCase("fim")) {
                break;
            }

            if (products.contains(product)) {
                System.out.println("Produto já adicionado.");
                continue;
                } else {
                    System.out.println("Produto adicionado com sucesso.");
            }
            products.add(product);
            count ++;
        }
        System.out.println(products);
        System.out.println("A lista de produtos possui " + count + " itens.");
        input.close();
    }
}