package Exercicio08;

import java.util.*;

/*Utilize a classe Aluno com os atributos nome, nota1 e nota2. A classe deve possuir os
métodos calcularMedia e verificarSituacao. O método verificarSituacao deve
retornar "Aprovado" quando a média for maior ou igual a 7 e "Reprovado" quando a
média for menor que 7.
Na classe principal, pergunte quantos alunos serão cadastrados. Use uma estrutura for
para cadastrar todos os alunos. Durante o cadastro, o programa deve contar quantos
alunos foram aprovados e quantos foram reprovados.
Ao final da execução, o programa deve exibir a quantidade total de aprovados e a quantidade
total de reprovados. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int approved = 0;
        int failed = 0;
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
            aluno1.checkStatus();
            aluno1.showDetails();

            if (aluno1.getAverage() > 7) {
                approved++;
            } else {
                failed++;
            }
        }
        System.out.println("Aprovados: " + approved);
        System.out.println("Reprovados: " + failed);
        input.close();
    }
}
