public class Main {
    public static void main(String[] args) {
        // Atributos
        Item item1 = new Item();

        item1.name = "Batata";
        item1.value = 4.5;
        item1.qtd = 20;

        // Métodos
        item1.description();

        item1.apply_discount(20);

        item1.description();
    }
}