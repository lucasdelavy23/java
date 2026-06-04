package Exercicio29;

public class Aluno extends Pessoa {

    private double grade;

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void showDetails() {
        System.out.println("Aluno: " + getName());
        System.out.println("Idade: " + getAge());
        System.out.println("Nota: " + getGrade() + "\n");
    }

}
