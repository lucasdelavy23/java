import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        // 11) Faça um programa que receba dois números inteiros e imprima os números inteiros que estão no intervalo compreendido por eles.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, eu sou um programa que irá imprimir na tela os numeros que estão no intervalo de dois numeros que você digitar: ");
        System.out.println("Digite o primeiro valor: ");
        int valor1 = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = entrada.nextInt();
        System.out.println("O intervalor de numeros é o seguinte:");

        int i = valor1;

        if (valor1>valor2){
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
            System.out.print(valor1 + " ");
        }else{
            System.out.print(valor1 + " ");
        }

        i = valor1;

        while ( i < valor2){
            valor1 = valor1+1;
            System.out.print(valor1 + " ");
            i++;
        }
        entrada.close();
    }
}
