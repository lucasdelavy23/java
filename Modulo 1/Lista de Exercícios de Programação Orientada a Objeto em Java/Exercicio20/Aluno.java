package Exercicio20;

public class Aluno {
    // Atributos
    private String name;
    private double grade1;
    private double grade2;

    // Metodos
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

    public Aluno(String name, double grade1, double grade2) {
        setName(name);
        setGrade1(grade1);
        setGrade2(grade2);
    }

    public double calculateAverage() {
        double average = (this.grade1 + this.grade2) / 2;
        return average;
    }

    public void checkSituation() {
        if (calculateAverage() > 7) {
            System.out.println("Situação do Aluno: APROVADO!\n");
        } else {
            System.out.println("Situação do Aluno: REPROVADO!\n");
        }
    }

    public void showDetails() {
        System.out.println("Nome do Aluno: " + this.name);
        System.out.println("Nota 1: " + this.grade1);
        System.out.println("Nota 2: " + this.grade2);
        System.out.println("Média do Aluno: " + calculateAverage());
        checkSituation();
    }
}
