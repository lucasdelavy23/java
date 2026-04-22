import java.util.Scanner;

public class Exercicio18 {
    public static void main (String[] ags){
        //Construa um algoritmo que calcule a média aritmética de quatro números quaisquer fornecidos pelo usuário.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo, você está em um programa que calcula a media de 4 valores. Sempre use virgula para separar os valores.");

        System.out.println("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o terceiro número: ");
        double numero3 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o quarto número: ");
        double numero4 = entrada.nextDouble();
        entrada.nextLine();

        double media = (numero1 + numero2 + numero3 + numero4)/4;
        System.out.println("Os numeros digitados foram : " + numero1 + " " + numero2 + " " + numero3 + " " + numero4 + " .") ;
        System.out.println("A média dos valores digitados é: " + media);
        entrada.close();

    }
}
