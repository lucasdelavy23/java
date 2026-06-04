package Exercicio13;

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

    public void setAverage(double average) {
        this.average = average;
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

    public double getAverage() {
        return average;
    }

    public void calculateAverage() {
        this.average = (this.grade1 + this.grade2) / 2;
        setAverage(this.average);
        // System.out.println("A média do aluno é: " + average);
    }

    public void showDetails() {
        System.out.println("\nNome do Aluno: " + getName() + "\nNota 1: " + getGrade1() + "\nNota 2: " + getGrade2()
                + "\nMédia: " + getAverage());
    }
}
