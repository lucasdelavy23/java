package Exercicio11;

import java.util.*;

/*Crie uma classe Aluno com os atributos nome, nota1 e nota2, além do método calcularMedia.
Na classe principal, pergunte ao usuário quantos alunos serão cadastrados.
Use uma estrutura for para cadastrar todos os alunos. Durante a repetição, calcule a
média de cada aluno e acumule essas médias em uma variável chamada, por exemplo,
somaMedias.
Ao final, calcule a média geral da turma dividindo a soma das médias pela quantidade de
alunos cadastrados. O programa deve exibir a média geral da turma. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int approved = 0;
        int failed = 0;
        double averageMax = 0;
        String nameMax = " ";
        String nameMin = " ";
        double averageMin = Integer.MAX_VALUE;
        double sumAverage = 0;
        double generalAverage = 0;

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

            if (aluno1.getAverage() > averageMax) {
                averageMax = aluno1.getAverage();
                nameMax = aluno1.getName();
            } else {
                averageMin = aluno1.getAverage();
                nameMin = aluno1.getName();
            }

            sumAverage += aluno1.getAverage();
        }
        generalAverage = sumAverage / qtdStudents;
        System.out.println("Aprovados: " + approved);
        System.out.println("Reprovados: " + failed);
        System.out.println("\nO aluno " + nameMax + " tem a maior média que é: " + averageMax);
        System.out.println("\nO aluno " + nameMin + " tem a menor média, que é: " + averageMin);
        System.out.println("A soma das médias dos alunos é: " + sumAverage + "\n\n");
        System.out.println("A média geral da turma é: " + generalAverage);
        input.close();
    }

    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // fallback: imprime várias linhas em branco
            for (int i = 0; i < 50; i++)
                System.out.println();
        }
    }
}
