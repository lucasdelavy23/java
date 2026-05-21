import java.util.*;

public class Questao09 {
    public static void main(String[] args) {
        /*Crie um programa que leia 10 números inteiros informados pelo usuário e determine qual e o maior e qual é o menor valor entre eles, exibindo ambos ao final */
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> numeros = new ArrayList<>();

        System.out.println("Digite 10 valores inteiros:");
        
        for (int i= 0; i <10; i++){
            int num = input.nextInt();
            numeros.add(num);
        }

        int max = Collections.max(numeros);
        int min = Collections.min(numeros);

        System.out.println("O menor valor digitado é: " + min + "\nO maior valor digitado é: " + max);
        input.close();
    }
}