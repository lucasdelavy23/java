import java.util.*;

public class Desafio03 {
    public static void main(String[] args) {
        /*Evolua o programa anterior para permitir a atualiza¸c˜ao do pre¸co de um produto ja cadastrado. 
        O usuario deve informar o nome do produto e o novo preco. Caso o produto
        exista, o valor armazenado deve ser atualizado. Caso contrario, o programa deve informar
        que o produto nao foi encontrado.*/
            
        Scanner input = new Scanner(System.in);
        Map<String, Double> produtos = new HashMap<>();

        System.out.println("Digite " + "sair" + " no nome do produto para finalizar a aplicação.");

        while (true) {
            System.out.println("Digite o nome do produto: ");
            String nome = input.nextLine();

            if (nome.equalsIgnoreCase("sair")) { //equalsIgnoreCase usado para independente da maneira que for digitado sair, ele seja reconhecido.
                break;

            }

            System.out.println("Digite o preço de " + nome + ": ");
            double preco = input.nextDouble();
            input.nextLine();

            produtos.put(nome, preco);
        }

        System.out.println("\nCadastro finalizado.");

        produtos.forEach((key, value) -> {
            System.out.printf("Produto: %s | Preço: R$ %.2f%n", key, value); // Formatação para 2 casas decimais.
        });

        System.out.println("\nMenu de Buscas");

        while (true) {
            System.out.println("Digite o nome do produto para buscar ou encerrar para sair.");
            String finder = input.nextLine();

            if (finder.equalsIgnoreCase("encerrar")) {
                break;
            }

            Double precoEncontado = produtos.get(finder);

            if (precoEncontado != null) { // Se o get encontrar o produto, irá imprimir o nome do produto e o preço.
                System.out.println("Produto encontrado!" + " O produto " + finder + " custa R$" + precoEncontado);
            } else { // Caso o get nao encontrar no mapa o produto, irá informar que não há esse produto no estoque.
                System.out.println("\nProduto " + finder + " não encontrado no estoque.");
            }

        }

         while (true) {
            System.out.println("Digite o nome do produto para atualizar o preço ou ENCERRAR para sair.");
            String finder = input.nextLine();

            if (finder.equalsIgnoreCase("encerrar")) {
                break;
            }

            Double precoEncontado = produtos.get(finder);

            if (precoEncontado != null) { // Se o get encontrar o produto, irá imprimir o nome do produto e o preço.
                System.out.println("Produto encontrado!" + " O produto " + finder + " custa R$" + precoEncontado);

                System.out.println("Digite o novo preço para o produto " + finder);
                double newPrice = input.nextDouble();
                input.nextLine();

                produtos.put(finder, newPrice);
                System.out.println("Preço atualizado com sucesso.");
                System.out.println(finder + " teve seu preço atualizado para " + newPrice);
            } else { // Caso o get nao encontrar no mapa o produto, irá informar que não há esse produto no estoque.
                System.out.println("\nProduto " + finder + " não encontrado no sistema.");
            }


        }
            produtos.forEach((key, value) -> {
            System.out.printf("Produto: %s | Preço: R$ %.2f%n", key, value); // Formatação para 2 casas decimais.
        });
        input.close();
        System.out.println("Fim da aplicação.");
    }
}
