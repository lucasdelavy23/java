import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        //Faça um programa que leia três numeros reais, a b e x, e retorne o valor de y segundo a equação:  y=ax+b
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor para a variável a:");
        double a = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o valor para a variável b:");
        double b = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o valor para a variável x:");
        double x = entrada.nextDouble();
        entrada.nextLine();

        double y = ((a*x)+b);

        System.out.println("O Resultado de y segundo a equação  y=ax+b é " + y);
        
        entrada.close();
    }
}
