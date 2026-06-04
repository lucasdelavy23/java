package Exercicio29;

public class Professor extends Pessoa {
    private String discipline;

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void showDetails() {
        System.out.println("Nome: " + getName());
        System.out.println("Idade: " + getAge());
        System.out.println("Disciplica: " + getDiscipline() + "\n");
    }
}
