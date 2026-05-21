import java.util.*;

public class Pratica05 {
    public static void main(String[] args) {
        /* Crie um programa que utilize um Map <String, Double>  para cadastrar produtos e seus respectivos preços. O usuário deve poder cadastrar
        vários produtos até digitar fim. Após o cadastro, o programa deve solicitar o nome de um produto para consultar e exibir o preço. Caso o produto
        não exista, deve exibir a mensagem "Produto não encontrado". */    
    
        Scanner input = new Scanner(System.in);
        Map<String, Double> products = new HashMap<>();
        String product;

        while (true) {

            System.out.println("Digite o nome do produto ou caso deseje encerrar o programa digite 'fim'.");
            product = input.nextLine();

            if (product.equalsIgnoreCase("fim")) {
                System.out.println("Cadastro Finalizado.");
                break;
            }
            if (products.containsKey(product)) {
                System.out.println("Produto já cadastrado.");
                continue;
            } else {
                System.out.println("Produto adicionado.");
            }

            System.out.println("Digite o preço do produto:");
            Double price = input.nextDouble();
            input.nextLine();
            products.put(product, price);
        }


        while (true){
            System.out.println("Digite o nome do produto a ser buscado ou digite 'fim' para encerrar.");
            product = input.nextLine();

            if (product.equalsIgnoreCase("fim")) {
                System.out.println("Programa finalizado.");
                break;
            }
            if (products.containsKey(product)) {
                    System.out.println(products.get(product));
                continue;
            } else {
                System.out.println("Produto não encontrado.");
                continue;
            }

        }
        input.close();
    }
}