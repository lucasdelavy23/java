import java.util.Scanner;

public class Exercicio09 {
    public static void main (String [] args){
        // 9) Imprima a tabuada na tela de um númerom qdigitado pelo usário utilizando a estrutura while.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero que deseja ver a tabuada: ");
        int k =0;
        int numero = entrada.nextInt();
        while (k <= 10){
            int resultado = numero*k;
            System.out.println(numero + "X" + k + " = " + resultado);
            k++;
        }
        entrada.close();
        }
    }