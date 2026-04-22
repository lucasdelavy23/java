import java.util.Scanner;

public class Main {
    public static void main(String args []){
        //Exercicio teste, para conhecer estrutura e como dar entrada de dados.
        Scanner entrada = new Scanner (System.in);

        System.out.println("Por favor insira o seu nome:");
        String nome = entrada.nextLine();
        
        System.out.println("Por favor insira a sua idade:");
        int idade = entrada.nextInt();
        
        System.out.println("Por favor insira a sua altura em metros:");
        double altura = entrada.nextDouble();

        System.out.println( "Seu nome é " + nome + " Você tem " + idade + " Anos e possui " + altura + " metros de altura");
        entrada.close();
    }
}