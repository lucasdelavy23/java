import java.util.Scanner;

public class Exercicio13 {
    public static void main (String [] args){
    /* 13) Imprima na tela os números de x a y que são
    divisíveis por z, onde x, y e z são dados pelo
    usuário.*/
    Scanner entrada = new Scanner (System.in);
    System.out.println("Digite dois valores que irei escrever os numeros que estão no intervalor entre eles:");

    System.out.println("Digite o primeiro valor:");
    int valor1 = entrada.nextInt();

    System.out.println("Digite o segundo valor:");
    int valor2 = entrada.nextInt();
    System.out.println("Digite qual valor para ser ver se os numeros da sequencia serão divisiveis:");
    int divisor = entrada.nextInt();

    int i = valor1;
    int k = valor1;
    int valorinicial = 0;
    
    System.out.println("Está é a sequencia de números que existem entre os numeros digitados:");
        if (valor1>valor2){
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
            System.out.print(valor1 + " ");
        }else{
            System.out.print(valor1 + " ");
        }
        valorinicial = valor1;
        k = valor1;

        while ( i < valor2){
            valorinicial = valorinicial +1;
            System.out.print (valorinicial + " ");
            i++;
        }
        entrada.close();

        System.out.println("\nOs valores divisiveis por " + divisor + " na sequencia digitada:");
        for(k=valor1-1; k<=valor2; k++){
           if(k % divisor == 0){
                System.out.print(k + " ");
            }
        }
    }
    
}