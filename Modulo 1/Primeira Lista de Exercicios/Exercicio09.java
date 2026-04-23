import java.util.Scanner;


public class Exercicio09 {
    public static void main (String[] args) {
        //Faça um programa que leia duas varáveis reais, realize a soma das variaveis e imprima o resultado na tela
        
        Scanner entrada = new Scanner(System.in);

        System.out.println( "Digite o primeiro valor: ");
        double valor1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o segundo valor: ");
        double valor2 = entrada.nextDouble();
        entrada.nextLine();

        entrada.close();
        
        double soma = valor1 + valor2;
        System.out.println("A soma dos valores digitados é: " + soma);

    }
}