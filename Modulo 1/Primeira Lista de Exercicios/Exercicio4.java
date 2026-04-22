import java.util.Scanner;  

public class Exercicio4 {                           
    public static void main(String[] args) {
        //Faça um programa que leia um número inteiro do teclado e imprima esse número na tela.

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int numero = entrada.nextInt();

        System.out.println("O número digitado foi: " + numero);
        
        entrada.close();
    }                               
}
