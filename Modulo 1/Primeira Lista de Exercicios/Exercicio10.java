import java.util.Scanner;


public class Exercicio10 {
    public static void main (String[] args) {
        //Faça um programa que leia duas varáveis reais, realize a soma das variaveis e imprima as variáveis e o resultado na tela
        Scanner entrada = new Scanner(System.in);

        System.out.println( "Digite o primeiro valor: ");
        double valor1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o segundo valor: ");
        double valor2 = entrada.nextDouble();
        entrada.nextLine();

        entrada.close();
        
        double soma = valor1 + valor2;
        System.out.println("O primeiro valor digitado foi: " + valor1);
        System.out.println("O segundo valor digitado foi: " + valor2);
        System.out.println("A soma dos valores digitados é: " + soma);

    }
}
//Valores que deram o "bug" 17,4 e 10,4 erro de lixo de memoria, solução seria determinar o numero de casas impresso para forçar o arredondamento correto.