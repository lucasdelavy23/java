package Exercicio26;

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
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Preço inválido.");
        }
    }

    public void setQtd(int qtd) {
        if (qtd >= 0) {
            this.qtd = qtd;
        } else {
            System.out.println("Quantidade inválida.");
        }
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

}
