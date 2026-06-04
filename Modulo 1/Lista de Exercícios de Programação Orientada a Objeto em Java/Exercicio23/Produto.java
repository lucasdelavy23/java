package Exercicio23;

public class Produto {

    // Atributos
    String name;
    double price;
    int qtd;

    // Metodos

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
        this.qtd = 0;
    }

    public Produto(String name, double price, int qtd) {
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }

    public void showDetails() {
        System.out.println("Nome do Produto: " + this.name);
        System.out.println("Preço do Produto: " + this.price);
        System.out.println("Quantidade: " + this.qtd);
    }
}
