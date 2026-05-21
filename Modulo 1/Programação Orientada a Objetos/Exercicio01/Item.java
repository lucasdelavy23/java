public class Item {

    String name;
    double value;
    int qtd;

    void description() {
        System.out.println("Item name: " + this.name);
        System.out.printf("Item value: %.2f", this.value);
        System.out.println("\nItem quantity: " + this.qtd);
        System.out.printf("Item total value: %.2f", total_value());
    }

    double total_value() {
        return this.value * this.qtd;
    }

    void apply_discount(double discount) {
        if (discount < 0 | discount > 100) {
            System.out.println("Desconto inválido.");
            return;
        }
        this.value -= this.value * (discount / 100);
        
    }
}