import java.util.Scanner;

public class Exercicio07 {
    public static void main (String[] args){
        //Faça um programa que leia e escreva uma variável real (double) na tela. 

        Scanner entrada = new Scanner (System.in);

        System.out.println("Escreva um número com virgula: ");
        double valor = entrada.nextDouble();
        
        System.out.printf("O número digitado foi " + "%.4f%n",valor);
        entrada.close();
    }
}