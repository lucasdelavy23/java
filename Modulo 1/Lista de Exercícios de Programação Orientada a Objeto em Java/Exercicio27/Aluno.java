package Exercicio27;

public class Aluno {
    private String name;
    private double grade1;
    private double grade2;

    public void setGrade1(double grade1) {
        if (grade1 < 0 || grade1 > 10) {
            System.out.println("Nota inválida!");
        } else {
            this.grade1 = grade1;
        }
    }

    public void setGrade2(double grade2) {
        if (grade2 < 0 || grade2 > 10) {
            System.out.println("Nota inválida!");
        } else {
            this.grade2 = grade2;
        }
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

    public double calculateAverage() {
        double average = (this.grade1 + this.grade2) / 2;
        return average;
    }

    public void checkSituation() {
        if (this.calculateAverage() >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
