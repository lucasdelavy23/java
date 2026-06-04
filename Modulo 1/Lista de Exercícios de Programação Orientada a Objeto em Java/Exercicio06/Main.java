package Exercicio06;

import java.util.*;

/*Utilize a classe Aluno do exercício anterior. Acrescente um método chamado verificarSituacao.
Esse método deve calcular a média do aluno e retornar a mensagem "Aprovado" caso a
média seja maior ou igual a 7. Caso contrário, deve retornar a mensagem "Reprovado".
Na classe principal, leia o nome e as duas notas do aluno usando Scanner. Depois, exiba
o nome do aluno, a média calculada e a situação final.
Neste exercício, o teste com if e else deve ficar dentro do método verificarSituacao,
e não diretamente no main. */
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
        aluno1.showDetails();
        aluno1.checkStatus();

        input.close();
    }
}
