import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
         * 10) Faça um programa que leia 30 números reais e faça a média destes números
         */
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os valores do seu vetor:");
        double soma = 0;
        for(int i= 0; i < 30 ; i++){
            double num = entrada.nextDouble();
            entrada.nextLine();
            numeros.add(num);
            soma += num;
        }
        double media = (soma/30);

        System.out.println(numeros);

        System.out.println("A média dos 30 valores é: " + media);

        entrada.close();
    }
}
