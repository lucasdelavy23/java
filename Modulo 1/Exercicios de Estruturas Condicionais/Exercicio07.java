import java.util.Scanner;

public class Exercicio7 {
    public static void main (String [] args){

        //Faça um programa que peça um número e informe se o número é inteiro ou decimal.
        
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Digite um numero e lhe direi se ele é inteiro ou decimal: ");

        double numero = entrada.nextDouble();
        entrada.nextLine();

        if(numero % 1.0 == 0){
            System.out.println("O número digitado é inteiro.");
        }else{
            System.out.println("O número digitado é decimal");
        }

        entrada.close();
        }
}
