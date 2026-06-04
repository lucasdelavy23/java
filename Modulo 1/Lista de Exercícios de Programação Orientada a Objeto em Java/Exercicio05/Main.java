package Exercicio05;

import java.util.*;

/*Crie uma classe chamada Aluno. Essa classe deve possuir os atributos nome, nota1 e
nota2. O atributo nome deve ser do tipo String, enquanto nota1 e nota2 devem ser do
tipo double.
A classe deve possuir um método chamado calcularMedia. Esse método deve retornar
a média aritmética das duas notas do aluno.
Na classe principal, utilize Scanner para ler o nome e as duas notas de um aluno. Depois,
crie um objeto da classe Aluno, atribua os valores lidos aos atributos do objeto e exiba a
média calculada pelo método calcularMedia. */
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("Digite o nome do aluno: ");
        String name = input.nextLine();
        aluno1.setName(name);

        System.out.println("Digite a nota 1: ");
        double grade1 = input.nextDouble();
        input.nextLine();
        aluno1.setGrade1(grade1);

        System.out.println("Digite a nota 2: ");
        double grade2 = input.nextDouble();
        input.nextLine();
        aluno1.setGrade2(grade2);

        System.out.print("\033[H\033[2J");
        aluno1.calculateAverage();
        // aluno1.showDetails();

        input.close();
    }
}
