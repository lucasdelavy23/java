package Exercicio18;

import java.util.ArrayList;

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

    public double calculateTotalValue() {
        double totalValue = getPrice() * getQtd();
        return totalValue;
    }

    public static boolean stockSearch(ArrayList<Produto> stock, String search) {

        boolean find = false;

        for (int i = 0; i < stock.size(); i++) {
            Produto current = stock.get(i);
            if (current.getName().equalsIgnoreCase(search)) {
                current.showDetails();
                find = true;
                break;
            }
        }
        return find;
    }
}
