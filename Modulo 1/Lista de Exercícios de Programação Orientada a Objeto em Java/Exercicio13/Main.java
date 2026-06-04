package Exercicio13;

import java.util.*;

/*Crie uma classe Aluno com os atributos nome, nota1 e nota2. A classe deve possuir um
método calcularMedia e um método mostrarDados, que exibe o nome, as notas e a
média do aluno.
Na classe principal, crie um array de objetos Aluno com tamanho 5. Depois, utilize uma
estrutura for para preencher os dados dos 5 alunos. Em cada posição do array, deve ser
armazenado um objeto da classe Aluno.
Depois de preencher o array, utilize outro for para percorrer o array e chamar o método
mostrarDados de cada aluno. */
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