package Exercicio07;

import java.util.*;

/*Crie uma classe chamada Aluno com os atributos nome, nota1 e nota2. A classe deve
possuir um método chamado calcularMedia, que retorna a média das duas notas.
Na classe principal, pergunte ao usuário quantos alunos ele deseja cadastrar. Depois,
utilize uma estrutura for para repetir o cadastro de todos os alunos. A cada repetição,
o programa deve pedir o nome e as duas notas de um aluno, criar um objeto da classe
Aluno e mostrar a média desse aluno.
Neste exercício, não é obrigatório armazenar todos os alunos em uma lista. O objetivo
principal é praticar a criação de objetos dentro de uma estrutura de repetição. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos alunos deseja cadastrar?");
        int qtdStudents = input.nextInt();
        input.nextLine();

        for (int i = 0; i < qtdStudents; i++) {
            Aluno aluno1 = new Aluno();

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

            aluno1.calculateAverage();
            aluno1.showDetails();
            aluno1.checkStatus();
        }
        input.close();
    }
}
