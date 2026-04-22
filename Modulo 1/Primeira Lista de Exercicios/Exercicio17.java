import java.util.Scanner;


public class Exercicio17 {
    public static void main (String[] args){
    //Faça um programa que leia quatro números reais, a, b, c e x, e retorne o valor de y segundo a equação y=ax²+bx+c
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o valor para a variável a: ");
    double a = entrada.nextDouble();
    entrada.nextLine();
    
    System.out.println("Digite o valor para a variável b: ");
    double b = entrada.nextDouble();
    entrada.nextLine();

    System.out.println("Digite o valor para a variável c: ");
    double c = entrada.nextDouble();
    entrada.nextLine();

    System.out.println("Digite o valor para a variável x: ");
    double x = entrada.nextDouble();
    entrada.nextLine();

    double y = (a*(x*x))+(b*x)+c;
    System.out.println("O resultado de y para a equação y=ax²+bx+c  é: " + y);  
    entrada.close();
    }
}
