import java.util.Scanner;

public class Exercicio20 {
    public static void main (String[] ags){
        //Construa um algoritmo que calcule a média harmonica de dois numeros fornecidos pelo usuario

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo, você está em um programa que calcula a media harmônica de 2 valores. Sempre use virgula para separar os valores.");

        System.out.println("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();
        entrada.nextLine();


        double media =  (double) 2 / ( (double) (numero1) + (double) (1/numero2) );
        System.out.println("Os numeros digitados foram : " + numero1 + " " + numero2);
        System.out.println("A média dos valores digitados é: " + media);
        entrada.close();

    }
}

