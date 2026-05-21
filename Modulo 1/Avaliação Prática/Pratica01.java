import java.util.*;

public class Pratica01 {
    public static void main(String[] args) {
        /*Crie um programa que leia o nome de um aluno e três notas. O programa deve calcuilar a média aritmética e exibir o nome do aluno,
        a média obtida e a situação final. Considere aprovado o aluno com média maior ou igual a 7. */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = input.nextLine();

        System.out.println("Digite a primera nota: ");
        double nota1 = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();
        input.nextLine();

        double media = (nota1 + nota2 + nota3)/3;

        if (media >= 7){
            System.out.println("O aluno " + nome + " possui média " + media + " e está APROVADO.");
        }else {
            System.out.println("O aluno " + nome + " possui média " + media + " e está REPROVADO.");
        }

        input.close();
    }
}