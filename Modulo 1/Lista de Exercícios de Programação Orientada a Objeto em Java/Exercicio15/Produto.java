package Exercicio15;

public class Produto {
    // Atributos
    private String name;
    private double price;
    private int qtd;

    // Métodos

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQtd() {
        return qtd;
    }

    public void showDetails() {
        System.out.println("Nome do Produto: " + getName());
        System.out.println("Preço: R$" + getPrice());
        System.out.println("Quantidade: " + getQtd() + "\n");
    }
}
