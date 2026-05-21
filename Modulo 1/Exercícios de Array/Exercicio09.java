import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*9) Faça um programa que leia n inteiros e os mostre em tela*/
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList <> ();

        System.out.println("Quantos valores terá seu vetor?");
        int tamanho = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite os valores do seu vetor: ");


        for(int i = 0; i<tamanho ; i++){
            int num = entrada.nextInt();
            numeros.add(num);
        }
        System.out.println(numeros);
        entrada.close();
    }
}