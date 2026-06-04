package Exercicio14;

import java.util.*;

/*Utilize um array de objetos da classe Aluno. O programa deve cadastrar 5 alunos, lendo
nome, nota1 e nota2 de cada um. Depois do cadastro, o programa deve pedir ao usuário
que digite o nome de um aluno para busca.
Use uma estrutura for para percorrer o array e comparar o nome digitado com o nome
de cada aluno cadastrado. Se o nome for encontrado, o programa deve exibir os dados do
aluno encontrado. Se nenhum aluno for encontrado, o programa deve exibir a mensagem
"Aluno nao encontrado".
Neste exercício, será necessário utilizar uma variável booleana, como encontrado, para
controlar se a busca teve sucesso ou não. */
public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            Aluno aluno1 = new Aluno();
            System.out.println("Digite o nome do aluno: ");
            String name = input.nextLine();
            aluno1.setName(name);

            System.out.println("Digite a primeira nota: ");
            double grade1 = input.nextDouble();
            input.nextLine();
            aluno1.setGrade1(grade1);

            System.out.println("Digite a segunda nota: ");
            double grade2 = input.nextDouble();
            input.nextLine();
            aluno1.setGrade2(grade2);

            aluno1.calculateAverage();
            alunos.add(aluno1);
        }

        clearScreen();

        for (int i = 0; i < alunos.size(); i++) {
            alunos.get(i).showDetails();
        }

        System.out.println("Digite o nome do aluno que deseja buscar: ");
        String search = input.nextLine();
        boolean find = Aluno.studentSearch(alunos, search);
        if (!find) {
            System.out.println("Aluno não cadastrado.");
        }

        input.close();
    }

    public static void clearScreen() {
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