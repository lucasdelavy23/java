import java.util.Scanner;
import java.util.Locale;

public class Exercicio08 {
    public static void main (String[] args){
        //Faça um programa que leia e escreva duas variáveis reais no sentido inverso ao que foram digitadas.

        Scanner entrada = new Scanner (System.in);Locale.setDefault(Locale.US);

        System.out.println("Escreva o primero valor com virgula: ");
        double valor1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Escreva o segundo valor com virgula: ");
        double valor2 = entrada.nextDouble();
        entrada.nextLine();

        System.out.printf("Os números digitados foram " + valor2 + " e " + valor1);
        entrada.close();
    }
}