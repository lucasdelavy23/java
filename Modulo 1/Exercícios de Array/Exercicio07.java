import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        /*7) Faça um programa que leia vinte inteiros. Utilize para isso um vetor. */
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList <> ();

        System.out.println("Digite 20 valores para um vetor: ");
        for(int i = 0; i<20 ; i++){
            int num = entrada.nextInt();
            numeros.add(num);
        }
        entrada.close();
    }
    
}
