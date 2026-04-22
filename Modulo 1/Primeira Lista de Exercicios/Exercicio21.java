import java.util.Scanner;

public class Exercicio21 {
    public static void main (String [] args){
        //Construa um algoritmo que calcule a área do círculo dado o seu raio. 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo, você está em um programa que calcula a área de um circulo");
        System.out.println("Digite o valor referente ao  raio do circulo: ");

        double raio = entrada.nextDouble();
        entrada.nextLine();

        double area = (raio*raio)* (double) 3.14;
        entrada.close();
        
        System.out.println("A área do circulo é de: " + area);
        
    }
}
