import java.util.*;

public class Questao12 {
    public static void main(String[] args) {
        /*Crie um programa que leia 5 numeros inteiros e armazene-os em um array. Apos isso, o
        programa deve percorrer o array e exibir apenas os numeros pares. */

        Scanner input = new Scanner(System.in);        
        ArrayList <Integer> numbers = new ArrayList<>();

        System.out.println("Digite 5 valores inteiros para serem adicionados no array, e irei lhe mostrar quais são pares:");

        for (int i = 0; i < 5; i++){
            int num = input.nextInt();
            input.nextLine();
            numbers.add(num);
        }

        System.out.println("Os números pares presentes no arrya são:");

        for(int num : numbers){
            if (num % 2 ==0){
                System.out.print(num + " ");
            }
        }
    
    input.close();
    }
    
}