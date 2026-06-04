package Exercicio07;

public class Aluno {
    // Atributos
    private String name;
    private double grade1;
    private double grade2;
    private double average;
    // Métodos

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public String getName() {
        return name;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public void calculateAverage() {
        this.average = (grade1 + grade2) / 2;
    }

    public void checkStatus() {
        if (getAverage() > 7) {
            System.out.println("O aluno está aprovado!\n");
        } else {
            System.out.println("O aluno está reprovado!\n");
        }
    }

    public void showDetails() {
        System.out.println("\nNome do aluno: " + getName());
        System.out.println("Nota 1: " + getGrade1());
        System.out.println("Nota 2: " + getGrade2());
        System.out.println("Média do aluno: " + getAverage());
    }
}
