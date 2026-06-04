package Exercicio27;

import java.util.*;

/*Crie uma classe Aluno com os atributos privados nome, nota1 e nota2. Crie métodos get
e set para todos os atributos.
Os métodos setNota1 e setNota2 devem aceitar apenas valores entre 0 e 10. Se o valor
informado for menor que 0 ou maior que 10, o programa deve mostrar uma mensagem de
erro e manter o valor anterior da nota.
A classe também deve possuir os métodos calcularMedia e verificarSituacao. Na
classe principal, leia os dados de um aluno, use os métodos set para preencher os valores
e exiba o nome, as notas, a média e a situação final. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.println("Digite o nome do aluno:");
        String name = input.nextLine();
        aluno1.setName(name);

        System.err.println("Digite a Nota 1:");
        double grade1 = input.nextDouble();
        aluno1.setGrade1(grade1);
        input.nextLine();

        System.out.println("Digite a Nota 2: ");
        double grade2 = input.nextDouble();
        aluno1.setGrade2(grade2);
        input.nextLine();

        input.close();

        System.out.println("Aluno: " + aluno1.getName());
        System.out.println("Nota 1: " + aluno1.getGrade1());
        System.out.println("Nota 2: " + aluno1.getGrade2());
        System.out.println(aluno1.calculateAverage());
        aluno1.checkSituation();

    }
}
