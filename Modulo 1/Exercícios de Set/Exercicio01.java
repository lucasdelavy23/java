import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {

        /*
         * Uma organização está realizando um evento e
         * precisa garantir que cada participante entre
         * apenas uma vez. Para isso, o sistema deve
         * registrar os nomes das pessoas que já acessaram o
         * local. Desenvolva um programa que utilize um Set
         * para armazenar os nomes dos participantes e
         * processe uma sequência de entradas. Para cada
         * nome informado, o sistema deve verificar se a
         * pessoa já entrou anteriormente. Caso seja a
         * primeira vez, o nome deve ser registrado e a
         * entrada permitida. Caso o nome já exista, o
         * sistema deve informar que a entrada já foi
         * registrada anteriormente.
         */
        Scanner input = new Scanner(System.in);
        Set<String> nomes = new HashSet<>();

        int value = 1;

        while (value != 0) {
            System.out.println("Digite 1 para adicionar um nome: ");
            System.out.println("Digite 2 para mostrar a lista.");
            System.out.println("Digite 0 para sair.");
            value = input.nextInt();
            input.nextLine();
        }

        System.out.println("----------------------------");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        input.close();
    }
}