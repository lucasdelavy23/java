package Exercicio20;

import java.util.*;

/*Crie uma classe Aluno com os atributos nome, nota1 e nota2. A classe deve possuir um
construtor que receba os três valores como parâmetro.
A classe também deve possuir os métodos calcularMedia, verificarSituacao e mostrarDados.
O método verificarSituacao deve retornar "Aprovado" quando a média for maior ou
igual a 7 e "Reprovado" caso contrário.
Na classe principal, pergunte quantos alunos serão cadastrados. Use uma estrutura for
para ler os dados de todos os alunos. Em cada repetição, crie um objeto da classe Aluno
usando o construtor e exiba os dados do aluno. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos alunos você deseja cadastrar?");
        int qtd = input.nextInt();
        input.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome do aluno: ");
            String name = input.nextLine();

            System.out.println("Digite a Nota 1: ");
            double grade1 = input.nextDouble();
            input.nextLine();

            System.out.println("Digite a Nota 2: ");
            double grade2 = input.nextDouble();
            input.nextLine();

            Aluno aluno1 = new Aluno(name, grade1, grade2);
            aluno1.showDetails();

        }

        input.close();
    }
}
