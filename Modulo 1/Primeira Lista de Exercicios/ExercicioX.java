import java.util.Scanner;

public class ExercicioX {
    public static void main(String[] args) {
        // Faça um programa que leia e escreva duas variaveis reais no sentindo inverso
        // ao que foram digitados.
        // Não consegui fazer com Double, apenas com INT, tentar transformar o numero em
        // string e imprimir a string ao contrario.
        // Ver como contar quantas posiçoes o numero ocuparia para poder fazer o loop de
        // impressão;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um número: ");

        int numero = entrada.nextInt();
        int reverso = 0;

        while (numero != 0) {
            int digito = numero % 10;
            reverso = reverso * 10 + digito;
            numero /= 10;

        }
        System.out.println("O número ao contrário é " + reverso);

        entrada.close();
    }

}
