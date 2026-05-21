import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*8) Faça um programa que leia 20 inteiros e os mostre na tela.*/
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList <> ();

        System.out.println("Digite 20 valores para um vetor: ");
        for(int i = 0; i<20 ; i++){
            int num = entrada.nextInt();
            numeros.add(num);
        }
        System.out.println(numeros);
        entrada.close();
    }
    
}