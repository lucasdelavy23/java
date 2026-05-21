import java.util.*;

public class Questao19 {
    public static void main(String[] args) {
        /*Crie um programa que leia uma sequˆencia de numeros inteiros ate que o usuario digite
        -1. Ao final, o programa deve calcular e exibir a media dos valores informados, alem de indicar o maior e o menor valor digitado. */

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Digite os valores para seu vetor, para sair digite -1: ");

        int num = 1;
        int i = 0;
        double soma = 0;

        while (num != 0){
            num = input.nextInt();
            input.nextLine();

            if (num == -1){
                break;
            }
            numbers.add(num);
             soma += num;
            i++;

        }
        input.close();

        double media = soma/i;

        System.out.println("\nO maior valor digitado foi: " + Collections.max(numbers));
        System.out.println("\nO menor valor digitado foi: " + Collections.min(numbers));
        System.out.println("\nA media dos valores digitado é: " + media);

    }
}
