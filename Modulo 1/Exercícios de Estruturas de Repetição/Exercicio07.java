import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // 7 ) Faça um programa que leia 5 números e informe o maior. Com usuário
        // informando os números. (Ver questão do limite do numero, no caso inferior ao
        // definino na variavel MAX.)
        int max = Integer.MIN_VALUE;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");

        for (int i = 0; i < 5; i++) {
            int num = entrada.nextInt();
            // System.out.println("Max é: " + max);
            if (num > max) {
                max = num;
                System.out.println("Digite o proximo valor: ");
            } else {
                System.out.println("Digite o próximo valor:");
            }

        }
        entrada.close();
        System.out.println("O maior numero digitado foi: " + max);
    }
}
