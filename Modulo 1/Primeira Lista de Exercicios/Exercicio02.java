import java.util.Scanner;

public class Exercicio02 {  
    public static void main(String args []){
        //Faça um programa que apenas leia uma variável inteira. "Leia" refere-se a "ler do teclado"
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor digite um valor: ");
        int valor = entrada.nextInt();
        System.out.println("O valor digitado foi " + valor + ".");
        entrada.close();
    }
}