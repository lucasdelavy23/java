import java.util.Scanner;
import java.lang.Math;

public class Exercicio19 {
    public static void main(String[] ags) {
        // Construa um algoritmo que calcule a média geométrica de 3 números quaisquer fornecidos pelo usuário

        Scanner entrada = new Scanner(System.in);

        System.out.println(
                "Bem vindo, você está em um programa que calcula a media geometrica de 3 valores. Sempre use virgula para separar os valores.");

        System.out.println("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o terceiro número: ");
        double numero3 = entrada.nextDouble();
        entrada.nextLine();

        double media = Math.pow(numero1 * numero2 * numero3, (double) 1.0 / 3.0);
        System.out.println("Os numeros digitados foram : " + numero1 + " " + numero2 + " " + numero3 + " .");
        System.out.println("A média geométrica dos valores digitados é: " + media);
        entrada.close();

    }
}
