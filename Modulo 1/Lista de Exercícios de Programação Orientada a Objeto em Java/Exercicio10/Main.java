package Exercicio10;

import java.util.*;

/*Adapte o exercício anterior para identificar tanto o aluno com maior média quanto o aluno
com menor média. O programa deve cadastrar vários alunos, calcular a média de cada
um e comparar os resultados.
Ao final da execução, o programa deve exibir o nome e a média do aluno com maior média,
além do nome e da média do aluno com menor média.
Neste exercício, o aluno deve utilizar variáveis auxiliares para armazenar a maior média,
a menor média, o nome do aluno com maior média e o nome do aluno com menor média. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int approved = 0;
        int failed = 0;
        double averageMax = 0;
        String nameMax = " ";
        String nameMin = " ";
        double averageMin = Integer.MAX_VALUE;

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

        }
        System.out.println("Aprovados: " + approved);
        System.out.println("Reprovados: " + failed);
        System.out.println("\nO aluno " + nameMax + " tem a maior média que é: " + averageMax);
        System.out.println("\nO aluno " + nameMin + " tem a menor média, que é: " + averageMin);
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
