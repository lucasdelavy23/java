package Exercicio04;

public class Produto {
    // Atributos
    private String name;
    private double price;
    private int qtd;
    private double totalValue;

    // Métodos
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getQtd() {
        return qtd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Preço digitado inválido!");
        }
    }

    public void setQtd(int qtd) {
        if (qtd > 0) {
            this.qtd = qtd;
        } else {
            System.out.println("Quantidade digitada inválida!");
        }
    }

    public void showDetails() {
        System.out.println(
                "Nome do produto: " + getName() + "\nPreço do produto: R$ " + getPrice() + "\nQuantidade: " + getQtd());
    }

    public double getTotalvalue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public void calculateTotalValue() {
        this.totalValue = getQtd() * getPrice();
        System.out.println("O valor total do produto é: R$ " + getTotalvalue());
    }
}