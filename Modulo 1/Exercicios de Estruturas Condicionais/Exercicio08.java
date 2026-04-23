import java.util.Scanner;

public class Exercicio8 {
    public static void main (String [] args){
        //Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo. 
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero e lhe direi se ele é positivo ou negativo:");
        double numero = entrada.nextDouble();

        if(numero < 0){
        System.out.println("O número digitado é negativo.");
        }else if (numero > 0){
            System.out.println("O número digitado é positivo.");
        }else{ 
            System.out.println("O número digitado é zero.");
        }


    entrada.close();
    }
}
