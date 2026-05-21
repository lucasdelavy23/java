import java.util.*;

public class Questao10 {
    public static void main(String[] args) {
        /*Crie um programa que leia números inteiros continuamente atéque o usuário digite o valor 0. Ao final, 
        o programa deve exibir a soma de todos os números digitados, desconsiderando o zero */

        Scanner input = new Scanner(System.in);
        ArrayList <Integer> numeros = new ArrayList<>();

        int num = 1;
        int soma=0;

        while (num != 0){
            System.out.println("Digite o valor desejado: ");
            num = input.nextInt();
            input.nextLine();

            if (num == 0) {
                break;
            }
            
            numeros.add(num); 
            soma += num;
        }   
        
        System.out.println(numeros);
        System.out.println("A soma dos valores do array é: " + soma);
        input.close();
    }
}
