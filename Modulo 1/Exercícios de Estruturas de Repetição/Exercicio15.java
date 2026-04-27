import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        /*15) A série de Fibonacci é formada pela sequência
          1,1,2,3,5,8,13,21,34,55,... Faça um programa
          capaz de gerar a série até o enésimo termo.
         */
        int posicao = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos para serem impressos na série de Fibonnacci: ");
        posicao = entrada.nextInt();

        int resultado = 0;
        int num1 = 1;
        int num2 = 1;

        System.out.println("Segue a série de Fibonnacci");
        for (int i = 0; i < posicao; i++){
            System.out.print(num1 + " ");
            resultado = num1 + num2;
            num1 = num2;
            num2 = resultado;
        }

        entrada.close();
    }
}
