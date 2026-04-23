import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        // Faça um programa que peça para o usuário digitar um ano e retorne se ele é
        // bissexto ou não.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um ano e lhe direi se ele é bissexto ou não.");
        int ano = entrada.nextInt();
        entrada.nextLine();

        if (ano % 4 == 0 || ano % 400 == 0) {
            System.out.println("O ano digitado é bissexto.");
        } else {
            System.out.println("O ano digitado não é bissexto.");
        }
        entrada.close();
    }
}
