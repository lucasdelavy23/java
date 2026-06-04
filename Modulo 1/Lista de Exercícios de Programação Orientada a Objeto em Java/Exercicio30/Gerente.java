package Exercicio30;

public class Gerente extends Funcionario {
    private double fixedBonus = 1000.00;

    public double calculateFinalSalary() {
        double totalsalary = getSalary() + fixedBonus;
        setSalary(totalsalary);
        return getSalary();

    }

}
