import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
    // 10) Imprima na tela os numeros de 1 a 1000 que são divisivei por um numero inteiro digitado pelo usuario.
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o numero desejado para saber quais sao os numeros inteiros até mil que são divisiveis por ele: ");
    int numero = entrada.nextInt();
    entrada.nextLine();

    System.out.println("O numero digitado foi " + numero + ". \nSegue a lista dos números até 1000 que são divisiveis por " + numero + ".\n");
    for (int i = 0; i <= 1000;i++){
        if (i % numero == 0){
            System.out.println(i);
        }
    }

    entrada.close();
    }
}