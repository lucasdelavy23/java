package Exercicio09;

import java.util.*;

/*Crie uma classe Aluno com os atributos nome, nota1 e nota2, além do método calcularMedia.
Na classe principal, pergunte ao usuário quantos alunos serão cadastrados e utilize uma
estrutura for para fazer a leitura dos dados.
Durante a repetição, o programa deve identificar qual aluno possui a maior média. Para
isso, será necessário comparar a média do aluno atual com a maior média encontrada até
aquele momento.
Ao final, o programa deve exibir o nome do aluno com maior média e o valor dessa média. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int approved = 0;
        int failed = 0;
        double averageMax = 0;
        String nameMax = " ";

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
                continue;
            }
        }
        System.out.println("Aprovados: " + approved);
        System.out.println("Reprovados: " + failed);
        System.out.println("O aluno " + nameMax + " tem a maior média que é: " + averageMax);
        input.close();
    }
}
