import java.util.Scanner;

public class Exercicio5 {  
    public static void main(String[] args){
        //Escreva um programa que leia uma variável real. (double)  
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor com virgula: ");
        double valor = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("O número digitado foi: "+ valor);
        entrada.close();
    }
}