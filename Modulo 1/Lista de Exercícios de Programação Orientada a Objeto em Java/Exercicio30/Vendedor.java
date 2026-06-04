package Exercicio30;

public class Vendedor extends Funcionario {
    private int salesQuantity;

    public void setSalesQuantity(int salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }

    public double calculateFinalSalary() {
        return getSalary() + (50 * this.salesQuantity);
    }
}
