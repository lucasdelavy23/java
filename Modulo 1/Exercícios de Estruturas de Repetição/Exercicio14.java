import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        /* 14) Faça um programa que peça dois números, base e
        expoente, calcule e mostre o primeiro número
        elevado ao segundo número. Não utilize a função
        de potência da linguagem. */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o da base:");
        int base = entrada.nextInt();

        System.out.println("Digite o valor do expoente: ");
        int expo = entrada.nextInt();

        int resultado = 1;
        for(int i = 0; i < expo; i++){
            resultado = resultado * base;
        }
        
        System.out.println("O resultado para " + base + " elevado a " + expo + " é " + resultado + ".");
        entrada.close();
    }
}
