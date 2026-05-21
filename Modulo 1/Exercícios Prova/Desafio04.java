import java.util.*;

public class Desafio04 {
    public static void main(String[] args) {
        /*Modifique o programa desenvolvido nas etapas anteriores para que ele funcione com um
        menu de operacoes. O usuario deve poder escolher entre as seguintes opcoes: cadastrar
        produto, consultar produto, atualizar preco, listar todos os produtos e encerrar o programa.
        O sistema deve permanecer em execucao ate que o usuario escolha a opcao de
        encerramento.*/
            
        Scanner input = new Scanner(System.in);
        Map<String, Double> produtos = new HashMap<>();
        int option;

        do{
            System.out.println("----MENU----");
            System.out.println("1 - CADASTRO DE PRODUTO");
            System.out.println("2 - CONSULTAR PRODUTO");
            System.out.println("3 - ATUALIZAR PREÇO");
            System.out.println("4 - LISTAR TODOS OS PRODUTOS");
            System.out.println("5 - ENCERRAR O PROGRAMA");

            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1: // CADASTRAR PRODUTO
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
                    break;         
                default:
                    break;
                    
                case 2: // BUSCAR PRODUTO
                    System.out.println("\nMENU DE BUSCA");

                    while (true) {
                        System.out.println("Digite o nome do produto para buscar ou encerrar para sair.");
                        String finder = input.nextLine();

                        if (finder.equalsIgnoreCase("encerrar")) {
                        break;
                    }

                        Double precoEncontado = produtos.get(finder);

                        if (precoEncontado != null) { // Se o get encontrar o produto, irá imprimir o nome do produto e o preço.
                            System.out.println("Produto encontrado!" + " O produto " + finder + " custa R$" + precoEncontado);
                         }else { // Caso o get nao encontrar no mapa o produto, irá informar que não há esse produto no estoque.
                            System.out.println("\nProduto " + finder + " não encontrado no estoque.");
                         }
                    }

                case 3: // ATUALIZAR PREÇO
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
                
                case 4: // LISTAR PRODUTOS
                    produtos.forEach((key, value) -> {
                        System.out.printf("Produto: %s | Preço: R$ %.2f%n", key, value); // Formatação para 2 casas decimais.
                    });
                    
                case 5: // ENCERRAR PROGRAMA
                    System.out.println("Fim da aplicação.");
                    break;
       
        

        

            }

         


        

        

        }while (option != 5);
        input.close();
    }
}