package Exercicio24;

import java.util.*;

public class Aluno {
    // Atributos
    String name;
    double grade1;
    double grade2;

    public Aluno(String name) {
        this.name = name;
        this.grade1 = 0.0;
        this.grade2 = 0.0;
    }

    public Aluno(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public void changeGrade() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nDigite a nova Nota 1: ");
        this.grade1 = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a nova Nota 2: ");
        this.grade2 = input.nextDouble();
        input.nextLine();
        input.close();
    }

    public double calculateAverage() {
        double average = (this.grade1 + this.grade2) / 2.0;
        return average;
    }

    public void showStudentData() {
        System.out.println("\nNome do Aluno: " + this.name);
        System.out.println("Nota 1: " + this.grade1);
        System.out.println("Nota 2: " + this.grade2);
        System.out.println("Média do Aluno: " + calculateAverage());
    }
}
