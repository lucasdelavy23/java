package Exercicio24;

import java.util.*;

/*Crie uma classe Aluno com os atributos nome, nota1 e nota2. A classe deve possuir dois
construtores.
O primeiro construtor deve receber apenas o nome do aluno. Nesse caso, as notas devem
começar com valor zero. O segundo construtor deve receber o nome, a primeira nota e a
segunda nota.
A classe também deve possuir métodos para alterar as notas, calcular a média e mostrar
os dados do aluno.
Na classe principal, crie um aluno usando apenas o nome e outro aluno usando nome e
notas. Depois, altere as notas do primeiro aluno usando métodos e mostre os dados dos
dois alunos. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite o nome do Aluno: ");
        String name = input.nextLine();

        Aluno aluno1 = new Aluno(name);
        aluno1.showStudentData();
        System.out.print("\033[H\033[2J");

        System.out.println("\nDigite o nome do Aluno:");
        name = input.nextLine();
        System.out.println("Digite a Nota 1:");
        double grade1 = input.nextDouble();
        input.nextLine();
        System.out.println("Digite a nota 2:");
        double grade2 = input.nextDouble();
        input.nextLine();

        Aluno aluno2 = new Aluno(name, grade1, grade2);
        aluno2.showStudentData();
        System.out.print("\033[H\033[2J");

        aluno1.changeGrade();
        aluno1.showStudentData();
        aluno2.showStudentData();
        System.out.print("\033[H\033[2J");

        input.close();
    }
}
