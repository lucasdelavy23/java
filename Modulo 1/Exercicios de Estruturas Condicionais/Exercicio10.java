import java.util.Scanner;

public class Exercicio10 {
    public static void main (String [] args){
// Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
// a) A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
// b) A mensagem "Reprovado", se a média for menor do que sete;
// c) A mensagem "Aprovado com Estrelinha", se a média for igual a dez.

    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a primeira nota: ");
    double nota1 = entrada.nextDouble();
    double nota2 = entrada.nextDouble();
    double media = (nota1 + nota2)/2.0;

    if (media >= 7 && media < 10){
        System.out.println("Aprovado!");
    }else if (media < 7){
        System.out.println("Reprovado");
    }else{
        System.out.println("AProvado com Estrelinha!");
    }
    entrada.close();
    }
}
